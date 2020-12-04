package recursionAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

/**
* Test file for Recursion.java
* @author S.Liu
*
*/ 
public class RecursionTest {

    // Test that checks the base case
    @Test
    public void Test1_1() {
      assertEquals(0, Recursion.count8(0));
    }

    // Test that checks for a single 8
    @Test
    public void Test1_2() {
      assertEquals(1, Recursion.count8(8));
    }

    // Test that checks for multiple 8's
    @Test
    public void Test1_3() {
      assertEquals(4, Recursion.count8(8888));
    }

    // Test that includes 8 and non 8 digits
    @Test
    public void Test1_4() {
      assertEquals(1, Recursion.count8(80));
    }
    
    // Tests a complex case 
    @Test 
    public void Test1_5() {
      assertEquals(3, Recursion.count8(809788231));
    }


    @Test
    public void Test2_1() {
      assertEquals("", Recursion.endX(""));
    }

    @Test
    public void Test2_2() {
      assertEquals("x", Recursion.endX("x"));
    }
    
}
