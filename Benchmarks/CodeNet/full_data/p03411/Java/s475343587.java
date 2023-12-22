import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();

        int[] ab = new int[N + 1];
        for (int i = 0; i < N; i++) {
            ab[i] = (in.i() << 8) + in.i();
        }
        ab[N] = Integer.MAX_VALUE;
        Arrays.sort(ab);

        int[] cd = new int[N];
        Arrays.setAll(cd, i -> (in.i() << 8) + in.i());
        Arrays.sort(cd);

        int[] list = new int[N];
        int size = 0;

        int ans = 0;
        for (int i = 0, j = 0; i < N; i++) {
            int c = cd[i] >> 8;
            int d = cd[i] & (1 << 8) - 1;
            while ((ab[j] >> 8) < c) {
                list[size++] = ab[j++] & (1 << 8) - 1;
            }

            int max = -1;
            int l = -1;
            for (int k = 0; k < size; k++) {
                if (list[k] < d && max < list[k]) {
                    max = list[k];
                    l = k;
                }
            }
            if (l > -1) {
                ans++;
                list[l] = list[--size];
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
