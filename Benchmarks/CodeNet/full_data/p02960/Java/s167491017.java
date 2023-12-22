import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1, mod = (int) (1e9 + 7);
    static char[] s;
    static int n;
    static int[][] memo;
    static int pow[];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        s = sc.next().toCharArray();
        n = s.length;
        memo = new int[13][n];
        for (int[] a : memo)
            Arrays.fill(a, UNCALC);
        pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++)
            pow[i] = mult(10, pow[i - 1], 13);
        out.println(dp(0, 0));
        out.flush();
        out.close();
    }

    static int mult(long a, int b, int m) {
        return (int) ((a * b) % m);
    }

    static int dp(int rem, int i) {
        if (i == n) return rem == 5 ? 1 : 0;
        if (memo[rem][i] != UNCALC) return memo[rem][i];
        int p = pow[n - 1 - i];
        int cnt = 0;
        if (s[i] != '?') cnt = dp(add(rem, mult(p, s[i] - '0', 13), 13), i + 1);
        else for (int x = 0; x <= 9; x++)
            cnt = add(cnt, dp(add(rem, mult(p, x, 13), 13), i + 1), mod);
        return memo[rem][i] = cnt;
    }

    static int add(int a, int b, int m) {
        int c = a + b;
        if (c >= m) c -= m;
        if (c < 0) c += m;
        return c;
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

        public boolean ready() throws IOException {
            return br.ready();
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