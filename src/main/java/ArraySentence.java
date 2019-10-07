/**
 * This class represents a Sentence made out of an Array.
 * Every ArraySentence has a maximum length of 20 words.
 */
public class ArraySentence extends BaseSentence {

    private final static int MAX_LENGTH = 20;

    private final String[] sentence;

    /**
     * How many words are already "used" from MAX_LENGTH.
     */
    private int usedWords = 0;

    /**
     * Default-Constructor for a new ArraySentence
     */
    public ArraySentence() {
        sentence = new String[MAX_LENGTH];
    }

    /**
     * Method that returns the amount of words in this sentence.
     *
     * @return - Returns a value of how many words are in this sentence.
     */
    public int words() {
        return usedWords;
    }

    /**
     * Method that returns a word in the sentence. If the index is smaller than 0 null gets returned.
     * Also if the index is bigger than or same the amount of words null gets returned.
     *
     * @param index - Index of the word that should be returned.
     * @return - Returns the word at this index.
     */
    public String word(int index) {
        if (index < 0) {
            return null;
        }
        if (index >= words()) {
            return null;
        }
        return getSentence()[index];
    }

    /**
     * Method that appends a word to the end of the sentence.
     * If the sentence is already at its limit an error is thrown.
     * If the word is null, nothing happens and the Sentence will be returned.
     *
     * @param word - String that will be added to the sentence.
     * @return - Returns the Sentence.
     */
    public Sentence append(String word) {
        if (words() >= MAX_LENGTH) {
            throw new RuntimeException("maximum length exceeds");
        }
        if (word.equals(null)) {
            return this;
        }
        getSentence()[words()] = word;
        incrementWords();
        return this;
    }

    /**
     * Method that cuts off the last word.
     * If the word size of the sentence is already 0, nothing gets cut off.
     *
     * @return - Returns this sentence.
     */
    public Sentence strip() {
        if (words() > 0) {
            getSentence()[words()] = null;
            decrementWords();
        }
        return this;
    }

    /**
     * Method that increments the amount of used words.
     */
    private void incrementWords() {
        usedWords++;
    }

    /**
     * Method that decrements the amount of used words.
     */
    private void decrementWords() {
        usedWords--;
    }

    /**
     * Getter that returns the array where the sentence is saved.
     *
     * @return - Returns the sentence.
     */
    public String[] getSentence() {
        return sentence;
    }


}
