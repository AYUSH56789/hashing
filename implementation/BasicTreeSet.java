import java.util.TreeSet;

public class BasicTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
         // adding elements ->O(logN)
         ts.add(35);
         ts.add(50);
         ts.add(60);
         ts.add(100);
         ts.add(40);
         ts.add(40);
 
         // print TreeMap 
         System.out.println(ts);
         
         // remove by giving key ->O(logN)
         System.out.println(ts.remove(90));
         
         // contains -> O(logN)
         System.out.println(ts.contains(40));
 
         // size() -> O(1)
        System.out.println(ts.size());
        
        // isEmpty() -> O(1)
        System.out.println(ts.isEmpty());
        
        // clear() -> O(n)
        ts.clear();
        
        System.out.println(ts);
         
    }
}
/*
output:
[35, 40, 50, 60, 100]
false
true
5
false
[]
*/
