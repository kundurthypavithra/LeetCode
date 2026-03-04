package LeetCode;

//LongestCommonPrefix - https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=array
public class LongestCommonPrefix {

    //This method is having a
    // Time complexity - O(N*M)

    public static void main(String[] args) {
        //String[] strs = {"flower","flow","flight"};
        //String[] strs = {"dog","racecar","car"};
        String[] strs = {"interview", "internet", "internal", "interval"};

        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        if (prefix.isEmpty()){
            System.out.println("There is no matching prefix");
        }
        System.out.println(prefix);
    }
}
