import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int offset = 12800, UNCALC = -1, INF = (int) 1e9;
    static int n, m;
    static boolean memo[][][];
    static int[][] a, b;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        b = new int[n][m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextIntArray(m);
        for (int i = 0; i < n; i++)
            b[i] = sc.nextIntArray(m);
        int N = 2 * offset + 1;
        memo = new boolean[81][81][N];
        memo[n - 1][m - 1][-a[n - 1][m - 1] + b[n - 1][m - 1] + offset] = true;
        memo[n - 1][m - 1][a[n - 1][m - 1] - b[n - 1][m - 1] + offset] = true;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int sum1 = a[i][j] - b[i][j], sum2 = -a[i][j] + b[i][j];
                for (int sum = 0; sum < N; sum++) {
                    int s = sum - sum1;
                    if (s >= 0 && s < N && (memo[i + 1][j][s] || memo[i][j + 1][s]))
                        memo[i][j][sum] = true;
                    s = sum - sum2;
                    if (s >= 0 && s < N && (memo[i + 1][j][s] || memo[i][j + 1][s]))
                        memo[i][j][sum] = true;

                }
            }
        }

        int ans = INF;
        for (int i = 0; i < N; i++)
            if (memo[0][0][i]) ans = Math.min(ans, Math.abs(i - offset));
        out.println(ans);

        out.flush();
        out.close();
    }


    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }


        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }


        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public double[] nextDoubleArray(int n) throws IOException {
            double[] ans = new double[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextDouble();
            return ans;
        }

        public short nextShort() throws IOException {
            return Short.parseShort(next());
        }

    }

}