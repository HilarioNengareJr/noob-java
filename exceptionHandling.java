import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        
        // dealing with Java input and checking out try-catch
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Enter an Integer: "); // prompt user for name
            int theInt = scanner.nextInt(); // take integer input
            System.out.println(theInt);
        } 
        catch(InputMismatchException e) {
            System.err.println("This is not an Integer: " + e.getMessage());
        }
        
        // close the portal
        scanner.close();
    }
}
