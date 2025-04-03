package cc.llcon.L242;

public class Solution3 {
    /**
     * 因為組成只包含小寫英文字母 所以創建一個長度為26的array 來對應 a~z
     * 直接減去97 即可當數組下標
     * 判斷(組成是否相同)方法同 Solution2
     *
     * @param s 輸入字符串1
     * @param t 輸入字符串2
     * @return 字符串的組成是否相等
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] characterCount = new int[26];

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        // 97 小寫 a  ascii 編碼
        for (int i = 0; i < s.length(); i++) {
            characterCount[sCharArray[i] - 'a']++;
            characterCount[tCharArray[i] - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (characterCount[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
