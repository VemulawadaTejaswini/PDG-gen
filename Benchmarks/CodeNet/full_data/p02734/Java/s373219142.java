import java.io.IOException;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F3";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int s = in.nextInt();
        int[] a = in.nextIntArray(n);

        ModLib ml = new ModLib(998244353);
        long sum = 0;

        long[][][] dp = new long[n + 1][s + 1][2];
        dp[0][0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= s; j++) {
                int nj = j + a[i];
                dp[i+1][j][0] = ml.add(dp[i+1][j][0], dp[i][j][0]);
                dp[i+1][j][1] = ml.add(dp[i+1][j][1], dp[i][j][1]);
                if (nj <= s) {
                    dp[i + 1][nj][1] = ml.add(dp[i + 1][nj][1], ml.mult(dp[i][j][0], i + 1));
                    dp[i + 1][nj][1] = ml.add(dp[i + 1][nj][1], dp[i][j][1]);
                }
            }
            sum = ml.add(sum, dp[i + 1][s][1]);
        }
        System.out.println(sum);
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

}

class ModCombination {
    private final ModLib modLib;

    private final long[] fact;
    private final long[] invfact;

    private ModCombination(ModLib modLib, long[] fact, long[] invfact) {
        this.modLib = modLib;
        this.fact = fact;
        this.invfact = invfact;
    }

    public static ModCombination create(int size, ModLib modLib) {
        long[] fact = new long[size];
        fact[0] = 1;
        for (int i = 0; i < size - 1; i++) {
            fact[i+1] = modLib.mult(fact[i], i + 1);
        }
        long[] invfact = new long[size];
        invfact[size-1] = modLib.div(1, fact[size-1]);
        for (int i = size - 2; i >= 0; i--) {
            invfact[i] = modLib.mult(invfact[i+1], i + 1);
        }
        return new ModCombination(modLib, fact, invfact);
    }

    public long fact(int x) {
        return fact[x];
    }

    public long invfact(int x) {
        return invfact[x];
    }

    public long comb(int a, int b) {
        if (b > a) {
            return 0;
        }
        return modLib.mult(fact[a], modLib.mult(invfact[b], invfact[a-b]));
    }

}

class ModLib {
    final long mod;

    public ModLib(long mod) {
        this.mod = mod;
    }

    public long add(long a, long b) {
        return (a + b) % mod;
    }

    public long sub(long a, long b) {
        return (a - b + mod) % mod;
    }

    public long mult(long a, long b) {
        return ((a % mod) * (b % mod)) % mod;
    }

    public long pow(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = mult(res, a);
            a = mult(a, a);
        }

        return res;
    }

    public long div(long a, long b) {
        return mult(a, pow(b, mod - 2));
    }
}


class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}
