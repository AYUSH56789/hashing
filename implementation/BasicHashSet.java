import java.util.HashSet;

public class BasicHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        // adding elements ->O(1)
        hs.add(35);
        hs.add(50);
        hs.add(60);
        hs.add(100);
        hs.add(40);
        hs.add(35);
        hs.add(50);

        // print hashsap 
        System.out.println(hs);
        
        // remove by giving key ->O(1)
        System.out.println(hs.remove(90));
        
        // contains -> O(1)
        System.out.println(hs.contains(40));
        
        // size(), isEmpty() -> O(1)
        System.out.println(hs.size());
        
        // isEmpty() -> O(1)
        System.out.println(hs.isEmpty());
        
        // clear() -> O(n)
        hs.clear();
        
        System.out.println(hs);
        
    }
}

/*
input:
[50, 35, 100, 40, 60]
false
true
5
false
[]
 */