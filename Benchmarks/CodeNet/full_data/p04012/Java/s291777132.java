import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter prnt = new PrintWriter(System.out);
        Map<Character, Integer> ocur = new HashMap<>();

        String word = read.readLine();

        for (int i = 0; i < word.length(); i++) {
            int freq = ocur.getOrDefault(word.charAt(i), 0);
            freq++;
            ocur.put(word.charAt(i), freq);
        }
        boolean yes = true;
        for (int i = 0; i < word.length(); i++) {
            if (ocur.get(word.charAt(i)) % 2 != 0) {
                prnt.println("No");
                yes = false;
                break;
            }
        }
        if (yes) prnt.println("Yes");
        prnt.close();
    }
}