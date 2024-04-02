package org.CCristian.Java.JDBC.Repositorio;

import java.util.List;

public interface Repositorio <T>{

/*------------------MÉTODOS------------------*/
    List<T> listar();

    T buscarPorId(Long id);

    void guardar(T t);

    void eliminar(Long id);
}
