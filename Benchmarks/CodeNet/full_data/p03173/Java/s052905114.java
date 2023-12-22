import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

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
        NSlimes solver = new NSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class NSlimes {
        int n;
        int[] arr;
        pair[][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            memo = new pair[n][n];
            pw.println(dp(0, n - 1).r);
        }

        private pair dp(int l, int r) {
            if (l == r)
                return new pair(arr[l], 0);
            if (memo[l][r] != null)
                return memo[l][r];
            pair min = new pair(Long.MAX_VALUE, Long.MAX_VALUE);
            for (int i = l; i < r; i++) {
                pair left = dp(l, i);
                pair right = dp(i + 1, r);
                pair sum = new pair(left.l + right.l, left.r + right.r + left.l + right.l);
                if (sum.r < min.r) {
                    min = sum;
                } else if (sum.r == min.r && sum.l < min.l) {
                    min = sum;
                }
            }
            return min;
        }

        public class pair {
            long l;
            long r;

            public pair(long l, long r) {
                this.l = l;
                this.r = r;
            }

            public String toString() {
                return "pair{" +
                        "l=" + l +
                        ", r=" + r +
                        '}';
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                pair pair = (pair) o;
                return l == pair.l &&
                        r == pair.r;
            }

            public int hashCode() {
                return Objects.hash(l, r);
            }

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

