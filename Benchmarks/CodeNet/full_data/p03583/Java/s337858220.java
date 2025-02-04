import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        long N = in.i();
        for (int h = 1; h < 3501; h++) {
            for (int n = 1; n < 3501; n++) {
                long a = 4 * h * n - N * (h + n);
                if (a > 0) {
                    long b = N * h * n;
                    if (b % a == 0) {
                        long w = b / a;
                        System.out.printf("%d %d %d\n", h, n, w);
                        return;
                    }
                }
            }
        }
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
        for (i = 0; i <= cbuf.length; i++) {
            if ((c = next()) == ' ' || c == '\n') break;
            cbuf[i] = c;
        }
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
