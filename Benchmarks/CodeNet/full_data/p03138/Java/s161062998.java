import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        long K = in.l();
        long[] A = in.ll(N);

        long X = 0;
        for (int d = 39; d >= 0; d--) {
            int c = 0;
            for (int i = 0; i < N; i++) {
                c += (A[i] >> d) & 1;
            }
            X |= c < N - c ? (1L << d) : 0;
        }

        for (int d = 39; d >= 0; d--) {
            long k = (K >> d) & 1;
            long b = (X >> d) & 1;
            if (k == 1 && b == 0) {
                break;
            } else if (k == 0 && b == 1) {
                X ^= 1L << d;
            }
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] ^ X;
        }

        System.out.println(ans);
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

    int i() {
        int k = next() - '0';
        boolean minus = k == -3;
        int n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    long[] ll(final int N) {
        long[] a = new long[N];
        for (int j = 0; j < a.length; j++) a[j] = l();
        return a;
    }

    long l() {
        int k = next() - '0';
        boolean minus = k == -3;
        long n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    char[] s(final int N) {
        char[] s = new char[N];
        for (int i = 0; i < N; i++) {
            s[i] = next();
        }
        next();
        return s;
    }

    public int read(char[] cbuf) {
        int i;
        char c;
        for (i = 0; (c = next()) != ' ' && c != '\n'; i++) cbuf[i] = c;
        return i;
    }

    public String readLine() {
        try {
            return super.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
