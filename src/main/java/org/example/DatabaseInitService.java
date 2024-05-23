package org.example;

import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    private static final String INIT_DB_FILE = "src/main/resources/sql/init_db.sql";
    public static void main(String[] args) {
        try (Statement statement = Database.getConnection().createStatement();){
            statement.execute(SQLReader.read(INIT_DB_FILE));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
