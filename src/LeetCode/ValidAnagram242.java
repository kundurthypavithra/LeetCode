package LeetCode;

import java.util.HashMap;

//Easiest approach : sort and then compare two strings
//Alternate to the same solution create on more map for second string and compare the counts of each char in both maps it should be same
//something I didn't understand : increment and decrement the count of chars of two strings at a time.
public class ValidAnagram242 {
    static boolean validAnagram(String p, String q){
        if (p.length()!= q.length()){
            return false;
        }
        HashMap<Character, Integer> pMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++){
            pMap.merge(p.charAt(i), 1, Integer::sum);
        }

        for (int i = 0; i < p.length(); i++){
            if (!pMap.containsKey(q.charAt(i))||pMap.get(q.charAt(i)) == 0 ){
                return false;
            }
            pMap.put(q.charAt(i), pMap.get(q.charAt(i)) - 1);
        }
        return  true;
    }

    public static void main(String[] args){
        System.out.println(validAnagram("anagram", "nagaram"));
        System.out.println(validAnagram("rat", "car"));
    }
}
