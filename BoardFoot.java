// import 
import java.util.Scanner;

/**
 * Class Roll Die.
* This program calculates height
* by taking the length and width using 
* a function

* @author  Linh Ho
* @version 1.0
* @since   2020-09-26
*/

public class BoardFoot {

  /**
    * Required javadoc.
  */
  
  public static void main(String[] args) {
    
    // declare variable
    float height;
   
    // call function
    height = calculateBoardFoot();
    
    // print height
    System.out.println("The height is: " + height + " inches");
    
  }

  /**
    * Required javadoc.
  */
  
  public static float calculateBoardFoot() {
    
    // create scanner
    Scanner userInput = new Scanner(System.in);
    
    // declare variable
    float userLength;
    
    // ask for length 
    System.out.println("What is the length?");
    
    // set user's answer
    userLength = userInput.nextFloat();
    
    // declare variable
    float userWidth;
    
    // ask for width
    System.out.println("What is the width?");
    
    // set user's answer
    userWidth = userInput.nextFloat();
    
    // declare variable 
    float height; 
    
    // calculate the height 
    height = 144 / (userLength * userWidth);
    
    return height;
  }
}

