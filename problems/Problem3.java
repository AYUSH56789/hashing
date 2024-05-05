import java.util.HashSet;

public class Problem3 {
    // overall time comaplexcity is O(N) -> where N is the number of elements
    // overall space comaplexcity is O(N) -> where N is the number of key in the set data structure
    public static int solution(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for (Integer item : arr) {
            set.add(item);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        System.out.println(solution(arr));
    }
}
/*
 * problem: count distinct number from the given array?
 * input: arr[]={4,3,2,5,6,7,3,4,2,1}  output: 7
 */