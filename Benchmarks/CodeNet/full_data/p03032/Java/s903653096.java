import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int K = in.i();
        int[] V = in.ii(N);

        int lmax = Math.min(K, N);

        int[] minus = new int[K];
        int mi = 0;
        int ans = 0;
        for (int l = 0; l <= lmax; l++) {
            int rmax = K - l;
            for (int r = 0; r <= rmax; r++) {
                mi = 0;
                int t = 0;
                for (int i = 0; i < l; i++) {
                    int v = V[i];
                    if (v < 0) {
                        minus[mi++] = v;
                    }
                    t += v;
                }
                for (int i = 0; i < r; i++) {
                    int v = V[N - 1 - i];
                    if (v < 0) {
                        minus[mi++] = v;
                    }
                    t += v;
                }
                Arrays.parallelSort(minus, 0, mi);
                int returnNum = Math.min(mi, K - l - r);
                for (int i = 0; i < returnNum; i++) {
                    t -= minus[i];
                }
                if (ans < t) {
                    ans = t;
                }
            }
        }
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

    String s() {
        try {
            return readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
