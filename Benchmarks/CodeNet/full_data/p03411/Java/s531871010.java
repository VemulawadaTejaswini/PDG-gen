import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();

        int[] ab = new int[N * 2];
        for (int i = 0; i < ab.length; i++) {
            ab[i] = in.i();
        }

        int[] cd = new int[N * 2];
        for (int i = 0; i < cd.length; i++) {
            cd[i] = in.i();
        }

        ArrayList<Integer>[] list = new ArrayList[N];
        Arrays.setAll(list, i -> new ArrayList<>());

        int[] cnt = new int[N];
        for (int i = 0; i < N; i++) {
            int a = ab[i * 2];
            int b = ab[i * 2 + 1];
            for (int j = 0; j < N; j++) {
                int c = cd[j * 2];
                int d = cd[j * 2 + 1];
                if (a < c && b < d) {
                    list[i].add(j);
                }
            }
            list[i].sort((x, y) -> {
                int z = cd[x * 2] - cd[y * 2];
                return z == 0 ? cd[x * 2 + 1] - cd[y * 2 + 1] : z;
            });
            cnt[i] = (list[i].size() << 23) + (a << 15) + (b << 7) + i;
        }
        Arrays.sort(cnt);

        boolean[] used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < cnt.length; i++) {
            int j = cnt[i] & (1 << 7) - 1;
            for (int k : list[j]) {
                if (!used[k]) {
                    used[k] = true;
                    ans++;
                    break;
                }
            }
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
