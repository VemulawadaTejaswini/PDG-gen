import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * あかりさんは n 種類の花を 1 本ずつ持っています。 あかりさんは、これらの花から 1 本以上を選び、花束を作ろうとしています。 ただし、あかりさんは
 * a と b の 2 つの数を苦手としていて、 いずれかと一致するような本数の花からなる花束は作ることができません。
 * あかりさんが作ることのできる花束は何種類あるでしょうか。 (10^9+7) で割った余りを求めてください。 ここで 2
 * つの花束は、一方では使われているが、 もう一方では使われていない種類の花があるとき、別の種類の花束であるとみなします。 2 <= n <= 10^9 1
 * <= a < b <= min(n, 2*10^5)
 */
public final class Main {
  private static void execute(final IO io) throws Exception {
    final int n = io.nextInt();
    final int a = io.nextInt();
    final int b = io.nextInt();
    MC c = new MC(1000000007);
    long x1 = c.power(2, n) - 1;
    long x2 = c.combination(n, a);
    long x3 = c.combination(n, b);
    io.println(c.mod(x1 - x2 - x3));
  }

  public static void main(final String[] args) throws Exception {
    try (IO io = new IO(System.in, System.out)) {
      execute(io);
    }
  }

  public static final class MC {
    private final int mod;
    public MC(final int mod) {
      this.mod = mod;
    }

    public long mod(long x) {
      x %= mod;
      if (x < 0) {
        x += mod;
      }
      return x;
    }

    public long power(long base, long exp) {
      long ret = 1;
      base %= mod;
      while (exp > 0) {
        if ((exp & 1) == 1) {
          ret = ret * base % mod;
        }
        base = base * base % mod;
        exp >>= 1;
      }
      return ret;
    }

    private int factorialN = 0;
    private long[] factorial = null;
    private void initializeFactorial(final int n) {
      if (n == factorialN) {
        return;
      }
      if (n < factorialN) {
        factorialN = n;
        return;
      }
      factorialN = n;
      factorial = new long[n + 1];
      factorial[0] = 1;
      for (int i = 1; i < n + 1; i++) {
        factorial[i] = factorial[i - 1] * i % mod;
      }
    }

    public long combinationCached(final int n, final int r) {
      if (r > n) {
        return 0;
      }
      initializeFactorial(n);
      long numerator = factorial[n];
      long denominator = factorial[r] * factorial[n - r] % mod;
      return numerator * power(denominator, mod - 2) % mod;
    }

    public long combination(final int n, int r) {
      if (r > n) {
        return 0;
      }
      long numerator = production(n - r + 1, n);
      long denominator = production(1, r) % mod;
      return numerator * power(denominator, mod - 2) % mod;
    }

    public long production(final int start, final int end) {
      long result = 1;
      for (int i = start; i <= end; i++) {
        result *= i;
        result %= mod;
      }
      return result;
    }
  }

  public static final class M {
    public static int gcd(int a, int b) {
      int tmp;
      while (b != 0) {
        tmp = a;
        a = b;
        b = tmp % b;
      }
      return a;
    }

    public static int gcd(final int a, final int b, final int c) {
      return gcd(gcd(a, b), c);
    }

    public static int min(final int a, final int b) {
      return a > b ? b : a;
    }

    public static int min(final int a, final int b, final int c) {
      return min(min(a, b), min(b, c));
    }
  }

  public static final class IO implements AutoCloseable {
    private final InputStream in;
    private final BufferedOutputStream out;
    private static final int BUFFER_SIZE = 1 << 16;
    private final byte[] buf = new byte[BUFFER_SIZE];
    private int pos = 0;
    private int end = 0;
    public IO(final InputStream in, final PrintStream out) throws IOException {
      this.in = in;
      this.out = new BufferedOutputStream(out);
    }

    @Override
    public void close() throws IOException {
      out.close();
    }

    private int fetchByte() throws IOException {
      if (pos >= end) {
        pos = 0;
        end = in.read(buf);
        if (end <= 0) {
          return -1;
        }
      }
      return buf[pos++];
    }

    public String next() throws IOException {
      int c;
      for (c = fetchByte(); c <= ' '; c = fetchByte()) {
      }
      final StringBuilder sb = new StringBuilder();
      for (; c > ' '; c = fetchByte()) {
        sb.append((char) c);
      }
      return sb.toString();
    }

    public int nextInt() throws IOException {
      int val = 0;
      int c;
      for (c = fetchByte(); c <= ' '; c = fetchByte()) {
      }
      boolean neg = c == '-';
      if (c == '-' || c == '+') {
        c = fetchByte();
      }
      for (; c >= '0' && c <= '9'; c = fetchByte()) {
        val = (val << 3) + (val << 1) + (c & 15);
      }
      return neg ? -val : val;
    }

    public int[] nextInt(final int n) throws IOException {
      final int[] result = new int[n];
      for (int i = 0; i < n; i++) {
        result[i] = nextInt();
      }
      return result;
    }

    public long nextLong() throws IOException {
      long val = 0;
      int c;
      for (c = fetchByte(); c <= ' '; c = fetchByte()) {
      }
      boolean neg = c == '-';
      if (c == '-' || c == '+') {
        c = fetchByte();
      }
      for (; c >= '0' && c <= '9'; c = fetchByte()) {
        val = (val << 3) + (val << 1) + (c & 15);
      }
      return neg ? -val : val;
    }

    public long[] nextLong(final int n) throws IOException {
      final long[] result = new long[n];
      for (int i = 0; i < n; i++) {
        result[i] = nextLong();
      }
      return result;
    }

    public void print(final Object a) throws IOException {
      out.write(a.toString().getBytes());
    }

    private static final byte[] SP = new byte[] { 0x20 };
    public void printsp(final Object a) throws IOException {
      out.write(a.toString().getBytes());
      out.write(SP);
    }

    private static final byte[] CRLF = System.lineSeparator().getBytes();
    public void println() throws IOException {
      out.write(CRLF);
    }

    public void println(final Object a) throws IOException {
      out.write(a.toString().getBytes());
      out.write(CRLF);
    }

    public void printaln(final int[] a) throws IOException {
      for (int i = 0, n = a.length; i < n; i++) {
        out.write(Integer.toString(a[i]).getBytes());
        out.write(CRLF);
      }
    }

    public void printasp(final int[] a) throws IOException {
      for (int i = 0, n = a.length; i < n; i++) {
        out.write(Integer.toString(a[i]).getBytes());
        out.write(SP);
      }
    }

    public void printaln(final long[] a) throws IOException {
      for (int i = 0, n = a.length; i < n; i++) {
        out.write(Long.toString(a[i]).getBytes());
        out.write(CRLF);
      }
    }

    public void printasp(final long[] a) throws IOException {
      for (int i = 0, n = a.length; i < n; i++) {
        out.write(Long.toString(a[i]).getBytes());
        out.write(SP);
      }
    }

    public void printaln(final Object[] a) throws IOException {
      for (int i = 0, n = a.length; i < n; i++) {
        out.write(a[i].toString().getBytes());
        out.write(CRLF);
      }
    }

    public void printasp(final Object[] a) throws IOException {
      for (int i = 0, n = a.length; i < n; i++) {
        out.write(a[i].toString().getBytes());
        out.write(SP);
      }
    }

    public void flush() throws IOException {
      out.flush();
    }
  }
}
