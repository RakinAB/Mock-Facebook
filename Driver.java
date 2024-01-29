import java.util.Scanner;
import java.io.PrintWriter;

/**
 * This Program is going to be a Mock Social Media App
 * Program. It consists of CRUD operations using Data Structures
 * and Algorithms.
 */
public class Driver {

    public static void main(String[] args) {

        // First create all already existing users from text file

        // User Unteface
        User currentUser = null; // whoever is logged in
        int userCount = 1;
        Scanner scan = new Scanner(System.in);

        boolean done = false; // keeps the loop going
        boolean loggedIn = false;
        while (!done) {

            System.out.println("Welcome to the Mock Social Media Platform");
            System.out.println("========================================================================\n");
            System.out.println("Please select an option:");
            System.out.println("\t(A) Log in as Existing User");
            System.out.println("\t(B) Create an Account");
            System.out.println("\t(C) Exit");

            boolean doneMenu = false;
            while (!doneMenu) {
                String option = scan.nextLine();
                // Logging in
                if (option.equalsIgnoreCase("A")) {
                    System.out.println("========================================================================\n");
                    System.out.println("Log In");
                    doneMenu = true;
                    loggedIn = true;
                }
                // Creating account
                else if (option.equalsIgnoreCase("B")) {
                    String username = "";
                    String password = "";
                    String email = "";

                    System.out.println("========================================================================\n");

                    // Username
                    boolean validName = false;
                    while (!validName) {
                        System.out.print("Enter your Username (Must be more than 3 characters): ");
                        username = scan.next();
                        if ((username.length() <= 3)) {
                            System.out.println("\nInvalid Try again");
                        } else {
                            validName = true;
                        }
                    }
                    System.out.println();

                    // Password
                    boolean validPassword = false;
                    while (!validPassword) {
                        System.out.print("Enter New Password: ");
                        password = scan.next();
                        System.out.println();
                        System.out.print("Confirm New Password: ");
                        String confirm = scan.next();
                        System.out.println();

                        if (password.equals(confirm)) {
                            validPassword = true;
                        } else {
                            System.out.println("Incorrect Match. Try Again\n");
                        }
                    }

                    // Email
                    System.out.print("Enter your email: ");
                    email = scan.next();

                    // Creating User Object
                    System.out.println();
                    System.out.println("========================================================================\n");
                    System.out.println("Creating Account...\n");
                    currentUser = new User(userCount, username, password, email);
                    userCount++;
                    // Add new user to the text file to save login informtion

                    // break out of loop
                    doneMenu = true;
                    loggedIn = true;
                }
                // Leaving
                else if (option.equalsIgnoreCase("C")) {
                    System.out.println("========================================================================\n");
                    System.out.println("Goodbye!");
                    doneMenu = true;
                    done = true;
                } else {
                    System.out.println("Invalid Try Again....");
                }
            }

            if(loggedIn){
                // Account menu
                System.out.println("========================================================================");
                System.out.println("Account Profile:");
                System.out.println("========================================================================");
                System.out.println("UserID: " + currentUser.getUserID());
                System.out.println("Username: " + currentUser.getName());
                System.out.println("Email: " + currentUser.getEmail());
                System.out.println("Username: " + currentUser.getName());
                System.out.println("========================================================================");
                System.out.println("Options");
                System.out.println("\t(A) Home"); // See everyone's Posts
                System.out.println("\t(B) Check My Posts"); // See only user's posts, can create/delete friends or send a DM
                System.out.println("\t(C) Friends"); // Manage Friends, add or delete
                System.out.println("\t(D) Notifications"); // look at notifications
                System.out.println("\t(E) Change Password"); // Change password
                System.out.println("\t(F) Log Out");

                boolean accountOption = false;
                while (!accountOption) {
                    String option = scan.nextLine();

                    // Will output all posts by every user from oldest to newest
                    if (option.equalsIgnoreCase("A")) {

                    }

                    // Will oly show the user's posts from oldest to newest
                    else if (option.equalsIgnoreCase("B")) {

                    }

                    // Output the user's list of friends. Can manage them or send a dm
                    else if (option.equalsIgnoreCase("C")) {

                    }

                    // Output messages and friends requests
                    else if (option.equalsIgnoreCase("D")) {

                    }

                    // prompt the user to change password
                    else if (option.equalsIgnoreCase("E")) {
                        // Standard Security check when changing password
                        System.out.print("Enter Old Password: ");
                        String old = scan.next();
                        if (old.equals(currentUser.getPassword())) {
                            boolean validPassword = false;
                            // creating the new password
                            while (!validPassword) {
                                System.out.print("Enter New Password: ");
                                String newPassword = scan.next();
                                System.out.println();
                                System.out.print("Confirm New Password: ");
                                String confirm = scan.next();
                                System.out.println();

                                if (newPassword.equals(confirm)) {
                                    currentUser.setPassword(newPassword);
                                    validPassword = true;
                                } else {
                                    System.out.println("Incorrect Match. Try Again\n");
                                }
                            }
                        } else {
                            System.out.println("Incorrect Match. Try Again\n");
                        }
                    }
                    // log out and go back to log in menu
                    else if (option.equalsIgnoreCase("F")) {
                        System.out.println("========================================================================");
                        System.out.println("Logging Out\n");
                        accountOption = true;
                        currentUser = null;
                        loggedIn = false;
                        doneMenu = false;
                    } else {
                        System.out.println("Invalid Try Again....");
                    }
                }
            }
        }
        scan.close();
    }
}