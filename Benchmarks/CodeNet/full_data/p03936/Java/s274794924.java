import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    // MyScanner sc = new MyScanner();
    Scanner   sc    = new Scanner(System.in);
    long      start = System.currentTimeMillis();
    long      fin   = System.currentTimeMillis();
    final int MOD   = 1000000007;
    int[]     dx    = { 1, 0, 0, -1 };
    int[]     dy    = { 0, 1, -1, 0 };

    void run() {
        int H = nextInt();
        int W = nextInt();
        int N = nextInt();
        int K = nextInt();

        PrintWriter out = new PrintWriter(System.out);

        long[][] r = new long[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                out.println("? " + i + " " + j + " " + i + " " + j);
                out.flush();
                r[i][j] = nextInt();
            }
        }
        long res = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                res += r[i][j] * modPow(2, i * W + j, K);
                res %= K;
            }
        }
        out.println("!" + res);
        out.close();
    }

    long modPow(int a, int p, int mod) {
        long base = a;
        long ret = 1;
        while (p > 0) {
            if ((p & 1) == 1) {
                ret = (ret * base) % mod;
            }
            base = (base * base) % mod;
            p >>= 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        out.flush();
        new Main().run();
        out.close();
    }

    /* Input */
    private static final InputStream in     = System.in;
    private static final PrintWriter out    = new PrintWriter(System.out);
    private final byte[]             buffer = new byte[2048];
    private int                      p      = 0;
    private int                      buflen = 0;

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