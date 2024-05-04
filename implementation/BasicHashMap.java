import java.util.HashMap;

public class BasicHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        // adding elements ->O(1)
        hm.put("John",35);
        hm.put("ayush",50);
        hm.put("rehan",60);
        hm.put("dhruv",100);
        hm.put("ansul",40);

        // print hashmap 
        System.out.println(hm);
        
        // get value by giving key ->O(1) 
        System.out.println(hm.get("ayush"));
        
        // remove by giving key ->O(1)
        System.out.println(hm.remove("ayush"));
        
        // containsKey -> O(1)

        // size(), isEmpty() -> O(1)

        // keySet() -> O(1)

        // clear() -> O(n)
        
        System.out.println(hm);
        
    }
}

// output
