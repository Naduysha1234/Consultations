package MVPConsultation.backend;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by user on 09.02.2016.
 */
public class BD {

    static final String url = "jdbc:mysql://localhost:3306/testjava";
    static final String name = "root";
    static final String password = "1234";


    public static Connection getConnection()throws SQLException {

        try{
            DriverManager.registerDriver((Driver) Class.forName("com.mysql.jdbc.Driver").newInstance());

            Connection connection = DriverManager.getConnection(url,name, password);
            return connection;
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
