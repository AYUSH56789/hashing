import java.util.LinkedHashMap;

public class BasicLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        // adding elements ->O(1)
        lhm.put("John",35);
        lhm.put("ayush",50);
        lhm.put("rehan",60);
        lhm.put("dhruv",100);
        lhm.put("ansul",40);

        // print linkedHashMap 
        System.out.println(lhm);
        
        // get value by giving key ->O(1)
        System.out.println(lhm.get("ayush"));
        
        // remove by giving key ->O(1)
        System.out.println(lhm.remove("ayush"));
        
        // containsKey -> O(1)
        System.out.println(lhm.containsKey("ayush"));

        // size(), isEmpty() -> O(1)

        //  keySet() -> O(1)

        // clear() -> O(n)  :-> n denotes to the number of elements inside map
        
        System.out.println(lhm);
        
    }
}

// output