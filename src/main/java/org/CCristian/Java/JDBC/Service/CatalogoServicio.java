package org.CCristian.Java.JDBC.Service;

import org.CCristian.Java.JDBC.Models.Categoria;
import org.CCristian.Java.JDBC.Models.Producto;
import org.CCristian.Java.JDBC.Repositorio.Categoria_Repositorio_Implement;
import org.CCristian.Java.JDBC.Repositorio.Producto_Repositorio_Implement;
import org.CCristian.Java.JDBC.Repositorio.Repositorio;

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
        return null;
    }

    @Override
    public Producto porId(Long id) throws SQLException {
        return null;
    }

    @Override
    public Producto guardar(Producto producto) throws SQLException {
        return null;
    }

    @Override
    public void eliminar(Long id) throws SQLException {

    }

    @Override
    public List<Categoria> listarCategoria() throws SQLException {
        return null;
    }

    @Override
    public Categoria porIdCategoria(Long id) throws SQLException {
        return null;
    }

    @Override
    public Categoria guardarCategoria() throws SQLException {
        return null;
    }

    @Override
    public void eliminarCategoria(Long id) throws SQLException {

    }

    @Override
    public void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException {

    }
}
