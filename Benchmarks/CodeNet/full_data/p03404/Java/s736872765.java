import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    static int K = 33;
    static int L = K * 2;
    static char[][] s = new char[L][L];

    public static void main(String[] args) {
        int A = in.i();
        int B = in.i();

        init(0, '#');
        init(K, '.');

        color(A, 0, '.');
        color(B, K + 1, '#');

        print();
    }

    static void init(int i0, char c) {
        for (int i = i0, i1 = i0 + K; i < i1; i++) {
            Arrays.fill(s[i], c);
        }
    }

    static void color(int i1, int j0, char c) {
        for (int i = 1, j = j0, k = 0; i < i1; i++, k += 4) {
            if (L <= k) {
                k = (++j & 1) << 1;
            }
            s[j][k] = c;
        }
    }

    static void print() {
        out.print(L);
        out.print(' ');
        out.println(L);
        for (int i = 0; i < L; i++) {
            out.println(s[i]);
        }
        out.flush();
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

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
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
