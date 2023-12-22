import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        int[] m = new int[3];
        Arrays.fill(m, -1);
        int[] c = new int[3];
        for (int i = 0; i < n; i++) {
            boolean b = false;
            for (int j = 0; j < 3; j++) {
                if (m[j] == -1 || m[j] == a[i]) {
                    m[j] = a[i];
                    c[j]++;
                    b = true;
                    break;
                }
            }
            if (!b) {
                out.println("No");
                return;
            }
        }
        if (m[1] == -1) {
            out.println(m[0] == 0 ? "Yes" : "No");
        } else if (m[2] == -1) {
            if (m[0] == 0) {
            } else if (m[1] == 0) {
                int temp = c[1];
                c[1] = c[0];
                c[0] = temp;
            } else {
                out.println("No");
                return;
            }
            while (c[0] >= 1 && c[1] >= 2) {
                c[1] -= 2;
                c[0]--;
            }
            if (c[0] == 0) {
                out.println(c[1] <= 2 ? "Yes" : "No");
            } else if (c[0] == 1) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        } else {
            if ((m[0] ^ m[1] ^ m[2]) == 0) {
                while (c[0] >= 1 && c[1] >= 1 && c[2] >= 1) {
                    c[0]--;
                    c[1]--;
                    c[2]--;
                }
                out.println(c[0] >= 2 || c[1] >= 2 || c[2] >= 2 ? "No" : "Yes");
            } else {
                out.println("No");
            }
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
