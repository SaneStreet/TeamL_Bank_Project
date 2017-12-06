

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DB_Connector {

    //    declare a connection
    private static Connection con = null;
    //    declare JDBC driver
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //    private static String db = "ThisDatabase";
    //    the url = jdbc:dbms://host name:port#/db name
//    private static String url = "jdbc:mysql://localhost:3306/ThisDatabase";
    private static String url = "jdbc:mysql://localhost:3306/";
    //    declare user name and password

    //    private static String usr, pswrd;
    private static String usr = "root";
    private static String pswrd = "root";

    private static MysqlDataSource dataSource = new MysqlDataSource();

    //		 Create the connection method
    public static Connection connect(){
        System.out.println("--Connecting to MySQL JDBC--");

//    Locate MySQL JDBC Driver
        try{
            Class.forName(DRIVER);
            System.out.println("\n--MySQL JDBC Driver registered--");
        }
//    Catch exceptions if JDBC is not found
        catch(ClassNotFoundException ex){
            System.out.println("\n--JDBC is missing--");
            ex.printStackTrace();
        }
//    Connect to MySQL DB = URL, usrName, pswrd


        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setURL("jdbc:mysql://localhost:3306/testdb");

        try{

            con = dataSource.getConnection();
//                con = DriverManager.getConnection(url, usr, pswrd);
            System.out.println("\n--Connecting to MySQL--");

        }
//    Catch exceptions on connection error
        catch(SQLException ex){
            System.out.println("\n--Did not connect - try again--");
            ex.printStackTrace();
        }
//    if connection successful
        if(con != null){
            System.out.println("\n--Connection successful--");
        }
//    if connection fails
        else{
            System.out.println("\n--Connection failed--");
        }
        return con;
    }

    /*public boolean checkLogin(String username, String password) {
        boolean check = false;

       try {

            if(username.equals(usr) && password.equals(pswrd)) {

                check = true;
                System.out.println("\n--YooHoo!!!--");
            }

            if (check == false) {
                System.out.println("\n--no good--");
            }
        } catch (Exception e) {
             TODO Auto-generated catch block
            e.printStackTrace();
            return check;
        }
        return check;
    }*/
}
