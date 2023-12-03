package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
      minPrice = Math.min(minPrice, currentPrice);
      maxProfit = Math.max(maxProfit, currentPrice - minPrice);
    }
    return maxProfit;
  }

  // Contains Duplicate #1 - easy
  public static boolean containsDuplicate(int[] nums) {

    Set<Integer> set = new HashSet<>();
    List<Integer> doublicate = new ArrayList<>();
    for (int num : nums) {
      if (set.contains(num)) {
        doublicate.add(num);
      } else {
        set.add(num);
      }
    }
    return !doublicate.isEmpty();
  }

  // Contains Duplicate #2 easy
  public static boolean containsDuplicate2(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        return true;
      }
    }
    return false;
  }

  // Product of Array Except Self - medium
  public static int[] productExceptSelf(int[] nums) {
    int size = nums.length;

    int[] prefix = new int[size];
    int[] postfix = new int[size];

    int[] result = new int[size];

    int pre_variable = 1;

    for (int i = 0; i < size; i++) {
      prefix[i] = pre_variable;
      pre_variable *= nums[i];
    }

    int post_variable = 1;

    for (int i = size -1; i >= 0; i--) {
      postfix[i] = post_variable;
      post_variable *= nums[i];
    }

    for (int i = 0; i < size; i++) {
      result[i] = prefix[i] * postfix[i];
    }
    return result;
  }
}
