import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("My favourite Genre");
        System.out.print("Enter your Name: ");
        String name = input.nextLine();
        System.out.print("Enter your favourite Genre: ");
        System.out.println("1. Action\n2. Tragedy\n3. Drama\n4. Melo-Drama");
        int choice = input.nextInt();
        String genre;
        switch (choice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Tragedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Melo-Drama";
                break;
            default:
                genre = "No Genre";
                break;
        }
         UserProfile userProfile = new UserProfile(name, genre);
        // Display the initial user profile
        System.out.println("User ID: " + userProfile.getUserID());
        System.out.println("Genre: " + userProfile.getGenre());

        // Update the user profile
        userProfile.setGenre("Action");

        // Display the updated user profile
        System.out.println("Updated Genre: " + userProfile.getGenre());
        System.out.println("User Successfully Created");
    }
}