class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(Character.isLetterOrDigit(letter))
            {
                result.append(Character.toLowerCase(letter));
                result2.insert(0,Character.toLowerCase(letter));
            }
        }
        return result.toString().equals(result2.toString());
    }
}