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

    // Problem 1

    // Test that checks the base case, expects 0
    @Test
    public void Test1_1() {
      assertEquals(0, Recursion.count7(0));
    }

    // Test that includes a single 7, expects 1
    @Test
    public void Test1_2() {
      assertEquals(1, Recursion.count7(7));
    }

    // Test that includes multiple 7's, expects 4
    @Test
    public void Test1_3() {
      assertEquals(4, Recursion.count7(7777));
    }

    // Test that includes 7 and non 7 digits, expects 1
    @Test
    public void Test1_4() {
      assertEquals(1, Recursion.count7(70));
    }
    
    // Tests a complex case, expects 4
    @Test 
    public void Test1_5() {
      assertEquals(4, Recursion.count7(709777231));
    }

    // Problem 2

    // Test that checks the base case, expects ""
    @Test
    public void Test2_1() {
      assertEquals("", Recursion.endX(""));
    }

    // Test that includes a single x, expects "x"
    @Test
    public void Test2_2() {
      assertEquals("x", Recursion.endX("x"));
    }

    // Test that includes a single x and another character, expects "ox"
    @Test
    public void Test2_3() {
      assertEquals("ox", Recursion.endX("xo"));
    }

    // Test that includes multiple x's with one other character, expects "ggxx"
    @Test 
    public void Test2_4() {
      assertEquals("ggxx", Recursion.endX("gxgx"));
    }

    // Test that includes multiple x's with many other characters, expects "ofggixx"
    @Test 
    public void Test2_5() {
      assertEquals("ofggixx", Recursion.endX("ofxggxi"));
    }

    // Problem 3

    // Test that checks the base case, expects true
    @Test
    public void Test3_1() {
      assertTrue(Recursion.strCopies("", "", 0));
    }

    // Test where the counter is nonzero, expects false
    @Test
    public void Test3_2() {
      assertFalse(Recursion.strCopies("", "a", 1));
    }

    // Test where the string matches the substring, expects true
    @Test
    public void Test3_3() {
      assertTrue(Recursion.strCopies("a", "a", 1));
    }

    // Test where the string contains other characters, expects true
    @Test
    public void Test3_4() {
      assertTrue(Recursion.strCopies("ab", "a", 1));
    }

    // Test that includes a counter greater than 1, expects false
    @Test
    public void Test3_5() {
      assertFalse(Recursion.strCopies("aabbcac", "a", 4));
    }

    // Test that includes a substring longer than 1 character, expects true
    @Test
    public void Test3_6() {
      assertTrue(Recursion.strCopies("aflkasaflkasalf", "kas", 1));
    }

    // Test that includes overlapping sequences, expects true
    @Test
    public void Test3_7() {
      assertTrue(Recursion.strCopies("afafafa", "afa", 3));
    }
    
}
