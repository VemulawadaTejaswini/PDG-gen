import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
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
        HashMap<pair, long[]> memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            memo = new HashMap<>();
            pw.println(dp(0, n - 1)[1]);
        }

        private long[] dp(int l, int r) {
            if (l == r)
                return new long[]{arr[l], 0};
            if (memo.get(new pair(l, r)) != null)
                return memo.get(new pair(l, r));
            long[] min = new long[]{Long.MAX_VALUE, Long.MAX_VALUE};
            for (int i = l; i < r; i++) {
                long[] left = dp(l, i);
                long[] right = dp(i + 1, r);
                long[] sum = new long[]{left[0] + right[0], left[1] + right[1] + left[0] + right[0]};
                if (sum[1] < min[1]) {
                    min = sum;
                } else if (sum[1] == min[1] && sum[0] < min[0]) {
                    min = sum;
                }
            }
            memo.put(new pair(l, r), min);
            return min;
        }

        public class pair {
            int l;
            int r;

            public pair(int l, int r) {
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

