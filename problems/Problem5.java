import java.util.Arrays;
import java.util.HashMap;

public class Problem5 {

    public static int[] solution(int n, int x, int[] nums) {

        // create hashmap
        HashMap<Integer, Integer> map = new HashMap<>();

        // assign key and frequency in the hashmap
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= n && nums[i] >= 1)
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        
        // fill nums array with zero
        Arrays.fill(nums,0);

        // use nums array and assign value according to frequency of key
        for (int i=0;i<n;i++) {
            if(map.containsKey(i+1) )
            nums[i]=map.get(i+1);
        }
        
        // return nums array -> frequency array
        return nums;
    }
    public static void main(String[] args) {
        int x = 9;
        int nums[] ={1,3,1,4,2,6,9,10,11};
        int n = nums.length;

        // call solution function
        int arr[] = new int[n];
        arr = solution(n, x, nums);

        // print result ->O(n)
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1+"->"+arr[i]);
        }
    }
}
/*
Problem statement:
You are given an array 'arr' of length 'n' containing integers within the range '1' to 'x'.

Your task is to count the frequency of all elements from 1 to n.

Note:
You do not need to print anything. Return a frequency array as an array in the function such that index 0 represents the frequency of 1, index 1 represents the frequency of 2, and so on.
Example:
Input: ‘n’ = 6 ‘x’ = 9 ‘arr’ = [1, 3, 1, 9, 2, 7]    
Output: [2, 1, 1, 0, 0, 0]
Explanation: Below Table shows the number and their counts, respectively, in the array
Number         Count 
 1                2
 2                1
 3                1
 4                0
 5                0
 6                0
 */