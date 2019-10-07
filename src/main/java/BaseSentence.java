public abstract class BaseSentence implements Sentence {

    private Sentence makeNew() {
        try {
            return getClass().newInstance();
        } catch (final Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public int chars() {
        return 0;
    }

    public boolean contains(String word) {
        return false;
    }

    public boolean contains(Sentence that) {
        return false;
    }

    public Sentence copy() {
        return null;
    }

    public Sentence insert(int index, String word) {
        return null;
    }

    public Sentence remove(int index) {
        return null;
    }

    public Sentence replace(int index, String word) {
        return null;
    }


}
