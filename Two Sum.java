import java.lang.IllegalArgumentException;

public class Solution {
    public int[] twoSum(final int[] nums, final int target) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("The length of nums cannot be less than 2.");
        }

        for (int i = 0 ; i < nums.length - 1 ; i++) {
            for (int j = i + 1 ; j < nums.length ; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two numbers in num add up to equal target.");
    }
}
