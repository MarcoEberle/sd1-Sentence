public interface Sentence {

    int words();

    String word(int index);

    Sentence append(String word);

    Sentence strip();

    String toString();

    int chars();

    boolean equals(Object other);

    boolean contains(String word);

    boolean contains(Sentence that);

    Sentence copy();

    Sentence insert(int index, String word);

    Sentence remove(int index);

    Sentence replace(int index, String word);


}
