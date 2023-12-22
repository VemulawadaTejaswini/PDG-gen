import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AmbDoc solver = new AmbDoc();
        solver.solve(1, in, out);
        out.close();
    }

    static class AmbDoc {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            char[] t = in.next().toCharArray();
            int pos = -1;
            for (int i = 0; i < s.length; i++) {
                if (canPlace(s, t, i)) {
                    pos = i;
                }
            }
            if (pos == -1) {
                out.println("UNRESTORABLE");
            } else {
                place(s, t, pos);
                for (int i = 0; i < s.length; i++) if (s[i] == '?') s[i] = 'a';
                out.println(new String(s));
            }
        }

        private boolean canPlace(char[] s, char[] t, int pt) {
            if (s.length - pt < t.length) return false;
            for (int i = pt, j = 0; j < t.length; j++, i++) {
                if (s[i] != '?' && s[i] != t[j]) return false;
            }
            return true;
        }

        private void place(char[] s, char[] t, int pt) {
            for (int i = pt, j = 0; j < t.length; j++, i++) {
                s[i] = t[j];
            }
        }

    }

    static class FastReader {
        BufferedReader reader;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

    }
}

