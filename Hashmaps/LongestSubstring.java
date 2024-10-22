class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder test = new StringBuilder();
        int max = 0;
        int j = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (test.indexOf(String.valueOf(s.charAt(i))) == -1) {
                test.append(s.charAt(i));
            } else {
                max = Math.max(max, test.length());
                
                while (test.indexOf(String.valueOf(s.charAt(i))) != -1) {
                    test.deleteCharAt(0);
                    j++;
                }
                
                test.append(s.charAt(i));
            }
        }
        max = Math.max(max, test.length());
        return max;
    }
}
