import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int n = in.i();
        long c = in.l();
        long[] x = new long[n + 2];
        int[] v = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            x[i] = in.l();
            v[i] = in.i();
        }
        x[n + 1] = c;

        long sum = 0;
        long[] f = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            sum += v[i] - (x[i] - x[i - 1]);
            f[i] = max(sum, f[i - 1]);
        }
        sum = 0;
        long[] g = new long[n + 2];
        for (int i = n; i > 0; i--) {
            sum += v[i] - (x[i + 1] - x[i]);
            g[i] = max(sum, g[i + 1]);
        }

        sum = 0;
        long ans = 0;
        for (int i = n + 1; i > 0; i--) {
            long xb = c - x[i];
            sum += v[i];
            ans = max(ans, sum - xb * 2 + f[i - 1]);
        }
        sum = 0;
        for (int i = 0; i <= n; i++) {
            long xa = x[i];
            sum += v[i];
            ans = max(ans, sum - xa * 2 + g[i + 1]);
        }
        out.println(ans);
    }

    static long max(long a, long b) {
        return a < b ? b : a;
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
