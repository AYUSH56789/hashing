import java.util.ArrayList;
import java.util.HashMap;

public class Problem1 {
    
    // overall time complexity : O(N+M) = O(N) -> Because N is dominating factor in
    // this code. In the worst case M = N than overall time complexity is O(2N)
    // where 2 is constant we remove it . so the time complexity in worst case is
    // O(N)
    // overall space complexity is O(M) to solve this problem.


    public static ArrayList solution(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>(); // it take extra space for storing result array
        HashMap<Integer, Integer> map = new HashMap<>();

        // time complexity : O(N) -> where N is the number of elements in the arr.
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // time complexity : O(M) -> where M is the number of elements in the HashMap.
        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                result.add(key); // in worst case space complexity is O(M)
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // int arr[]={1,3,2,5,1,3,1,5,1};
        int arr[] = { 1, 2 };
        System.out.println(solution(arr));
    }
}

/*
 * problem: Given an Integer array of size n,find all elements that appears more
 * than [n/3] times?
 * input: arr[]={1,3,2,5,1,3,1,5,1} output: [1]
 * input: arr[]={1,2} output:[1,2]
 * 
 */
