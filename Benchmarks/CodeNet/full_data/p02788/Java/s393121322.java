import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int D = in.i();
        int A = in.i();

        Monster[] monsters = new Monster[N + 1];
        for (int i = 0; i < N; i++) {
            int x = in.i();
            int h = in.i();
            monsters[i] = new Monster(x, h);
        }
        monsters[N] = new Monster(1 << 30, 0);
        Arrays.sort(monsters, (m1, m2) -> m1.x - m2.x);

        long[] q = new long[N];
        int pop = 0;
        int push = 0;

        long ans = 0;
        long extra = 0;

        for (int i = 0; i < N; i++) {
            int x = monsters[i].x;
            int h = monsters[i].h;

            while (pop < push) {
                long p = q[pop];
                int x2 = (int)(p >> 31);
                if (x <= x2) break;
                int h2 = (int)(p & (1L << 31) - 1);
                extra -= h2;
                pop++;
            }
            h -= extra;

            if (h > 0) {
                int num = (h + A - 1) / A;
                ans += num;
                extra += (long)num * A;
                q[push++] = ((long)(x + 2 * D) << 31) + h;
            }
        }
        System.out.println(ans);
    }
}

class Monster {
    int x;
    int h;
    Monster (int x, int h) {
        this.x = x;
        this.h = h;
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
