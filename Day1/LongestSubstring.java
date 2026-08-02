package Day1;
import java.util.HashMap;
public class LongestSubstring {
    public static int longestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int length = 0;
        boolean oddFound = false;
        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddFound = true;
            }
        }
        if (oddFound) {
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        String s = "abcccdd";
        System.out.println(longestSubstring(s));
    }
}