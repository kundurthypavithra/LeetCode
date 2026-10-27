package LeetCode;

import java.util.HashMap;

//Rather creating a new map for stringb we can directly update the count in the aMap
public class RansomNote383 {
    static boolean validRansomNote(String a, String b){
        HashMap<Character, Integer> aMap = new HashMap<>();
        for(int i = 0; i < a.length(); i++){
            if(aMap.containsKey(a.charAt(i))){
                aMap.put(a.charAt(i), aMap.get(a.charAt(i))+1);
            }else {
                aMap.put(a.charAt(i), 1);
            }
        }

        HashMap<Character, Integer> bMap = new HashMap<>();
        for(int i = 0; i < b.length(); i++){
            if(bMap.containsKey(b.charAt(i))){
                bMap.put(b.charAt(i), bMap.get(b.charAt(i))+1);
            }else {
                bMap.put(b.charAt(i), 1);
            }
        }

        for(HashMap.Entry<Character, Integer> entry : aMap.entrySet()){
            char aMapKey = entry.getKey();
            Integer aMapValue = entry.getValue();
            if(bMap.containsKey(aMapKey) && bMap.get(aMapKey) >= aMapValue){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //System.out.println(validRansomNote("anagram", "nagaram"));
        //System.out.println(validRansomNote("aa", "aab"));
        System.out.println(validRansomNote("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }
}
