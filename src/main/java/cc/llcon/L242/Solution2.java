package cc.llcon.L242;

import java.util.HashMap;

class Solution2 {
    /**
     * 只使用一個hashMap
     * 遍歷 s字符串 字元作為key 使 hashmap中值+1
     * 遍歷 t字符串 字元作為key 使 hashmap中值-1
     * 最後判斷所有key中的值是否為都為0
     * 都為 0 則字符串組成成分相同
     * 任意不為 0 則組成不同
     *
     * @param s 輸入字符串1
     * @param t 輸入字符串2
     * @return 字符串的組成是否相等
     */
    public static boolean isAnagram(String s, String t) throws NullPointerException {
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