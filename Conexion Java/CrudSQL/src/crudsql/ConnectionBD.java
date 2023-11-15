package crudsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {

    public static Connection getConnection() {
        String cadena = "jdbc:sqlserver://localhost:1433;databaseName=ConectionJava;"
                + "user=sa;password=123;encrypt=true;trustServerCertificate=true";
        try {
            Connection con = DriverManager.getConnection(cadena);
            return con;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
