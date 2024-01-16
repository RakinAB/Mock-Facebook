import java.util.Scanner;
import java.io.PrintWriter;

/**
 * This Program is going to be a Mock Social Media App
 * Program. It consists of CRUD operations using Data Structures
 * and Algorithms.
 */
public class Driver {

    public static void main(String[] args) {
        boolean done = false;   //keeps the loop going
        User currentUser;       //whoever is logged in
        int userCount = 1;

        while(!done){
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to the Mock Social Media Platform");
            System.out.println("================================================================================================\n");
            System.out.println("Please select an option:");
            System.out.println("(A) Log in as Existing User");
            System.out.println("(B) Create an Account");
            System.out.println("(C) Exit");
            String option = scan.nextLine();

            boolean validChoice = false;
            while(!validChoice){
                if(option.equalsIgnoreCase("A")){
                    System.out.println("Log In");
                    validChoice = true;
                }
                else if(option.equalsIgnoreCase("B")){
                    System.out.println("Creating Account");
                    validChoice = true;
                }
                else if(option.equalsIgnoreCase("C")){
                    System.out.println("Leaving");
                    validChoice = true;
                    done=true;
                }
                else{
                    System.out.println("invalid");
                }
            }


        }
       
    }
}