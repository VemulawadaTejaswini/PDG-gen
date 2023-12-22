import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int H = in.i();
        int W = in.i();
        boolean[][] a = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                a[i][j] = (in.i() & 1) == 1;
            }
        }

        int[] ans = new int[4 * (H * W - 1)];
        int n = 0;

        int i = 0;
        int j = 0;
        int dj = 1;
        while (true) {
            int i2 = i;
            int j2 = j + dj;
            if (i2 == H - 1 && (j2 == -1 || j2 == W)) {
                break;
            } else if (a[i][j]) {
                if (j2 == -1 || j2 == W) {
                    i2 = i + 1;
                    j2 = j;
                    dj = -dj;
                }
                ans[n++] = i + 1;
                ans[n++] = j + 1;
                ans[n++] = i2 + 1;
                ans[n++] = j2 + 1;
                a[i2][j2] ^= a[i][j];
                i = i2;
                j = j2;
            } else {
                if (j2 == -1 || j2 == W) {
                    i++;
                    dj = -dj;
                } else {
                    j = j2;
                }
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(n / 4);
        for (i = 0; i < n; i++) {
            out.print(ans[i]);
            out.print((i & 3) == 3 ? '\n' : ' ');
        }
        out.close();
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
