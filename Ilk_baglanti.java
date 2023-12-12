

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ilk_baglanti {

    static String username = "root";
    static String password = "Sivasli.58";
    static String url = "jdbc:mysql://localhost:3306/deneme";

    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC sürücüsünü yükle
            connection = DriverManager.getConnection(url, username, password);

            System.out.println(" çalıştı");

        } catch (Exception e) {
            System.out.println("hata aldın "+e);
        }
    }
}
