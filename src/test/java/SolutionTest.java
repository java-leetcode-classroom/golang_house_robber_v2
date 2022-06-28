import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private  Solution sol = new Solution();
  @Test
  void robExample1() {
    assertEquals(3, sol.rob(new int[]{2,3,2}));
  }
  @Test
  void robExample2() {
    assertEquals(4, sol.rob(new int[]{1,2,3,1}));
  }
  @Test
  void robExample3() {
    assertEquals(3, sol.rob(new int[]{1,2,3}));
  }
  @Test
  void robExample4() {
    assertEquals(1, sol.rob(new int[]{1}));
  }
}