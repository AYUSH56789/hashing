import java.util.LinkedHashSet;

public class BasicLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer>lhs = new LinkedHashSet<>();
        // adding elements ->O(1)
       lhs.add(35);
       lhs.add(50);
       lhs.add(60);
       lhs.add(100);
       lhs.add(40);
       lhs.add(35);
       lhs.add(50);

        // print hashsap
        System.out.println(lhs);

        // remove by giving key ->O(1)
        System.out.println(lhs.remove(90));

        // contains -> O(1)
        System.out.println(lhs.contains(40));

        // size(), isEmpty() -> O(1)
        System.out.println(lhs.size());

        // isEmpty() -> O(1)
        System.out.println(lhs.isEmpty());

        // clear() -> O(n)
       lhs.clear();

        System.out.println(lhs);

    }
}

/*
output:
[35, 50, 60, 100, 40]
false
true
5
false
[]
 */
