import java.sql.Connection;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //VORES MAIN:
        //Hvor alt skal samles, og fremvises på et sted.
        //Andre Classes skal indsættes heri, hvor vi kan skabe en connection imellem dem.

        //Testing DB_Connector:
        Connection con = DB_Connector.connect();
        DB_Statements stmts = new DB_Statements();

        //statements method to use database
        //stmts.useDB("teaml_bank");

        //statements method to read data
        stmts.selectFromTable();
    }
}
