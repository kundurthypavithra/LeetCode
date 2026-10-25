package LeetCode;

import java.util.HashMap;
//Approach 1 : using hashset and checking its length
//Approach 2 : Sorting the array and checking its next or before elements
public class ContainsDuplicate271 {
    static boolean containsDuplicate(int[] nums){
        HashMap<Integer, Integer> container = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(container.containsValue(nums[i])){
                return true;
            }else{
                container.put( nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
        int[] arr1 = {1,2,3,4};
        System.out.println(containsDuplicate(arr1));

    }
}
