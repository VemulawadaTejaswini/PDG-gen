import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    private static final int MOD = (int)1e9 + 7;
    int N,M,K;

    private long modPow(long x,long y, int mod) {
        if (y == 0) {
            return 1;
        }
        if (y == 1) {
            return x;
        }
        if (y % 2 == 0) {
            long z = modPow(x, y / 2, mod);
            return z * z % mod;
        } else {
            return modPow(x, y - 1, mod) * x % mod;
        }
    }

    private long nCk(int n,int k,int MOD)
    {
        long a = 1;
        for(int i = 0;i < k;i++)
        {
            a *=  (n - i);
            a %= MOD;
        }

        long b = 1;
        for(int i = k;i >= 2;i--){
            b *= i;
            b %= MOD;
        }
        return (a * modPow(b,MOD - 2,MOD) % MOD) % MOD;
    }

    private void solve() {
        N = nextInt();
        M = nextInt();
        K = nextInt();

        long ansX = 0;
        for(int i = 1;i < M;i++) {
            long pattern = i * (M - i) % MOD;
            ansX += pattern % MOD;
            ansX %= MOD;
        }
        ansX *= N * N % MOD;
        ansX *= nCk(N * M - 2,K - 2, MOD);
        ansX %= MOD;

        long ansY = 0;
        for(int i = 1;i < N;i++) {
            long pattern = i * (N - i) % MOD;
            ansY += pattern % MOD;
            ansY %= MOD;
        }

        ansY *= M * M % MOD;
        ansY *= nCk(N * M - 2,K - 2, MOD);
        ansY %= MOD;

        long ans = (ansX + ansY) % MOD;
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
