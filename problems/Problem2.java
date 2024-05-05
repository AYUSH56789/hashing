import java.util.HashMap;

public class Problem2 {

    // overall time complexity is O(N) -> where N is dominnating factor in the this approach.
    // overall spce complexity is O(U) where U is unique number of character from string s.
    public static boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            HashMap<Character, Integer> map = new HashMap<>();

            // time complexity O(N) -> where N is the length of string s;
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }

            // time complexity O(M) -> where M is the length of string t;
            for (int i = 0; i < t.length(); i++) {
                if (map.containsKey(t.charAt(i))) {
                    // remove if key=0
                    if (map.get(t.charAt(i)) == 1) {
                        map.remove(t.charAt(i));
                    } else {
                        map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                    }
                } else {
                    return false;
                }
            }
            return map.isEmpty();
        }
    }

    public static void main(String[] args) {
        // String s="race";
        // String t="care";
        String s = "tulip";
        String t = "lipid";
        System.out.println(solution(s, t));
    }
}

/*
 * problem : Given two string s and t , return true if it is anagram otherwise
 * return false.
 * info: An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically use all the original letter exactly once.
 * input: s="race"   t="care"     output: "True"
 * input: s="heart"  t="earth"    output: "True"
 * input: s="tulip"  t="lipid"    output: "false"
 */
