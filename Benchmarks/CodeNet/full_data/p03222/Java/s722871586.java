import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    private static final int MOD = (int) 1e9 + 7;
    ArrayList<Integer> pattern;
    long[][] dp;
    int H,W,K;

    private long dfs(int h,int w) {
        if (h == H) {
            return dp[h][w] = w == K-1 ? 1 : 0;
        }

        if (dp[h][w] != -1) {
            return dp[h][w];
        }


        long ret = 0;
        int x = 0, y = 0, z = 0;
        int ww = w - 1;
        for(int p : pattern) {
            int a = ww >= 0 ? p >> ww & 1 : -1;
            int b = w < W - 1 ? p >> w & 1 : -1;

            if (a == -1 && b == -1) {
                x++;
            } else if (a == -1) {
                if (b == 0) {
                    x++;
                }
                if (b == 1) {
                    y++;
                }
            } else if (b == -1) {
                if (a == 0) {
                    x++;
                }
                if (a == 1) {
                    z++;
                }
            } else {
                if (a == 0 && b == 0) {
                    x++;
                }

                if (a == 0 && b == 1) {
                    y++;
                }

                if (a == 1 && b == 0) {
                    z++;
                }
            }
        }

        ret += dfs(h + 1, w) * x % MOD;
        ret %= MOD;
        if (w + 1 < W) {
            ret += dfs(h + 1, w + 1) * y % MOD;
            ret %= MOD;
        }

        if (w - 1 >= 0) {
            ret += dfs(h + 1, w - 1) * z % MOD;
            ret %= MOD;
        }

        return dp[h][w] = ret;
    }

    private void solve() {
        H = nextInt();
        W = nextInt();
        K = nextInt();

        pattern = new ArrayList<>();
        for(int i = 0;i < 1 << (W - 1);i++) {
            boolean ok = true;
            for(int j = 0;j < W - 2;j++) {
                int k = j + 1;
                if ((i >> j & 1) == 1 && (i >> k & 1) == 1) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                pattern.add(i);
            }
        }

        dp = new long[H + 1][W];
        for(int i = 0;i < H + 1;i++) {
            Arrays.fill(dp[i], -1);
        }

        long ans = dfs(0, 0);

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
