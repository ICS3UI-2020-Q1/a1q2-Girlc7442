import java.util.Scanner;

/**
 *This program takes two numbers divides them and tells you the remainder 
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user for the number they want divided
    System.out.println("Please enter your first number (This is the number you want divided):");
    //initialize the users first number
    int userNumber1 = input.nextInt();

    //Ask the user for the number they want to divide by
    System.out.println("Please enter your second number (This is the number you want to divide by):");
    //initialize the users second number
    int userNumber2 = input.nextInt();

    //initializes both the equations for the final number and remainder
    int numberFinal = userNumber1 / userNumber2;
    int remainderFinal =  userNumber1 % userNumber2;

    //displays the final number divided and with the remainder
    System.out.println(userNumber1 + "/" + userNumber2 +" is " + numberFinal + " With a remainder of " + remainderFinal);


  }
}
