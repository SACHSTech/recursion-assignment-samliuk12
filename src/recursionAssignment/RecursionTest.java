package recursionAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;

import recursionAssignment.Recursion;

public class RecursionTest {
    
    @Before
    public void beforeTest() {
      // some steps to perform before tests are run
    }

    // Test that checks the base case
    @Test
    public void Test1() {
      assertEquals(0, Recursion.count8(0));
    }

    @Test
    public void Test2() {
      assertEquals(1, Recursion.count8(8));
    }

    @After
    public void afterTest() {
      // some steps to perform after tests are run
    }
    
    
}
