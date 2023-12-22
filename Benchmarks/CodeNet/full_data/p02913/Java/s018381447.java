import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        final String s = scanner.nextLine();

        final int[] max = new int[26];
        Arrays.fill(max, 0);

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            String substr = s.substring(i, Math.min(i + max[idx], s.length()));
            for (int j = i + max[idx]; j < s.length(); j++) {
                substr += s.charAt(j);

                if (s.lastIndexOf(substr) >= i + substr.length()) {
                    max[idx] = Math.max(max[idx], substr.length());
                }
            }
        }
        
        int n = 0;
        for (int i = 0; i < max.length; i++) {
            n = Math.max(max[i], n);
        }

        System.out.println(n);
    }
}