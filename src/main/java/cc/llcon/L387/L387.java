/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <p>
 * <p>
 * Example 1:
 * Input: s = "leetcode"
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * The character 'l' at index 0 is the first character that does not occur at any other index.
 * <p>
 * <p>
 * Example 2:
 * Input: s = "loveleetcode"
 * <p>
 * Output: 2
 * <p>
 * <p>
 * Example 3:
 * Input: s = "aabb"
 * <p>
 * Output: -1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 105
 * s consists of only lowercase English letters.
 */

package cc.llcon.L387;

public class L387 {
    public static void main(String[] args) {
        String testdata;
        testdata = "leetcode";
        System.out.println(Solution.firstUniqChar(testdata));
        testdata = "loveleetcode";
        System.out.println(Solution.firstUniqChar(testdata));
        testdata = "aabb";
        System.out.println(Solution.firstUniqChar(testdata));

    }
}

class Solution {
    public static int firstUniqChar(String s) {
        boolean hasNoneRepeating = false;

        int[] characterCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            characterCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < characterCount.length; i++) {
            if (characterCount[i] == 1) {
                hasNoneRepeating=true;
                break;
            }
        }

        if (hasNoneRepeating) {
            for (int i = 0; i < s.length(); i++) {
                if (characterCount[s.charAt(i)-'a'] == 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
