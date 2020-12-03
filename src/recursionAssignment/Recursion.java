package recursionAssignment;

public class Recursion {

  public static int count8(int intNumber) {

    if (intNumber < 10) {
      if (intNumber == 8) {
        return 1;
      }
      else {
        return 0;
      }
    }

    else if (intNumber % 10 == 8) {
      return 1 + count8(intNumber / 10);
    }

    else {
      return count8(intNumber / 10);
    }

  }

}
