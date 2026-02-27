package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//This code is for TwoSum
// https://leetcode.com/problems/two-sum/submissions/1932793954/?source=submission-ac
public class TwoSum {

    /*
    This is brute force solution with
    TimeComplexity : O(N^2)
    Space Complexity : O(N)
     */
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i <= nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    int[] result = {i,j};
                    return result;
                }
            }
        }
        return null;
    }
    /*
    This method is optimized with
    Time Complexity : O(N)
    Space Complexity : O(N)
     */
    public static int[] optimizedTwoSum(int[] nums, int target){
        Map<Integer, Integer> searchMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
           int complement = target - nums[i];
           if (searchMap.containsKey(complement)){
               return new int[] {searchMap.get(complement), i};
           }
           searchMap.put(nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(optimizedTwoSum(nums, 9)));
    }
}
