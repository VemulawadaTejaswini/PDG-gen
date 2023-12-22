import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        int A = in.i();
        long B = in.i();
        int[] h = in.ii(N);
        Arrays.sort(h);

        int l = 0;
        int r = 1_000_000_000;
        while (l < r) {
            int m = (l + r) / 2;
            // out.printf("m = %d\n", m);
            int tot = m;
            for (int i = N - 1; i >= 0; i--) {
                long c = (h[i] - B * m - 1) / (A - B) + 1;
                // out.printf("h[i] = %d : c = %d\n", h[i], c);
                if (tot < c) {
                    tot = -1;
                    break;
                } else if (c > 0) {
                    tot -= (int)c;
                }
            }
            if (-1 < tot) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        int ans = r;
        out.println(ans);
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
                tail = read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
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
            if (c != ' ' && c != '\n' && c != '\r') {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (true) {
            char c = next();
            if (c != ' ' && c != '\n' && c != '\r') {
                back();
                break;
            }
        }
    }

    char[] s(final int N) {
        skip();
        char[] s = new char[N];
        for (int i = 0; i < s.length; i++) {
            s[i] = next();
        }
        return s;
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
