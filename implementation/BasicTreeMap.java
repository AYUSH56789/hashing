import java.util.TreeMap;

public class BasicTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> thm=new TreeMap<>();
        // adding elements ->O(logN)
        thm.put("John",35);
        thm.put("ayush",50);
        thm.put("rehan",60);
        thm.put("dhruv",100);
        thm.put("ansul",40);

        // print TreeMap 
        System.out.println(thm);
        
        // get value by giving key ->O(logN)
        System.out.println(thm.get("ayush"));
        
        // remove by giving key ->O(logN)
        System.out.println(thm.remove("ayush"));
        
        // containsKey -> O(logN)
        System.out.println(thm.containsKey("ayush"));

        // size(), isEmpty() -> O(1)

        // clear(), keySet() -> O(n)
        
        System.out.println(thm);
        
    }
}

// output

