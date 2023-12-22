import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AShrinking solver = new AShrinking();
        solver.solve(1, in, out);
        out.close();
    }

    static class AShrinking {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int maxlen = 0;
            for (char i = 'a'; i <= 'z'; i++) {
                maxlen = Math.max(maxlen, f(s, i));
            }
            out.println(s.length() - maxlen);
        }

        int f(String s, char c) {
            // 全てcにするときの最小長さ
            if (s.indexOf(c) == -1) return 0;
            //System.out.println(s + " " + c);
            char[] u = new char[s.length() - 1];
            StringBuilder t = new StringBuilder();
            t.append(String.valueOf(c).repeat(s.length()));
            //System.out.println(s + " " + t.toString());

            if (s.equals(t.toString())) return s.length();
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == c || s.charAt(i + 1) == c) {
                    u[i] = c;
                } else {
                    u[i] = s.charAt(i);
                }
            }
            return f(new String(u), c);

        }

    }
}

