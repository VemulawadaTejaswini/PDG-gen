import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int K = in.i();
        HashSet<Integer> xs = new HashSet<>();
        HashSet<Integer> ys = new HashSet<>();
        int[][] zs = new int[N][];

        for (int i = 0; i < N; i++) {
            int x = in.i();
            int y = in.i();
            xs.add(x);
            ys.add(y);
            zs[i] = new int[]{x, y};
        }
        int[] x = new int[xs.size()];
        int t = 0;
        for (int j : xs) {
            x[t++] = j;
        }
        Arrays.sort(x);
        int[] y = new int[ys.size()];
        t = 0;
        for (int j : ys) {
            y[t++] = j;
        }
        Arrays.sort(y);

        int[][] count = new int[x.length + 1][y.length + 1];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                count[i + 1][j + 1] = count[i][j + 1] + count[i + 1][j] - count[i][j] + exists(x[i], y[j], zs);
            }
        }

        long ans = Long.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                for (int k = 0; k < y.length; k++) {
                    for (int h = 0; h < y.length; h++) {
                        int c = count[j + 1][h + 1] - count[i][h + 1] - count[j + 1][k] + count[i][k];
                        if (K <= c) {
                            ans = Math.min(ans, (long)(x[j] - x[i]) * (y[h] - y[k]));
                        }
                    }
                }
            }
        }

        out.println(ans);
    }

    static int exists(int x, int y, int[][] zs) {
        boolean b = false;
        for (int i = 0; i < zs.length; i++) {
            if (zs[i][0] == x && zs[i][1] == y) {
                b = true;
                break;
            }
        }
        return b ? 1 : 0;
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
