package org.CCristian.Java.JDBC.Util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexion_BaseDeDatos {

    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=America/Argentina/Buenos_Aires";
    private static String user_name = "root";
    private static String password = "sasa";

    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {   /*SINGLETON*/
        if (pool == null){
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(user_name);
            pool.setPassword(password);
            pool.setInitialSize(3);
            pool.setMinIdle(3); /*Cantidad miníma de conexiones inactivas*/
            pool.setMaxIdle(8);/*Cantidad maxima de conexiones inactivas*/
            pool.setMaxTotal(8);
        }
        return pool;
    }

    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
