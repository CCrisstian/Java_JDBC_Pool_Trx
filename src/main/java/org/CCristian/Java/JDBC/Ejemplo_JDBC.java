package org.CCristian.Java.JDBC;

import org.CCristian.Java.JDBC.Models.Categoria;
import org.CCristian.Java.JDBC.Models.Producto;
import org.CCristian.Java.JDBC.Repositorio.Categoria_Repositorio_Implement;
import org.CCristian.Java.JDBC.Repositorio.Producto_Repositorio_Implement;
import org.CCristian.Java.JDBC.Repositorio.Repositorio;
import org.CCristian.Java.JDBC.Util.Conexion_BaseDeDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class Ejemplo_JDBC {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()) {
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try {
                Repositorio<Categoria> repositorioCategoria = new Categoria_Repositorio_Implement(conn);
                System.out.println("============= Insertar nueva categoria =============");
                Categoria categoria = new Categoria();
                categoria.setNombre("Electrohogar");
                Categoria nuevaCategoria = repositorioCategoria.guardar(categoria);
                System.out.println("Categoria guardada con éxito: " + nuevaCategoria.getId());

                Repositorio<Producto> repositorio = new Producto_Repositorio_Implement(conn);
                System.out.println("============= listar =============");
                repositorio.listar().forEach(System.out::println);

                System.out.println("============= obtener por id =============");
                System.out.println(repositorio.buscarPorId(1L));

                System.out.println("============= insertar nuevo producto =============");
                Producto producto = new Producto();
                producto.setNombre("Refrigerador Samsung");
                producto.setPrecio(9900);
                producto.setFecha_registro(new Date());
                producto.setSku("abcdefg123");

                producto.setCategoria(nuevaCategoria);
                repositorio.guardar(producto);
                System.out.println("Producto guardado con éxito: " + producto.getId());
                repositorio.listar().forEach(System.out::println);

                conn.commit();
            } catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }
    }
}
