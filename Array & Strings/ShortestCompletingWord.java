class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String result = null;
        int[] lpLetters = new int[26];
        for(char ch : licensePlate.toLowerCase().toCharArray())
        {
            if(Character.isLetter(ch))
            {
                lpLetters[ch - 'a']++;
            }
        }
        
        for(String word : words)
        {
            int[] wLetters = new int[26];
            for(char ch : word.toCharArray())
            {
                wLetters[ch - 'a']++;
            }

            boolean test = true;
            for(int i = 0; i < 26; i++)
            {
                if(lpLetters[i] > wLetters[i]) test = false;
            }
            if(test == true &&(result == null || word.length() < result.length() )) result = word;
        }
    
        return result;
    }
}