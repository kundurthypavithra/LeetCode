package LeetCode;

import java.util.*;

public class GroupAnagrams49 {
    static List<List<String>> groupAnagrams(String[] stringList){
        HashMap<String, List<String>> sortedMap = new HashMap<>();

        for(String s : stringList){
              char[] sArray = s.toCharArray();
              Arrays.sort(sArray);
              List<String> dupeList = new ArrayList<>();
              dupeList.add(s);
              if(sortedMap.containsKey(String.valueOf(sArray))){
                  sortedMap.get(String.valueOf(sArray)).add(s);
            }else{
                  sortedMap.put(String.valueOf(sArray),dupeList);
              }
        }
        
        List<List<String>> finalString = new ArrayList<>();
        
        for(Map.Entry<String,List<String>> e : sortedMap.entrySet()){
            finalString.add(e.getValue());
        }
        
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
