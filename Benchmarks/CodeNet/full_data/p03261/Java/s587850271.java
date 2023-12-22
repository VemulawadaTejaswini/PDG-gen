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
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC109B solver = new ABC109B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC109B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            String[] arr = new String[N];
            Set<String> set = new HashSet<String>();
            char last = ' ';
            for (int i = 0; i < N; i++) {
                String s = in.next();
                if (set.contains(s)) {
                    out.println("No");
                    return;
                } else {
                    set.add(s);
                }
                if (i == 0) {
                    last = s.charAt(s.length() - 1);
                } else {
                    char nlast = s.charAt(s.length() - 1);
                    if (s.charAt(0) == last) {
                        last = nlast;
                    } else {
                        out.println("No");
                        return;
                    }
                }
            }
            out.println("Yes");
        }

    }
}

