import java.util.Arrays;
import java.util.Scanner;

public class Main {
    MyScanner sc    = new MyScanner();
    Scanner   sc2   = new Scanner(System.in);
    long      start = System.currentTimeMillis();
    long      fin   = System.currentTimeMillis();
    final int MOD   = 1000000007;
    int[]     dx    = { 1, 0, 0, -1 };
    int[]     dy    = { 0, 1, -1, 0 };

    void run() {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = sc.nextIntArray(N);
        long[] s = new long[N - K + 1];
        long[] t = new long[N - K + 1];
        long sum = 0;
        long tum = 0;
        for (int i = 0; i < K; i++) {
            sum += a[i];
            if(a[i] > 0) tum += a[i];
        }
        s[0] = sum;
        t[0] = tum;
        for (int i = 1; i <= N - K; i++) {
            sum -= a[i - 1];
            sum += a[i + K - 1];
            s[i] = sum;
            
            if(a[i - 1] > 0)  tum -= a[i-1];
            if(a[i + K -  1] > 0)  tum += a[i + K - 1];
            t[i] = tum;
        }
        long A = 0;
        for (int i = 0; i < N; i++) {
            if(a[i] > 0) A += a[i];
        }
        long res = 0;
        for (int i = 0; i <= N - K; i++) {
            res = Math.max(res, A - t[i] + s[i]);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    void debug(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }

    void debug2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    boolean inner(int h, int w, int limH, int limW) {
        return 0 <= h && h < limH && 0 <= w && w < limW;
    }

    void swap(int[] x, int a, int b) {
        int tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }

    // find minimum i (k <= a[i])
    int lower_bound(int a[], int k) {
        int l = -1;
        int r = a.length;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (k <= a[mid])
                r = mid;
            else
                l = mid;
        }
        // r = l + 1
        return r;
    }

    // find minimum i (k < a[i])
    int upper_bound(int a[], int k) {
        int l = -1;
        int r = a.length;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (k < a[mid])
                r = mid;
            else
                l = mid;
        }
        // r = l + 1
        return r;
    }

    long gcd(long a, long b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    class MyScanner {
        int nextInt() {
            try {
                int c = System.in.read();
                while (c != '-' && (c < '0' || '9' < c))
                    c = System.in.read();
                if (c == '-')
                    return -nextInt();
                int res = 0;
                do {
                    res *= 10;
                    res += c - '0';
                    c = System.in.read();
                } while ('0' <= c && c <= '9');
                return res;
            } catch (Exception e) {
                return -1;
            }
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String next() {
            try {
                StringBuilder res = new StringBuilder("");
                int c = System.in.read();
                while (Character.isWhitespace(c))
                    c = System.in.read();
                do {
                    res.append((char) c);
                } while (!Character.isWhitespace(c = System.in.read()));
                return res.toString();
            } catch (Exception e) {
                return null;
            }
        }

        int[] nextIntArray(int n) {
            int[] in = new int[n];
            for (int i = 0; i < n; i++) {
                in[i] = nextInt();
            }
            return in;
        }

        int[][] nextInt2dArray(int n, int m) {
            int[][] in = new int[n][m];
            for (int i = 0; i < n; i++) {
                in[i] = nextIntArray(m);
            }
            return in;
        }

        double[] nextDoubleArray(int n) {
            double[] in = new double[n];
            for (int i = 0; i < n; i++) {
                in[i] = nextDouble();
            }
            return in;
        }

        long[] nextLongArray(int n) {
            long[] in = new long[n];
            for (int i = 0; i < n; i++) {
                in[i] = nextLong();
            }
            return in;
        }

        char[][] nextCharField(int n, int m) {
            char[][] in = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < m; j++) {
                    in[i][j] = s.charAt(j);
                }
            }
            return in;
        }
    }
}