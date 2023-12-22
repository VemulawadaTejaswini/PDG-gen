import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BShiritori solver = new BShiritori();
        solver.solve(1, in, out);
        out.close();
    }

    static class BShiritori {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Set<String> words = new HashSet<>();
            char last = 0;
            for (int i = 0; i < n; i++) {
                String w = in.next();
                if (words.contains(w) || (last > 0 && last != w.charAt(0))) {
                    out.println("No");
                    return;
                }
                words.add(w);
                last = w.charAt(w.length() - 1);
            }
            out.println("Yes");
        }

    }
}

