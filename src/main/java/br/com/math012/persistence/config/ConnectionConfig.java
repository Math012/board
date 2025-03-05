package br.com.math012.persistence.config;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost/board?currentSchema=public";
        String user = "postgres";
        String password = "1998";
        Connection connection = DriverManager.getConnection(url,user,password);
        connection.setAutoCommit(false);
        return connection;
    }
}
