import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.math.BigDecimal;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.MathContext;
import java.io.IOException;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author ilyakor
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskB {
    static final int mod = 998244353;

    static final int[] f = new int[310 * 1000];
    static final int[] rf = new int[310 * 1000];

    static {
        f[0] = 1;
        rf[0] = 1;
        for (int i = 1; i < f.length; ++i) {
            f[i] = (int) (((long) f[i - 1] * (long) i) % mod);
            rf[i] = IntegerUtils.pow(f[i], mod - 2, mod);
        }
    }

    static int C(int n, int k) {
        long res = f[n] * (long) rf[k];
        res %= mod;
        res *= rf[n - k];
        res %= mod;
        return (int) res;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long a = in.nextLong();
        long b = in.nextLong();
        long k = in.nextLong();
        long res = 0;
        for (int na = 0; na <= n; ++na) {
            long rem = k - a * na;
            if (rem < 0) continue;
            if (rem % b != 0) continue;
            int nb = (int)(rem / b);
            if (nb > n) continue;
            res += C(n, na) * (long) C(n, nb);
            res %= mod;
        }
        out.printLine(res);
    }
}

class IntegerUtils {

    public static int pow(long x, long y, int mod) {
        x %= mod;
        long res = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                --y;
                res = (res * x) % mod;
            } else {
                y /= 2;
                x = (x * x) % mod;
            }
        }
        return (int)(res % mod);
    }

}

class InputReader {
    private InputStream stream;
    private byte[] buffer = new byte[10000];
    private int cur;
    private int count;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public static boolean isSpace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public int read() {
        if (count == -1) {
            throw new InputMismatchException();
        }
        try {
            if (cur >= count) {
                cur = 0;
                count = stream.read(buffer);
                if (count <= 0)
                    return -1;
            }
        } catch (IOException e) {
            throw new InputMismatchException();
        }
        return buffer[cur++];
    }

    public int readSkipSpace() {
        int c;
        do {
            c = read();
        } while (isSpace(c));
        return c;
    }

    public int nextInt() {
        int sgn = 1;
        int c = readSkipSpace();
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res = res * 10 + c - '0';
            c = read();
        } while (!isSpace(c));
        res *= sgn;
        return res;
    }

    public long nextLong() {
        long sgn = 1;
        int c = readSkipSpace();
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res = res * 10L + (long)(c - '0');
            c = read();
        } while (!isSpace(c));
        res *= sgn;
        return res;
    }

}

class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
    }

    public void printLine(Object... objects) {
        print(objects);
        writer.println();
    }

    public void close() {
        writer.close();
    }

}

