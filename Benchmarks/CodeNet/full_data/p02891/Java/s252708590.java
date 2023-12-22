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
        A_ConnectionAndDisconnection solver = new A_ConnectionAndDisconnection();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_ConnectionAndDisconnection {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            long k = in.nextLong();
            int[] groups = new int[s.length];
            int numGroups = 0;
            for (int i = 0; i < s.length; ) {
                int j = i;
                while (j < s.length && s[i] == s[j]) {
                    ++j;
                }
                groups[numGroups++] = j - i;
                i = j;
            }
            groups = Arrays.copyOf(groups, numGroups);
            if (numGroups == 1) {
                out.println(s.length * k / 2);
                return;
            }
            if (s[0] != s[s.length - 1]) {
                long each = 0;
                for (int g : groups) {
                    each += g / 2;
                }
                out.println(each * k);
                return;
            }
            long ans = 0;
            for (int i = 1; i + 1 < numGroups; i++) {
                ans += (groups[i] / 2) * k;
            }
            ans += ((groups[0] + groups[numGroups - 1]) / 2) * (k - 1);
            ans += groups[0] / 2;
            ans += groups[numGroups - 1] / 2;
            out.println(ans);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

