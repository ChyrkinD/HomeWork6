package org.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.experimental.UtilityClass;
import java.sql.Connection;
import java.sql.SQLException;

@UtilityClass
public class Database {
    private static final String DB_URL = "jdbc:postgresql://localhost:5435/home-work-5";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "password";

    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    static {
        config.setJdbcUrl(DB_URL);
        config.setUsername(DB_USER);
        config.setPassword(DB_PASSWORD);
        ds = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
