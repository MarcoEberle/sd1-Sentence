public class Main {
    public static void main(String[] args) {
        StringSentence sentence = new StringSentence();
        sentence.append("Hello");
        sentence.append("World");
        sentence.append("How");
        sentence.append("Is");
        sentence.append("Your");
        sentence.append("Day");
        System.out.println(sentence.words());
        System.out.println(sentence.getSentence());
        System.out.println(sentence.word(3));
        sentence.strip();
        System.out.println(sentence.getSentence());
        StringSentence sentence2 = new StringSentence();
        sentence2.append("Hello");
        sentence2.strip();
        System.out.println(sentence2.getSentence());
    }
}
