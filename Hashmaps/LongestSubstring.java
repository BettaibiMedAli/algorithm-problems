import java.util.HashSet;
import java.util.Set;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> test = new HashSet<>();
        int max = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            while (test.contains(s.charAt(i))) {
                test.remove(s.charAt(j));
                j++;
            }
            test.add(s.charAt(i));
            max = Math.max(max, i - j + 1);
        }
        
        return max;
    }
}
