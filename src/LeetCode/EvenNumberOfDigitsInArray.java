package LeetCode;

//This class works on different approaches to find number of digits in an integer
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1937835368/?source=submission-ac
public class EvenNumberOfDigitsInArray {

    //This approach converts each integer in an array to string to find number of integers
    //Time Complexity : O(N)
    static int evenDigits(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int evenDigits = 0;
        for (int i : arr) {
            if(String.valueOf(i).length()%2 == 0){
                evenDigits++;
            }
        }
        return evenDigits;
    }


    //This approach uses a while loop to count number of digits
    //Time Complexity : O(d) -> depends on integer size
    static int findNumberOfIntegersUsingWhile(int num){
        int count = 0;
        while (num > 0){
           num = num/10;
           count++;
        }
        return count;
    }


    static int numberOfEvenDigits(int[] arr){
        int integersCount = 0;
        for(int i : arr){

            if(findNumberOfIntegersUsingWhile(i)%2 == 0){
                 integersCount++;
            }
        }
        return integersCount;
    }

    //(Most optimized) This approach uses log to the base 10 +1 to find the digits count (dont forget to typecast to int)
    //Time Complexity : O(1)
    static int findingIntegersByLog(int num){
        return (int) (Math.log10(num)+1);
    }
    static int findDigitsByLog(int[] arr){
        int count = 0;
        for(int i : arr){
            if (findingIntegersByLog(i)%2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println("The number of even digits in given array is: "+ evenDigits(arr) );
        System.out.println("The number of even digits in given array using log is: "+ findDigitsByLog(arr) );
        System.out.println("The number of even digits in given array using while is: "+ numberOfEvenDigits(arr) );
    }
}
