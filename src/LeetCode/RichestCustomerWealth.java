package LeetCode;

import java.util.Collections;
import java.util.HashMap;


//This class deals with RichestCustomerWealth problem from leetCode : https://leetcode.com/problems/richest-customer-wealth/?source=submission-ac
//This is checking sum of individual array in a 2d array and fetch the max value
public class RichestCustomerWealth {

    //This approach of mine is actually the worst approach as it deals with traversing through 2d array and traversing through a map
    //The time complexity is O(M*N+M)
    //Space Complexity : O(M)
    static Integer sumOf2DArray(int[][] arr){
        HashMap<Integer,Integer> resultMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum = sum + arr[i][j];
            }
            resultMap.put(i, sum);
        }

        return Collections.max(resultMap.values());
    }

    //This optimized approach here is finding max while loop is still going on where all operations happen in parallel
    // Time Complexity : O(M*N)
    // Space Complexity : O(1)
    static Integer sumOf2DArrayOptimized(int[][] arr){
        int sum = 0;
        for(int[] row : arr){
            int maxWealth = 0;
            for(int column : row){
                maxWealth += column;
            }
            sum = Math.max(maxWealth, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        int[][] arr1 = {{1,5},{7,3},{3,5}};
        System.out.println("Richest Customer's account balance is: "+ sumOf2DArray(arr));
        System.out.println("Richest Customer's account balance is: "+ sumOf2DArrayOptimized(arr));
        System.out.println("Richest Customer's account balance is: "+ sumOf2DArray(arr1));
        System.out.println("Richest Customer's account balance is: "+ sumOf2DArrayOptimized(arr1));

    }
}
