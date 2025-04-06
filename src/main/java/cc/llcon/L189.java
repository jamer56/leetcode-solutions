//Given an integer array nums, rotate the array to the right by k steps, where
//k is non-negative.
//
//
// Example 1:
//
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//
//
// Example 2:
//
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10⁵
// -2³¹ <= nums[i] <= 2³¹ - 1
// 0 <= k <= 10⁵
//
//
//
// Follow up:
//
//
// Try to come up with as many solutions as you can. There are at least three
//different ways to solve this problem.
// Could you do it in-place with O(1) extra space?
//
//
// Related Topics Array Math Two Pointers 👍 19247 👎 2087
package cc.llcon;

import java.util.Arrays;

public class L189 {
    public static void main(String[] args) {
        // 測試參數
        int[] nums;
        nums = new int[]{1, 2, 3, 4, 5};
        int k = 16;

        // 調用算法
        rotate(nums, k);

        // 顯示結果
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    // 反轉數組工具
    public static void reverse(int[] nums, int from, int to) {
        int tmp = 0;

        for (int i = 0; i < (to - from + 1) / 2; i++) {
            tmp = nums[from + i];
            nums[from + i] = nums[to - i];
            nums[to - i] = tmp;
        }
    }
}
