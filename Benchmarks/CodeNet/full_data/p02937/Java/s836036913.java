import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String t = in.next();
            int[] sx = new int[26], tx = new int[26];
            s.chars().forEach(c -> sx[c - 'a']++);
            t.chars().forEach(c -> tx[c - 'a']++);
            for (int i = 0; i < 26; i++) {
                if (tx[i] == 0) continue;
                if (sx[i] == 0) {
                    out.println(-1);
                    return;
                }
            }
            int idx = 0;
            int ret = 0;
            int len = s.length();
            for (int i = 0; i < 10000000; i++) {
                if (s.charAt(i % len) == t.charAt(idx)) {
                    idx++;
                    if (idx == t.length()) {
                        ret = i;
                        break;
                    }
                }
            }
            out.println(ret == 0 ? -1 : ret + 1);
        }

    }
}

