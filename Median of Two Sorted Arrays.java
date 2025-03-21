import java.util.Arrays;
import java.lang.System;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.parallelSort(nums);

        final int middleIndex = (nums.length - 1) / 2;
        if (nums.length % 2 == 0) { // Length is even.
            return (nums[middleIndex] + nums[middleIndex + 1]) / 2f;
        } else { // Length is odd.
            return nums[middleIndex];
        }
    }
}
