import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hsy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = new String("KIHBR");
            char[] As = s.toCharArray();
            int h = 0;
            String str = in.next();
            char[] Astr = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (Astr[i] == 'A') {
                    continue;
                } else if (Astr[i] == As[h]) {
                    h++;
                } else {
                    out.println("NO");
                    return;
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if (Astr[i] == 'K') {
                    if (Astr[i + 1] != 'I') {
                        out.println("NO");
                        return;
                    }
                }
                if (Astr[i] == 'I') {
                    if (Astr[i + 1] != 'H') {
                        out.println("NO");
                        return;
                    }
                }
                if (Astr[i] == 'H') {
                    if (Astr[i + 1] != 'B' && Astr[i + 2] != 'B') {
                        out.println("NO");
                        return;
                    }
                }
                if (Astr[i] == 'B') {
                    if (Astr[i + 1] != 'R' && Astr[i + 2] != 'R') {
                        out.println("NO");
                        return;
                    }
                }
            }
            out.println("YES");
        }

    }
}

