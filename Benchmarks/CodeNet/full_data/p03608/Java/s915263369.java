import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

    int N,M,R;
    int[] r;

    long[][] G;

    public void solve() {
        N = nextInt();
        M = nextInt();
        R = nextInt();

        r = new int[R];
        for(int i = 0;i < R;i++){
            r[i] = nextInt()-1;
        }

        G = new long[N][N];
        for(int i = 0;i < N;i++){
            for(int j = 0;j < N;j++){
                G[i][j] = Integer.MAX_VALUE;
            }
        }

        for(int i = 0;i < M;i++){
            int a = nextInt()-1;
            int b = nextInt()-1;
            int c = nextInt();

            G[a][b] = c;
            G[b][a] = c;
        }

        for(int i = 0;i < N;i++){
            for(int j = 0;j < N;j++){
                for(int k = 0;k < N;k++){
                    G[j][k] = Math.min(G[j][k],G[j][i]+G[i][k]);
                }
            }
        }

        long[][] dp = new long[1 << R][R];
        for(int i = 0;i < 1 << R;i++){
            for(int j = 0;j < R;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[0][0] = 0;
        for(int i = 0;i < R;i++){
            dp[1<<i][i] = 0;
        }

        for(int i = 0;i < 1 << R;i++){
            for(int j = 0;j < R;j++){
                if(((i>>j)&1) == 0)continue;
                for(int k = 0;k < R;k++){
                    if(((i>>k)&1) == 1)continue;
                    dp[i | (1 << k)][k] = Math.min(dp[i | (1 << k)][k],dp[i][j] + G[r[j]][r[k]]);
                }
            }
        }

        long ans = Integer.MAX_VALUE;
        for(int i = 0;i < R;i++){
            ans = Math.min(ans,dp[(1 << R) - 1][i]);
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
    private final byte[] buffer = new byte[2048];
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