import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            new Main().solve(in);
        }
    }

    private int N, K;
    private long[] a;
    private boolean[] use;
    private int first;

    private void solve(Scanner in) {
        N = in.nextInt();
        K = in.nextInt();
        a = new long[N];
        use = new boolean[N];
        first = N;
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        java.util.Arrays.sort(a);
        dfs(0, 0);
        int ans = first;
        System.out.println(ans);
    }

    void dfs(int i, long k) {
        if (k >= K) {
            for (int j = first - 1; j >= 0; j--) {
                if (use[j]) {
                    if (k - a[j] < K) {
                        first = j;
                        break;
                    }
                }
            }
        }
        if (i == N) {
            return;
        }
        use[i] = true;
        dfs(i + 1, k + a[i]);
        use[i] = false;
        dfs(i + 1, k);
    }
}

class Scanner implements Closeable {
    private final InputStream stream;
    private final byte[] buf = new byte[1024];
    private int cur, num;

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