import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        GridDpContest solver = new GridDpContest();
        solver.solve(1, in, out);
        out.close();
    }

    static class GridDpContest {
        int r;
        int c;
        boolean[][] arr;
        int mod = (int) 1e9 + 7;
        int[][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            r = sc.nextInt();
            c = sc.nextInt();
            arr = new boolean[r][c];
            for (int i = 0; i < r; i++) {
                String tmp = sc.next();
                for (int j = 0; j < c; j++)
                    arr[i][j] = tmp.charAt(j) == '.';
            }
            memo = new int[r][c];
            for (int[] x : memo)
                Arrays.fill(x, -1);
            pw.println(dp(0, 0) % mod);
        }

        private int dp(int i, int j) {
            if (i >= r || j >= c || r < 0 || j < 0 || !arr[i][j])
                return 0;
            if (i == r - 1 && j == c - 1)
                return 1;
            if (memo[i][j] != -1)
                return memo[i][j];
            int right = dp(i, j + 1) % mod;
            int down = dp(i + 1, j) % mod;
            return memo[i][j] = (right + down) % mod;
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

