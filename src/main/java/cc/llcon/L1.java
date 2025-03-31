package cc.llcon;

import java.util.Arrays;

public class L1 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 9, 8, 2, 7, 4, 6, 5, 1};
        System.out.println(Arrays.toString(twoSum(a, 8)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Integer tmp = null;

        for (int i = 0; i < nums.length; i++) {
            tmp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == tmp) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}