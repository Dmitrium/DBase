package sample.winfirst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by d.zharenkov on 27.12.2017.
 */
public class DBconnection {
    String user;
    String password;
    public DBconnection(String u, String p){
        user = u;
        password = p;
    }



    public Connection Connect(){
        try{
        String url = "jdbc:mysql://localhost:3306/nd_database?useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
