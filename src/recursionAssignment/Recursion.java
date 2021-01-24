package recursionAssignment;

/**
* A file containing a library of recursion functions
* @author S.Liu
*
*/
public class Recursion {

  /**
  * Takes in an integer and returns the number of 7's
  *
  * @param intNumber The number that is checked
  * @return the number of 7's in the number
  *
  */
  public static int count7(int intNumber) {
    
    // Base case 
    if (intNumber == 0) {
      return 0;
    }

    // If the last digit is a 7, return 1 + the number of 7's in the remaining digits using a recursive call
    else if (intNumber % 10 == 7) {
      // intNumber / 10 simply removes the last digit
      return 1 + count7(intNumber / 10); 
    }

    // If the last digit isn't a 7, return the number of 7's in the remaining digits using a recursive call
    else {
      return count7(intNumber / 10);
    }

  }

  /**
  * Takes in a string and returns a string where all the x's are moved to the back of the string 
  * 
  * @param strWord The inputted string 
  * @return the string with all x's moved to the end 
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

  /**
  * Takes in a string, substring, and number intCount, and determines whether the substring appears at least intCount times in the string
  * 
  * @param strWord The inputted string
  * @param strSubstring The inputted substring that is looked for in the word
  * @param intCount The number of times that the substring must appear in the string
  * @return whether or not the substring appears in the string at least intCount times
  *
  */
  public static boolean strCopies(String strWord, String strSubstring, int intCount) {
    
    // If no instances of substring are necessary, return true
    if (intCount == 0) {
      return true;
    }

    // If the substring is longer than the string and the count isn't 0, return false 
    if (strWord.length() < strSubstring.length()) {
      return false;
    }

    // If the substring is at the front of the word, call the recursive function on the substring starting at index 1 with a decremented counter
    if (strWord.substring(0, strSubstring.length()).equals(strSubstring)) {
      return strCopies(strWord.substring(1), strSubstring, intCount - 1);
    }

    // If the substring is not at the front of the word, call the recursive function on the substring starting at index 1 with the same counter
    return strCopies(strWord.substring(1), strSubstring, intCount);

  }

}