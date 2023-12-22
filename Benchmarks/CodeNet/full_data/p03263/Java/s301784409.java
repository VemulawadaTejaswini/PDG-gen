import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();
    static int N = 0;
    static StringBuilder ans = new StringBuilder();

    public static void main(String[] args){
        int H = in.i();
        int W = in.i();
        int[][] a = new int[H][];
        for (int i = 0; i < H; i++) {
            a[i] = in.ii(W);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (a[i][j] % 2 == 1) {
                    list.add(((i + 1) << 9) + (j + 1));
                }
            }
        }
        int n = list.size() / 2 * 2;
        for (int i = 0; i < n; i += 2) {
            f(list.get(i), list.get(i + 1));
        }
        out.println(N);
        out.print(ans);
    }

    static void f(int k1, int k2) {
        if (k2 < k1) {
            int t = k1;
            k1 = k2;
            k2 = t;
        }
        int i1 = k1 >> 9;
        int j1 = k1 & ((1 << 9) - 1);
        int i2 = k2 >> 9;
        int j2 = k2 & ((1 << 9) - 1);
        for (int i = i1; i < i2; i++) {
            String s = String.format("%d %d %d %d\n", i, j1, i + 1, j1);
            ans.append(s);
            N++;
        }
        if (j2 < j1) {
            int t = j1;
            j1 = j2;
            j2 = t;
        }
        for (int j = j1; j < j2; j++) {
            String s = String.format("%d %d %d %d\n", i2, j, i2, j + 1);
            ans.append(s);
            N++;
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
