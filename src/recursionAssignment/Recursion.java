package recursionAssignment;

public class Recursion {

  public static int count8(int intNumber) {

    String strNumber;

    strNumber = Integer.toString(intNumber);

    if (strNumber.equals("0")) {
      return 0;
    }

    else {
      return strNumber.length();
    }

  }

}
