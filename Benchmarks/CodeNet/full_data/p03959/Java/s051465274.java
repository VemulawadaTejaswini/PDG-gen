import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;

public class Main {

    private void solve(FastScanner sc) {
        int n = sc.nextInt(); // 10^5
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean contradiction = false;
        int[] ub = new int[n];
        for (int i = 0; i < n; i++) {
            ub[i] = Math.min(t[i], a[i]);
        }
        int[] lb = new int[n];
        lb[0] = t[0];
        lb[n - 1] = a[n - 1];
        contradiction |= t[n - 1] != a[0];
        for (int i = 1; i < n - 1; i++) {
            lb[i] = 1;
            if (t[i] != t[i - 1]) lb[i] = t[i];
            if (a[i] != a[i + 1]) lb[i] = a[i];
            if(t[i] != t[i - 1] && a[i] != a[i + 1]) contradiction |= t[i] != a[i];
        }
        Modulo mod = new Modulo(1000000007);
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans = mod.mul(ans, ub[i] - lb[i] + 1);
        }
        if (contradiction) ans = 0;
        System.out.println(ans);
    }

    /*
     * template
     */

    public class Modulo {

        private static final int DEFAULT_MOD = 1000000007;
        private int mod;

        public Modulo() {
            mod = DEFAULT_MOD;
        }

        public Modulo(int mod) {
            this.mod = mod;
        }

        public int add(int a, int b) {
            return (a % mod + b % mod) % mod;
        }

        public int sub(int a, int b) {
            return (a % mod - b % mod + mod) % mod;
        }

        public int mul(int a, int b) {
            return (int) (((long) (a % mod) * (long) (b % mod)) % mod);
        }

        public long div(int a, int b) {
            return mul(a % mod, powerMod(b, mod - 2)) % mod;
        }

        public int powerMod(int b, int n) {
            return power(this::mul, b, n, 1);
        }

        public int power(BiFunction<Integer, Integer, Integer> f, int b, int n, int e) {
            if (n == 0) return e;
            return power(f, f.apply(b, b), n / 2, n % 2 == 0 ? e : f.apply(b, e));
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        new Main().solve(sc);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufLen = 0;

        private boolean hasNextByte() {
            if (ptr < bufLen) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufLen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufLen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}