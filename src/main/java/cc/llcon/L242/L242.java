/**
 * Valid Anagram
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * <p>
 * Output: false
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 * <p>
 * <p>
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
package cc.llcon.L242;

public class L242 {
    public static void main(String[] args) {
        // 測試資料
        String s = "anaagrazm";
        String t = "anzaagram";

        System.out.println("Solution1------------------------");
        System.out.println(Solution.isAnagram(s, t));
        System.out.println("Solution2------------------------");
        System.out.println(Solution2.isAnagram(s, t));
        System.out.println("Solution3------------------------");
        System.out.println(Solution3.isAnagram(s, t));
    }
}




