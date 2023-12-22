import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ADiverseWord solver = new ADiverseWord();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADiverseWord {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String res = recursive(s, 0);
            out.println(res);
        }

        public static String recursive(String s, int num) {
            boolean f = true;
            String suffix = new String();
            for (int i = 0; i < 26; i++) {
                f = f && s.contains(String.valueOf((char) ('a' + i)));
                if (!s.contains(String.valueOf((char) ('a' + i)))) {
                    suffix = String.valueOf((char) ('a' + i));
                    if (--num < 0) {
                        break;
                    }
                }
            }
            if (!f) {
                return s + suffix;
            } else {
                if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
                    return "-1";
                } else {
                    int cut = s.length();
                    for (int i = 0; i < s.length() - 1; i++) {
                        for (int j = i + 1; j < s.length(); j++) {
                            if (s.charAt(i) < s.charAt(j)) {
                                cut = i;
                            }
                        }
                    }
                    return recursive(s.substring(0, cut), 1);
                }
            }
        }

    }
}

