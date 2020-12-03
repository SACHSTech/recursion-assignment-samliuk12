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

    @Test
    public void Test3() {
      assertEquals(4, Recursion.count8(8888));
    }

    @Test
    public void Test4() {
      assertEquals(1, Recursion.count8(80));
    }
    
    // Tests a complex case 
    @Test 
    public void Test5() {
      assertEquals(3, Recursion.count8(809788231));
    }
    
    @After
    public void afterTest() {
      // some steps to perform after tests are run
    }
    
    
}
