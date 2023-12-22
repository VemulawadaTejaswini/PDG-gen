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
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        char[] arr;
        int p = 2019;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            arr = sc.next().toCharArray();
            long numMultiples = 0;
            long[][] memo = new long[2][p];
            int idx = 1;
            long ans = 0;
            for (int i = 0; i < arr.length; i++) {
                int nxt = 1 - idx;
                Arrays.fill(memo[idx], 0);
                for (int mod = 0; mod < p; mod++) {
                    int nmod = mod * 10;
                    nmod += arr[i] - '0';
                    nmod %= p;
                    memo[idx][nmod] += memo[nxt][mod];
                }
                memo[idx][arr[i] % p]++;
                ans += memo[idx][0];
                idx = nxt;
            }
            pw.println(ans);
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

    }
}

