import java.util.Arrays;

public class Class {
    int number;
    String words;
    int[] array;

    public Class(int number, String words, int[] array) {
        this.number = number;
        this.words = words;
        this.array = array;
    }

    @Override
    public String toString() {
        return "Class: " + "\n" +
                "number: " + number + "\n" +
                "words: " + words + "\n" +
                "array: " + Arrays.toString(array);
    }
}
