import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static int[][][] memo;
    private static int[] A, B, C;
    private static int N, Ma, Mb;

    private static void solve(Scanner in) {
        N = in.nextInt();
        Ma = in.nextInt();
        Mb = in.nextInt();
        A = new int[N];
        B = new int[N];
        C = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
            C[i] = in.nextInt();
        }
        memo = new int[N + 1][10 * N + 1][10 * N + 1];
        int minc = dfs(0, 0, 0, 0);
        System.out.println(minc == Integer.MAX_VALUE ? -1 : minc);
    }

    private static int dfs(final int i, final int a, final int b, final int c) {
        int gcd = gcd(a, b);
        gcd = gcd == 0 ? 1 : gcd;
        if (memo[i][a][b] > 0) {
            if (a / gcd == Ma && b / gcd == Mb) {
                if (memo[i][a][b] > c) {
                    memo[i][a][b] = c;
                }
            }
            return memo[i][a][b];
        }
        if (a / gcd == Ma && b / gcd == Mb) {
            memo[i][a][b] = c;
            return c;
        }
        int minc = Integer.MAX_VALUE;
        if (i < N) {
            int cc = dfs(i + 1, a + A[i], b + B[i], c + C[i]);
            minc = Math.min(minc, cc);
            if (i + 1 < N) {
                int ccc = dfs(i + 1, a, b, c);
                minc = Math.min(minc, ccc);
            }
        }
//        memo[i][a][b] = minc;
        return minc;
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
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