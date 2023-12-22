import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            String S = in.next();
            String T = in.next();

            int len = S.length();
            boolean[] ext = new boolean['z' - 'a' + 1];
            for (int i = 0; i < len; i++) {
                int idx = S.charAt(i) - 'a';
                ext[idx] = true;
            }
            char[] cs = new char['z' - 'a' + 1];
            for (int i = 0; i < len; i++) {
                char sa = S.charAt(i);
                char ta = T.charAt(i);
                int ti = ta - 'a';
                if (cs[ti] == 0) {
                    cs[ti] = sa;
                } else if (cs[ti] != sa) {
                    if (ext[ti]) {
                        out.println("No");
                        return;
                    }
                    cs[ti] = ' ';
                }
            }
            out.println("Yes");
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

    }
}

