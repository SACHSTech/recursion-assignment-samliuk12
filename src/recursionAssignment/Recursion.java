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

    if (intNumber == 0) {
      return 0;
    }

    else if (intNumber % 10 == 8) {
      return 1 + count8(intNumber / 10); 
    }

    else {
      return count8(intNumber / 10);
    }

  }

}