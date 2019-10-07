public class StringSentence extends BaseSentence {

    private static final char SPACE = ' ';
    private String sentence;
    private int amountOfWords;

    public StringSentence() {
        this.sentence = "";
        this.amountOfWords = 0;
    }

    public int words() {
        return amountOfWords;
    }


    public String word(int index) {
        String indexWord = "";
        int amountOfSpaces = 0;
        boolean ourWord;
        if (index < 0 || index >= words()) {
            return null;
        }
        for (int indexCharacter = 0; indexCharacter < getSentence().length(); indexCharacter++) {
            if (getSentence().charAt(indexCharacter) == SPACE) {
                amountOfSpaces++;
            }
            ourWord = amountOfSpaces == index;
            if (ourWord) {
                indexWord = indexWord.concat(Character.toString(getSentence().charAt(indexCharacter)));
            }
        }
        return indexWord.trim();
    }

    public Sentence append(String word) {
        if (words() == 0) {
            sentence += word;
        } else {
            sentence += " " + word;
        }
        amountOfWords++;
        return this;
    }

    public Sentence strip() {
        if (words() == 0) {
            return this;
        }
        final int lastSpaceIndex = getSentence().lastIndexOf(SPACE);
        if (lastSpaceIndex < 0 || words() <= 1) {
            sentence = "";
        } else {
            sentence = sentence.substring(0, lastSpaceIndex);
        }
        return this;
    }

    public String getSentence() {
        return sentence;
    }


}
