

import java.util.Scanner;

public class Statements {
    //
    private int scene = 1;
    //getter til brug når vi ændre scene




    public int getScene() {
        return scene;
    }

    //til brug i slutningen af alle de metoder der bruges i programmet, den giver muglighed for selv at maneurere rundt
    public int set_scene() {

        Scanner input = new Scanner(System.in);

        scene = input.nextInt();


        return scene;
    }

    public int set_scene1(int scene){

        System.out.println("press enter when you are done");

        Scanner local = new Scanner(System.in);

        String dump = local.next();

        this.scene = scene;

        return scene;
    }

    public void mainMenu(){
        System.out.println("welcome to our bank" +
                "\n ------------------------------------------------" +
                "\n type a number in the () to perform an action" +
                "\n (1) create account (2) deposit money " +
                "\n (3) withdraw money (4) allow negativ saldo" +
                "\n (5) change compound interest (6) watch saldo)" +
                "\n (7) exit program");




        set_scene();

    }



}

