package arrays;

public class Solution1 {

  // two sum - easy
  public static int[] twoSum(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j <= nums.length - 1; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }

  // Best Time to Buy and Sell Stock - easy
  public static int maxProfit(int[] prices) {
    if (prices == null || prices.length <= 1) {
      return 0;
    }

    int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      int currentPrice = prices[i];
      minPrice = Math.min(minPrice, currentPrice); //1
      maxProfit = Math.max(maxProfit, currentPrice - minPrice);
    }
    return maxProfit;
  }
}
