public class Solution {
  public int rob(int[] nums) {
    int total = nums.length;
    if (total == 1) {
      return nums[0];
    }
    return Math.max(robWithRange(nums, 0, total-2), robWithRange(nums, 1, total -1));
  }
  public int robWithRange(int[] nums, int start, int end) {
    int prevTwo = 0;
    int prevOne = nums[end];
    int currentMax = 0;
    for (int robIdx = end -1; robIdx >= start; robIdx--) {
      currentMax = Math.max(nums[robIdx]+ prevTwo, prevOne);
      prevTwo = prevOne;
      prevOne = currentMax;
    }
    return Math.max(prevOne, prevTwo);
  }
}
