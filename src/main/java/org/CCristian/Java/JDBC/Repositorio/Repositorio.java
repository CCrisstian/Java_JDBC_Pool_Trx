package org.CCristian.Java.JDBC.Repositorio;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repositorio <T>{

/*------------------MÉTODOS------------------*/
    void setConn(Connection conn);

    List<T> listar() throws SQLException;

    T buscarPorId(Long id) throws SQLException;

    T guardar(T t) throws SQLException;

    void eliminar(Long id) throws SQLException;
}
