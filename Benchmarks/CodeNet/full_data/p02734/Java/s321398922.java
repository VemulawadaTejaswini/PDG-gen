import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.*;


import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 998244353;


    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int s = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        long[][] dp = new long[n + 1][s + 1];
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = s; j > 0; j--) {
                if (j >= a[i]) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - a[i]]) % mod;
                    if (j == a[i]) {
                        dp[i][j] = (dp[i][j] + i) % mod;
                    }
                    if (j == s) {
                        ans = (ans + dp[i][j] * (n - i + 1) % mod) % mod;
                    }
                    //out.println(ans + " " + i + " " + j);
                }
                dp[i][j] = (dp[i][j] + dp[i - 1][j]) % mod;
            }
        }
        out.println(ans);
    }

}



class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
