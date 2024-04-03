package org.CCristian.Java.JDBC.Service;

import org.CCristian.Java.JDBC.Models.Categoria;
import org.CCristian.Java.JDBC.Models.Producto;
import org.CCristian.Java.JDBC.Repositorio.Categoria_Repositorio_Implement;
import org.CCristian.Java.JDBC.Repositorio.Producto_Repositorio_Implement;
import org.CCristian.Java.JDBC.Repositorio.Repositorio;
import org.CCristian.Java.JDBC.Util.Conexion_BaseDeDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CatalogoServicio implements Service{

    private Repositorio<Producto> productoRepositorio;
    private Repositorio<Categoria> categoriaRepositorio;

    public CatalogoServicio() {
        this.productoRepositorio = new Producto_Repositorio_Implement();
        this.categoriaRepositorio = new Categoria_Repositorio_Implement();
    }

    @Override
    public List<Producto> listar() throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()){
            productoRepositorio.setConn(conn);
            return productoRepositorio.listar();
        }
    }

    @Override
    public Producto porId(Long id) throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()){
            productoRepositorio.setConn(conn);
            return productoRepositorio.buscarPorId(id);
        }
    }

    @Override
    public Producto guardar(Producto producto) throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()){
            productoRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            Producto nuevoProducto = null;
            try {
                nuevoProducto = productoRepositorio.guardar(producto);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
            return nuevoProducto;
        }
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()){
            productoRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try {
                productoRepositorio.eliminar(id);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }

    }

    @Override
    public List<Categoria> listarCategoria() throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
            return categoriaRepositorio.listar();
        }
    }

    @Override
    public Categoria porIdCategoria(Long id) throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
            return categoriaRepositorio.buscarPorId(id);
        }
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            Categoria nuevaCategoria = null;
            try {
                nuevaCategoria = categoriaRepositorio.guardar(categoria);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
            return nuevaCategoria;
        }
    }

    @Override
    public void eliminarCategoria(Long id) throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try {
                categoriaRepositorio.eliminar(id);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }

    }

    @Override
    public void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException {
        try (Connection conn = Conexion_BaseDeDatos.getConnection()){
            productoRepositorio.setConn(conn);
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try {
                Categoria nuevaCategoria = categoriaRepositorio.guardar(categoria);
                producto.setCategoria(nuevaCategoria);
                productoRepositorio.guardar(producto);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }
    }
}
