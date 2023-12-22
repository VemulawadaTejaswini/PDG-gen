import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    private static final int INF = (int)1e9 + 7;

    int A,B,C;

    int[][][] dp;

    private void solve() {
        A = nextInt();
        B = nextInt();
        C = nextInt();

        dp = new int[260][260][260];
        for(int i = 0;i < 260;i++) {
            for(int j = 0;j < 260;j++) {
                for(int k = 0;k < 260;k++) {
                    dp[i][j][k] = INF;
                }
            }
        }

        dp[A][B][C] = 0;
        for(int i = 0;i < 250;i++) {
            for(int j = 0;j < 250;j++) {
                for(int k = 0;k < 250;k++) {
                    dp[i+1][j+1][k] = Math.min(dp[i+1][j+1][k],dp[i][j][k] + 1);
                    dp[i+1][j][k+1] = Math.min(dp[i+1][j][k+1],dp[i][j][k] + 1);
                    dp[i][j+1][k+1] = Math.min(dp[i][j+1][k+1],dp[i][j][k] + 1);
                    dp[i+2][j][k] = Math.min(dp[i+2][j][k],dp[i][j][k] + 1);
                    dp[i][j+2][k] = Math.min(dp[i][j+2][k],dp[i][j][k] + 1);
                    dp[i][j][k+2] = Math.min(dp[i][j][k+2],dp[i][j][k] + 1);
                }
            }
        }

        int ans = INF;
        for(int i = 0;i < 260;i++) {
            ans = Math.min(ans,dp[i][i][i]);
        }

        out.println(ans);
    }
    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[4096];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
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