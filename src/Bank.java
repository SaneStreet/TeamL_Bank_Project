import java.sql.Connection;

public class Bank {
    public static void main(String[] args) {
        //Testing DB_Connector:
        Connection con = DB_Connector.connect();
        DB_Statements stmts = new DB_Statements();
        Statements statements = new Statements();
        // if the connection works the rest will execute


        int scene;
        boolean power = true;
        statements.getScene();


        while (power == true) {



            switch (statements.getScene()) {
                case 1:
                    statements.mainMenu();
                    statements.set_scene1(1);
                    statements.getScene();
                    break;
                case 2:
                    stmts.createAccount();
                    statements.set_scene1(1);
                    statements.getScene();
                    break;
                case 3:
                    stmts.selectFromTable();
                    statements.set_scene1(1);
                    statements.getScene();
                    break;


                    //VORES MAIN:
                    //Hvor alt skal samles, og fremvises på et sted.
                    //Andre Classes skal indsættes heri, hvor vi kan skabe en connection imellem dem.


                    //statements method to use database
                    //stmts.useDB("teaml_bank");

                    //statements method to read data

            }
        }
    }
}
