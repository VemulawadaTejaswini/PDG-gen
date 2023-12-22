import java.io.*;
import java.util.*;

public class Main {
    static InputReader in;
    static PrintWriter out;

    public static void main(String[] args) {
        in = new InputReader(); //use it for input
        out = new PrintWriter(System.out); //use it for output
        solve();
        out.close();
    }

    static void solve() {
        int n = in.nextInt();

        int f[] = new int[4];

        for(int i = 0; i < n; i++) {
            int x = in.nextInt();
            f[x]++;
        }

        double dp[][][] = new double[n + 1][n + 1][n + 1];

        for(int c3 = 0; c3 <= n; c3++) { //3
            for(int c2 = 0; c2 <= n; c2++) { //2
                for(int c1 = 0; c1 <= n; c1++) { //1
                    if(c1 + c2 + c3 > n)
                        continue;

                    if(c1 + c2 + c3 == 0)
                        continue;

                    dp[c1][c2][c3] = n;

                    if(c1 > 0)
                        dp[c1][c2][c3] += 1.0 * c1 * dp[c1 - 1][c2][c3];

                    if(c2 > 0)
                        dp[c1][c2][c3] += 1.0 * c2 * dp[c1 + 1][c2 - 1][c3];

                    if(c3 > 0)
                        dp[c1][c2][c3] += 1.0 * c3 * dp[c1][c2 + 1][c3 - 1];

                    dp[c1][c2][c3] /= 1.0 * (c1 + c2 + c3);
                }
            }
        }

        out.println(dp[f[1]][f[2]][f[3]]);
    }
}

class InputReader {
    BufferedReader rd;
    StringTokenizer tk;

    InputReader() {
        rd = new BufferedReader(new InputStreamReader(System.in), 32768);
    }

    public String readLine() {
        try {
            return rd.readLine();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public String read() {
        while (tk == null || !tk.hasMoreTokens()) {
            tk = new StringTokenizer(readLine());
        }

        return tk.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(read());
    }

    public long nextLong() {
        return Long.parseLong(read());
    }

    public double nextDouble() {
        return Double.parseDouble(read());
    }
}