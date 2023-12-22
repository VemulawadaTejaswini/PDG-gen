import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    static int N;
    static double[][][] dp;
    static boolean[][][] flag;

    public static void main(String[] args) {
        N = in.i();
        int[] c = new int[4];
        for (int i = 0; i < N; i++) {
            c[in.i()]++;
        }
        dp = new double[c[1] + c[2] + c[3] + 1][c[2] + c[3] + 1][c[3] + 1];
        out.println(f(c[1], c[2], c[3]));
    }

    static double f(int c1, int c2, int c3) {
        if (dp[c1][c2][c3] > 0 || c1 == 0 && c2 == 0 && c3 == 0) return dp[c1][c2][c3];
        double d = 1. / (c1 + c2 + c3);
        double ret = N * d;
        if (c1 > 0) ret += f(c1 - 1, c2, c3) * c1 * d;
        if (c2 > 0) ret += f(c1 + 1, c2 - 1, c3) * c2 * d;
        if (c3 > 0) ret += f(c1, c2 + 1, c3 - 1) * c3 * d;
        return dp[c1][c2][c3] = ret;
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (!isDelimiter(c)) {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (isDelimiter(next()));
        back();
    }

    char[] s(int N) {
        char[] cbuf = new char[N];
        read(cbuf, 0, N);
        return cbuf;
    }

    public int read(char[] cbuf, int off, int len) {
        skip();
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (isDelimiter(c)) {
                break;
            }
            cbuf[i] = c;
        }
        return i;
    }

    boolean isDelimiter(char c) {
        return c == ' ' || c == '\n' || c == '\r';
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}
