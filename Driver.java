import java.util.Scanner;
import java.io.PrintWriter;

/**
 * This Program is going to be a Mock Social Media App
 * Program. It consists of CRUD operations using Data Structures
 * and Algorithms.
 */
public class Driver {

    public static void main(String[] args) {
        boolean done = false;           //keeps the loop going
        User currentUser = null;       //whoever is logged in
        int userCount = 1;

        while(!done){
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to the Mock Social Media Platform");
            System.out.println("========================================================================\n");
            System.out.println("Please select an option:");
            System.out.println("(A) Log in as Existing User");
            System.out.println("(B) Create an Account");
            System.out.println("(C) Exit");

            boolean doneMenu = false;
            while(!doneMenu){
                String option = scan.nextLine();
                //Logging in
                if(option.equalsIgnoreCase("A")){
                    System.out.println("========================================================================\n");
                    System.out.println("Log In");
                    doneMenu = true;
                }
                //Creating account
                else if(option.equalsIgnoreCase("B")){
                    String username = "";
                    String password = "";
                    String email = "";

                    System.out.println("========================================================================\n");

                    //Username
                    boolean validName = false;
                    while(!validName){
                        System.out.println("Enter your Username (Must be more than 3 characters): ");
                        String input = scan.next();
                        if((input.length() <= 3)){
                            System.out.println("Invalid Try again");
                        } else{
                            validName = true;
                        }
                    }
                    System.out.println();

                    //Password
                    boolean validPassword = false;
                    while(!validPassword){
                        
                    }
                    doneMenu = true;

                }
                //Leaving
                else if(option.equalsIgnoreCase("C")){
                    System.out.println("========================================================================\n");
                    System.out.println("Leaving");
                    doneMenu = true;
                    done=true;
                }
                else{
                    System.out.println("Invalid Try Again....");
                }
            }


        }
       
    }
}