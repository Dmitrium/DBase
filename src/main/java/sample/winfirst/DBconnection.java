package sample.winfirst;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


//класс для подключения к базе данных


public class DBconnection{
    String user;
    String password;
    public DBconnection(String u, String p){
        user = u;
        password = p;
    }



    public Connection Connect() throws FileNotFoundException {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("resources\\config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = prop.getProperty("URLofDB");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try{
            Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
        } catch (SQLException e) {
                System.out.println(e);
        }
        return null;
    }
}
