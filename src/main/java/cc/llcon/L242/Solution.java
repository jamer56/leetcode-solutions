package cc.llcon.L242;

import java.util.HashMap;

class Solution {
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
