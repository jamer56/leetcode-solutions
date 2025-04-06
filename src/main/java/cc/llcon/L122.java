package cc.llcon;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class L122 {
    public static void main(String[] args) {
        int[] testData;
        testData = new int[]{1, 2, 3, 4, 5, 6};
        log.info("test1 result: {}", Solution.maxProfit(testData));

        testData = new int[]{7, 1, 5, 3, 6, 4};
        log.info("test2 result: {}", Solution.maxProfit(testData));
    }
}

class Solution {
    public static int maxProfit(int[] prices) {
        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i] - prices[i - 1]) > 0) {
                count += prices[i] - prices[i - 1];
            }
        }
        return count;
    }
}