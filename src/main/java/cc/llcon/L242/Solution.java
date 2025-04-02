package cc.llcon.L242;

import java.util.HashMap;

class Solution {
    /**
     * 使用兩個hashMap統計所有字符出現的次數 然後比較兩個hashMap是否相等
     * @param s 輸入字符串1
     * @param t 輸入字符串2
     * @return 字符串的組成是否相等
     */
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> characterHashMap = new HashMap<Character, Integer>();

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            characterHashMap.putIfAbsent(sCharArray[i], 0);
            characterHashMap.compute(sCharArray[i], (k, v) -> v + 1);
            characterHashMap.putIfAbsent(tCharArray[i], 0);
            characterHashMap.compute(tCharArray[i], (k, v) -> v - 1);
        }
        for (Character key : characterHashMap.keySet()) {
            if (characterHashMap.get(key) != 0) {
                return false;
            }
        }

        return true;
    }
}
