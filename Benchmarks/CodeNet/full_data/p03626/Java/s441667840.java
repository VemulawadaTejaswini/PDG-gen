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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] s1 = in.nextLine().toCharArray();
            char[] s2 = in.nextLine().toCharArray();

            if (n == 1) {
                out.println(3);
                return;
            } else if (n == 2) {
                out.println(6);
                return;
            }
            final long mod = 1000000007;
            long ans;
            int start = 0;
            if (s1[0] == s1[1]) {
                ans = 6;
                start = 1;
            } else
                ans = 3;
            for (int i = start; i < n - 1; ) {
                int m;
                if (s1[i] != s1[i + 1] && s2[i] != s2[i + 1] && s1[i] != s2[i] && s1[i + 1] != s2[i + 1]) {
                    m = 3;
                    i += 2;
                } else if (s1[i] == s2[i] && s1[i + 1] == s2[i + 1] && s1[i] != s1[i + 1] && s2[i] != s2[i + 1]) {
                    m = 2;
                    i++;
                } else if (s1[i] != s1[i + 1] && s2[i] != s2[i + 1] && s1[i + 1] == s2[i + 1]) {
                    m = 1;
                    i++;
                } else {
                    m = 2;
                    if (s1[i] == s2[i] && s1[i] != s1[i + 1] && s2[i] != s2[i + 1] && s1[i + 1] != s2[i + 1])
                        i += 2;
                    else
                        i++;
                }

                ans = (ans * m) % mod;
            }

            out.println(ans);
        }

    }

    static class InputReader {
        StringTokenizer st;
        BufferedReader br;

        public InputReader(InputStream is) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            this.br = br;
        }

        public String next() {
            if (st == null || !st.hasMoreTokens()) {
                String nextLine = null;
                try {
                    nextLine = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (nextLine == null)
                    return null;
                st = new StringTokenizer(nextLine);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            String str = null;
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }

    }
}
 