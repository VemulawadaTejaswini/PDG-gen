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
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HGrid1 solver = new HGrid1();
        solver.solve(1, in, out);
        out.close();
    }

    static class HGrid1 {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.nextLine().toCharArray();
            }


            long[][] dp = new long[n][m];
            dp[n - 1][m - 1] = 0;
            for (int i = n - 2; i >= 0; i--) {
                if (grid[i][m - 1] != '#')
                    dp[i][m - 1] = 1;
                else
                    break;
            }

            for (int i = m - 2; i >= 0; i--) {
                if (grid[n - 1][i] != '#')
                    dp[n - 1][i] = 1;
                else {
                    break;
                }
            }

            for (int i = n - 2; i >= 0; i--) {
                for (int j = m - 2; j >= 0; j--) {
                    if (grid[i][j] != '#') {
                        dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                        dp[i][j] %= 1000000007;
                    }
                }
            }
            out.println(dp[0][0]);

        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

