import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        Yama[] Y = new Yama[N];
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            Y[i] = new Yama(a, i);
        }
        Arrays.sort(Y);

        long[] freq = new long[N];
        for (int j = 0; j < N;) {
            int aa = Y[j].a;
            int ii = Y[j].i;
            int cnt = 0;
            int k = j;
            while (k < N && aa == Y[k].a) {
                ii = Y[k].i;
                Y[k++].a--;
                cnt++;
            }
            freq[ii] += cnt;
            if (k < N && Y[j].a >= Y[k].a) {
                continue;
            }
            j = k + 1;
        }

        StringBuilder ans = new StringBuilder();
        for (long f : freq) {
            ans.append(f).append('\n');
        }
        System.out.println(ans);
    }
}

class Yama implements Comparable<Yama> {
    int a, i;

    Yama(int a, int i) {
        this.a = a;
        this.i = i;
    }

    @Override
    public int compareTo(Yama o) {
        if (o.a != a) {
            return o.a - a;
        }
        return o.i - i;
    }

    @Override
    public String toString() {
        return String.format("(a=%d,i=%d)", a, i);
    }
}

class Scanner implements Closeable {
    private final InputStream stream;
    private final byte[] buf = new byte[1024];
    private int cur;
    private int num;

    Scanner(InputStream stream) {
        this.stream = stream;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    int nextInt() {
        return (int) nextLong();
    }

    long nextLong() {
        int c = read();
        while (isdel(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long l = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            l *= 10;
            l += c - '0';
            c = read();
        } while (!isdel(c));
        return l * sgn;
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String next() {
        int c = read();
        while (isdel(c))
            c = read();
        StringBuilder s = new StringBuilder();
        do {
            s.appendCodePoint(c);
            c = read();
        } while (!isdel(c));
        return s.toString();
    }

    private int read() {
        if (num == -1)
            throw new InputMismatchException();
        if (cur >= num) {
            cur = 0;
            try {
                num = stream.read(buf);
            } catch (Exception e) {
                throw new InputMismatchException();
            }
            if (num <= 0)
                return -1;
        }
        return buf[cur++];
    }

    private boolean isdel(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    @Override
    public void close() {
        try {
            stream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}