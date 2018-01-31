package sample.winfirst;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//класс для подключения к базе данных


public class DBconnection{
    String user;
    String password;
    public DBconnection(String u, String p){
        user = u;
        password = p;
    }



    public Connection Connect(){

        String url = "jdbc:mysql://localhost:3306/nd_database?useSSL=false";
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
