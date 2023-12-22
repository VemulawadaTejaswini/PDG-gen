import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String s = in.next();
            int n = s.length();
            for (int pos = s.length(); pos >= 0; pos--) {
                for (int i = (pos == n) ? 0 : (s.charAt(pos) - 'a' + 1); i < 26; i++) {
                    String newS = s.substring(0, pos) + (char) ('a' + i);
                    if (diverse(newS)) {
                        out.println(newS);
                        return;
                    }
                }
            }
            out.println(-1);
        }

        private boolean diverse(String newS) {
            char[] c = newS.toCharArray();
            Arrays.sort(c);
            for (int i = 0; i < c.length - 1; i++) {
                if (c[i] == c[i + 1]) {
                    return false;
                }
            }
            return true;
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

