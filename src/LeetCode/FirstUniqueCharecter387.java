package LeetCode;

import java.util.LinkedHashMap;

public class FirstUniqueCharecter387 {
    static int firstUniqueChar(String s){
        LinkedHashMap<Character,Integer> sMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i = 0;i < s.length(); i++){
            if(sMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(firstUniqueChar("aabb"));
        System.out.println(firstUniqueChar("loveleetcode"));
        System.out.println(firstUniqueChar("leetcode"));
        System.out.println(firstUniqueChar("dddccdbba"));
        System.out.println(firstUniqueChar("cdabcaabb"));
    }
}
