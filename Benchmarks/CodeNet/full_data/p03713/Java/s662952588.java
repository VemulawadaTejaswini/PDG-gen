import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        long H = in.i();
        long W = in.i();

        long a = W / 3;
        long b = (W - a) / 2;
        long c = W - a - b;
        long ans = (c - a) * W;

        a = H / 3;
        b = (H - a) / 2;
        c = H - a - b;
        ans = Math.min(ans, (c - a) * H);

        a = H / 2;
        b = H - a;
        for (int i = 1; i < W; i++) {
            long s1 = a * i;
            long s2 = b * i;
            long s3 = (W - i) * H;
            ans = Math.min(ans, max(s1, s2, s3) - min(s1, s2, s3));
        }

        a = W / 2;
        b = W - a;
        for (int i = 1; i < H; i++) {
            long s1 = a * i;
            long s2 = b * i;
            long s3 = (H - i) * W;
            ans = Math.min(ans, max(s1, s2, s3) - min(s1, s2, s3));
        }

        out.println(ans);
    }

    static long max(long a, long b, long c) {
        return Math.max(a, Math.max(b, c));
    }

    static long min(long a, long b, long c) {
        return Math.min(a, Math.min(b, c));
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
