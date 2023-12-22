
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        String [] result = new String [t.length() + 1];
        for (int j = 0; j <= t.length(); ++j) {
            result[j] = "";
        }

        for (int i = 0; i <= s.length(); ++i) {
            for (int j = 0; j <= t.length(); ++j) {

                if (i - 1 >= 0 && j - 1 >= 0) {
                    int newLength = result[j - 1].length()
                             + (s.charAt(i - 1) == t.charAt(j - 1) ? 1 : 0);
                    if (result[j].length() < newLength) {
                        result[j] = result[(j - 1)] +
                                (s.charAt(i - 1) == t.charAt(j - 1)
                                        ? String.valueOf(s.charAt(i - 1))
                                        : ""
                                );
                    }
                }
//                if (i - 1 >= 0) {
//                    if (result[i][j].length() <= result[(i - 1)][j].length()) {
//                        result[i][j] = result[(i - 1)][j];
//                    }
//                }
                if (j - 1 >= 0) {
                    if (result[j].length() < result[(j - 1)].length()) {
                        result[j] = result[(j - 1)];
                    }
                }
            }
        }
        System.out.println(result[t.length()]);
    }
}
