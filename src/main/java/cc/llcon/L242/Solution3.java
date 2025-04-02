package cc.llcon.L242;

public class Solution3 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] characterCount = new int[26];


        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        // 97 小寫 a ascii 編碼
        for (int i = 0; i < s.length(); i++) {
            characterCount[sCharArray[i] - 97]++;
            characterCount[tCharArray[i] - 97]--;
        }

        for (int i = 0; i < 26; i++) {
            if (characterCount[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
