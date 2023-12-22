import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String word = scanner.nextLine();
        boolean found = false;
        int startofWord = -1;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!found && (str.charAt(i) == '?' || str.charAt(i) == word.charAt(0))) {
                if (str.length() - i < word.length()) {
                    System.out.println("UNRESTORABLE");
                    return;
                }
                found = true;
                for (int j = i + 1; j < str.length() && (j - i) < word.length(); j++) {
                    if (str.charAt(j) != '?' && str.charAt(j) != word.charAt(j - i)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    output.append(word);
                    i += word.length() - 1;
                } else if (str.charAt(i) == '?') {
                    output.append('a');
                } else {
                    output.append(str.charAt(i));
                }
            } else if (str.charAt(i) == '?') {
                output.append('a');
            } else {
                output.append(str.charAt(i));
            }
        }
        System.out.println(output.toString());
    }
}