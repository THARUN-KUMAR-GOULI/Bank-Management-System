package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection connection;
    Statement stmt;

    public Conn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "admin");
            stmt = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
