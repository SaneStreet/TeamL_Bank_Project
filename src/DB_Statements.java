import java.sql.*;


public class DB_Statements {
    Statements statements = new Statements();

    //Declare a Statement
    private static Statement stmt = null;
    //Declare a connection
    private static Connection con = DB_Connector.connect();
    //Declare a result set
    private static ResultSet rs = null;
    //Declare a PreparedStatement
    private static PreparedStatement pst = null;

    //Method to use a database
    public void useDB(String DB_Name) {
        //SQL statement
        String query = "USE " + DB_Name;
        try {
            //connection
            stmt = con.createStatement();
            //execute query
            stmt.executeUpdate(query);
            System.out.println("\n--using teaml_bank--");
        } catch (SQLException ex) {
            //Handle SQL exceptions
            System.out.println("\n--Query did not execute--");
            ex.printStackTrace();
        }
    }

    //Method to create an account
    public void createAccount(){
        System.out.println("vi skal starte ");
        statements.set_scene1(1);
    }




    //Method to read data from table


    public void selectFromTable(){
        //SQL query
        String query = "SELECT fNavn, eNavn, konto_Navn, konto_Reg, konto_ID, konto_Saldo FROM person JOIN konti ON Person_ID = fk_Person_ID";

        try {
            //connection
            stmt = con.createStatement();
            //execute query
            rs = stmt.executeQuery(query);
            System.out.println("\nFornavn: \t\tEfternavn: \t\tKonto: \t\tReg.nr: \t\tKontonr.: \t\tSaldo: \n____________________________________");

            //get data
            while (rs.next()){
                String fNavn = rs.getString("fNavn"); //returns fornavn
                String eNavn = rs.getString("eNavn"); //returns efternavn
                String kontoNavn = rs.getString("konto_Navn"); //returns kontonavn
                int kontoReg = rs.getInt("konto_Reg"); //returns kontoreg
                double kontoID = rs.getDouble("konto_ID"); //returns kontoID
                double kontoSaldo = rs.getDouble("konto_Saldo"); //returns kontoSaldo
                System.out.println(fNavn + "\t\t" + eNavn + "\t\t" + kontoNavn + "\t\t" + kontoReg + "\t\t" + kontoID + "\t\t" + kontoSaldo);
            }
        }
        catch (SQLException ex){
            System.out.println("\n--Query did not execute--");
            ex.printStackTrace();
        }

        statements.set_scene1(1);
    }
}
