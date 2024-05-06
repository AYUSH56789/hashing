import java.util.HashSet;

public class Problem4 {
    // time complexcity : O(N+M)  ->where N is the length of arr1 & M N is the length of arr2 
    // spcce complexcity : O(N+M)  ->where N is the length of arr1 & M N is the length of arr2 
    public static void solution(int arr1[],int arr2[]){
        HashSet<Integer> arrSet1=new HashSet<>();
        HashSet<Integer> arrSet2=new HashSet<>();
        for (int item : arr1) {
            arrSet1.add(item);
        }
        for (int item : arr2) {
            arrSet2.add(item);
        }
        
        // intersection of two array
        int intersectionCount=0;
        for (int item : arr1) {
            if(arrSet2.contains(item)){
                intersectionCount++;
            }
        }
        System.out.println(intersectionCount);
        
        // union of two array
        System.out.println(arrSet1.size()+arrSet2.size()-intersectionCount);
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        solution(arr1,arr2);
    }
}
