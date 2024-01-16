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

// while(!exit){

//     Scanner scan = new Scanner(System.in);

    
//     System.out.println("Welcome to the Mock Social Media Platform");
//     System.out.println("================================================================================================\n");
//     System.out.println("Please select an option:");
//     System.out.println("(A) Log in as Existing User");
//     System.out.println("(B) Create an Account");
//     System.out.println("(C) Exit");
//     String option = scan.next();

//     boolean loggedIn = false;
//     while(!loggedIn){

//         //Logging in
//         if(option.equalsIgnoreCase("A")){
//             System.out.println("================================================================================================\n");
//             System.out.print("Enter your username: ");
//             loggedIn=true;
//         } 
//         //Account Creation
//         else if(option.equalsIgnoreCase("B")){     
//             String password ="";
//             String email ="";
//             System.out.println("================================================================================================\n");
//             System.out.print("Enter your username (must be 3 characters or more): ");
//             String username = scan.next();
//             System.out.println();

//             //Password Creation
//             boolean validPassword = false;
//             //Password must be confirmed
//             while(!validPassword){
//                 System.out.print("Enter your password (no spaces): ");
//                 String newPassword = scan.next();
//                 System.out.println();

//                 System.out.print("Confirm your password: ");
//                 String confirm = scan.next();
//                 System.out.println();
//                 if(!newPassword.equals(confirm)){
//                     System.out.println("Your passwords do not match, Try again\n");
//                 } else{
//                     validPassword=true;
//                     password = newPassword;
//                 }
//             }
//             System.out.println();

//             System.out.print("Enter your email: ");
//             String newEmail = scan.next();
//             email = newEmail;
//             System.out.println("CREATING ACCOUNT...");
//             User newUser = new User(userCount, username, password, email);

//             System.out.println("Logging into your account!");
//             currentUser = newUser;
//             System.out.println("Have fun!");
            
//         }
//         //Exiting
//         else if (option.equalsIgnoreCase("C")){
//             System.out.println("================================================================================================\n");
//             System.out.println("Goodbye!");
//             scan.close();
//             exit = true;
//         }
//         else{ 
//             System.out.println("Invalid Try Again...");
//             option = scan.next();
//         }
//         }
//     }
// }