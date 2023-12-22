import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
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
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        SDigitSum solver = new SDigitSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class SDigitSum {
        static int[] arr;
        static int m;
        static int mod = (int) 1e9 + 7;
        static Integer[][][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            String tmp = sc.next();
            arr = new int[tmp.length()];
            for (int i = 0; i < arr.length; i++)
                arr[i] = tmp.charAt(i) - '0';
            m = sc.nextInt();
            memo = new Integer[2][m][arr.length];
            int s = dp(0, 0, 0) % mod - 1;
            pw.println(s);
        }

        private int dp(int idx, int s, int rem) {
            if (idx == arr.length)
                return rem == 0 ? 1 : 0;
            boolean small = s == 1;
            int end = small ? 9 : arr[idx];
            int sum = 0;
            if (memo[s][rem][idx] != null)
                return memo[s][rem][idx];
            for (int i = 0; i <= end; i++) {
                sum += dp(idx + 1, i < arr[idx] ? 1 : s, (rem + i) % m);
                sum %= mod;
            }
            return memo[s][rem][idx] = sum;
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

