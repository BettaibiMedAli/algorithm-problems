public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) return false;
        String[] tab = sentence.split(" ");
        char firstCharacter = tab[0].charAt(0);
        for(int i = 0; i < tab.length - 1; i++)
        {
            if(tab[i].charAt(tab[i].length() - 1) != tab[i+1].charAt(0)) return false;
        }
        return true;
    }
}
