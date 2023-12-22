import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1;
    static final int INF = (int) 1e9;
    static final int mod = (int) (1e9 + 7);

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        int[][] dp = new int[n][k + 1];
        dp[n - 1][0] = 1;
        for (int i = 1; i <= k; i++)
            dp[n - 1][i] += dp[n - 1][i - 1] + (i <= a[n - 1] ? 1 : 0);
        for (int child = n - 2; child >= 0; child--) {
            for (int rem = k; rem >= 0; rem--) {
                long ans = dp[child + 1][rem] - ((rem - a[child] > 0) ? dp[child + 1][rem - a[child] - 1] : 0);
                while (ans < 0) ans += mod;
                dp[child][rem] = (int) (ans % mod);
            }
            for (int i = 1; i <= k; i++)
                dp[child][i] = (dp[child][i] + dp[child][i - 1]) % mod;
        }
        out.println(dp[0][k] - (k > 0 ? dp[0][k - 1] : 0));
        out.flush();
        out.close();

    }


    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        public Scanner(String file) throws Exception {
            br = new BufferedReader(new FileReader(file));
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

        public boolean ready() throws IOException {
            return br.ready();
        }

        public void waitForInput() throws InterruptedException {
            Thread.sleep(3000);
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
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

    }
}