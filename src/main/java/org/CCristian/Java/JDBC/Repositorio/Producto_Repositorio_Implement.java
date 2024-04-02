package org.CCristian.Java.JDBC.Repositorio;

import org.CCristian.Java.JDBC.Models.Categoria;
import org.CCristian.Java.JDBC.Models.Producto;
import org.CCristian.Java.JDBC.Util.Conexion_BaseDeDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Producto_Repositorio_Implement implements Repositorio<Producto> {

/*------------------MÉTODOS------------------*/
    public Connection getConnection() throws SQLException {
        return Conexion_BaseDeDatos.getConnection();
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement
                     .executeQuery("SELECT p.*, c.nombre as categoria FROM productos as p "
                             +"inner join categorias as c ON (p.categoria_id = c.id)"))
        {
            while (resultSet.next()){
                Producto producto = crearProducto(resultSet);
                productos.add(producto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productos;
    }

    @Override
    public Producto buscarPorId(Long id) {
        Producto producto = null;
        try(Connection connection = getConnection();
            PreparedStatement preparedSt = connection.
                prepareStatement("SELECT p.*, c.nombre as categoria FROM productos as p "
                        +"inner join categorias as c ON (p.categoria_id = c.id) WHERE p.id = ?"))
        {
            preparedSt.setLong(1, id);
            try (ResultSet resultSet = preparedSt.executeQuery()) {
                if (resultSet.next()) {
                    producto = crearProducto(resultSet);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) {
        String sql;  /*Plantilla*/
        if (producto.getId() != null && producto.getId()>0) {
            sql = "UPDATE productos SET nombre=?, precio=?, categoria_id=? WHERE id=?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, categoria_id, fecha_registro) VALUES(?,?,?,?)";
        }
        try (Connection connection = getConnection();
             PreparedStatement preparedSt = connection.prepareStatement(sql)){
            preparedSt.setString(1, producto.getNombre());
            preparedSt.setLong(2, producto.getPrecio());
            preparedSt.setLong(3, producto.getCategoria().getId());

            if (producto.getId() != null && producto.getId() > 0) { /*UPDATE*/
                preparedSt.setLong(4, producto.getId());
            } else {    /*INSERT*/
                preparedSt.setDate(4, new Date(producto.getFecha_registro().getTime()));
            }
            preparedSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(Long id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedSt = connection.prepareStatement("DELETE FROM productos WHERE id=?")){
            preparedSt.setLong(1, id);
            preparedSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Producto crearProducto(ResultSet resultSet) throws SQLException {
        Producto producto = new Producto();
        producto.setId(resultSet.getLong("id"));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getInt("precio"));
        producto.setFecha_registro(resultSet.getDate("fecha_registro"));
        Categoria categoria = new Categoria();
        categoria.setId(resultSet.getLong("categoria_id"));
        categoria.setNombre(resultSet.getString("categoria"));
        producto.setCategoria(categoria);
        return producto;
    }
}
