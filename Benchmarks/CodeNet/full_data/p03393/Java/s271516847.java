import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        ArrayList<String> wordsList = new ArrayList<>();
        for (char aChar : chars) {
            wordsList.add(Character.toString(aChar));
        }
        Scanner in = new Scanner(System.in);
        final String word = in.nextLine();

        if (word.equals("zyxwvutsrqponmlkjihgfedcba")) {
            System.out.println("-1");
            return;
        }

        for (char c : word.toCharArray()) {
            wordsList.remove(Character.toString(c));
        }

        if (wordsList.size() == 0) {
            for (int i = 25; i >= 0; --i) {
                wordsList.clear();
                for (int j = i + 1; j < 26; j++) {
                    wordsList.add(Character.toString(word.charAt(j)));
                }
                Collections.sort(wordsList);
                if (wordsList.size() == 0) {
                    continue;
                }
                for (String kouho : wordsList) {
                    String newWord = word.substring(0, i) + kouho;
                    if (largeLeft(newWord.substring(i), word.substring(i))) {
                        System.out.println(newWord);
                        return;
                    }
                }

            }
            System.out.println((char) (word.charAt(0) + 1));
        } else {
            System.out.println(word + wordsList.get(0));
        }
    }

    private static boolean largeLeft(String left, String right) {
        return !left.equals(right) && left.charAt(0) - right.charAt(0) > 0;
    }
}
