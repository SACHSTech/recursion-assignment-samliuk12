package recursionAssignment;

import java.io.*;
/**
* A file containing a library of recursion functions
* @author S.Liu
*
*/
public class Recursion {

  /**
  * Takes in a number and returns the number of 8's
  *
  * @param intNumber The number
  * @return the number of 8's
  */
  public static int count8(int intNumber) {
    
    // Base case 
    if (intNumber == 0) {
      return 0;
    }

    // If the last digit is an 8, return 1 + the number of 8's in the remaining digits
    else if (intNumber % 10 == 8) {
      return 1 + count8(intNumber / 10); 
    }

    // If the last digit isn't an 8, return the number of 8's in the remaining digits
    else {
      return count8(intNumber / 10);
    }

  }

  /**
  * Takes in a string and returns a string where all the x's are moved to the back of the string 
  * 
  * @param strWord The inputted string 
  * @return the string with x's moved to the end 
  *
  */
  public static String endX(String strWord) {
    
    // Base case
    if (strWord.equals("")) {
      return "";
    }

    // Recursive case
    else {
      // If the first letter is an x, call the recursive function on the rest of the characters and add x to the back of that
      if (strWord.charAt(0) == 'x') {
        return endX(strWord.substring(1)) + "x";
      }

      // If the first letter isn't an x, call the recursive function on the rest of the characters and keep the first character at the beginning
      else {
        return strWord.charAt(0) + endX(strWord.substring(1));
      }
    }

  }

}