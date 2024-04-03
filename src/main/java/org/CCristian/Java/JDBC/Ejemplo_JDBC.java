package org.CCristian.Java.JDBC;
import org.CCristian.Java.JDBC.Models.Categoria;
import org.CCristian.Java.JDBC.Models.Producto;
import org.CCristian.Java.JDBC.Service.CatalogoServicio;
import org.CCristian.Java.JDBC.Service.Service;

import java.sql.SQLException;
import java.util.Date;

public class Ejemplo_JDBC {
    public static void main(String[] args) throws SQLException {

        Service servicio = new CatalogoServicio();

        System.out.println("Listar");
        servicio.listar().forEach(System.out::println);

        System.out.println("\nInsertar nueva categoría");
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminación");

        System.out.println("\nInsertar nuevo producto");
        Producto producto = new Producto();
        producto.setNombre("Lámpara led escritorio");
        producto.setPrecio(990);
        producto.setFecha_registro(new Date());
        producto.setSku("abcdefgh12");

        servicio.guardarProductoConCategoria(producto, categoria);
        System.out.println("Producto guardado con éxito: " + producto.getId());
        servicio.listar().forEach(System.out::println);
    }
}
