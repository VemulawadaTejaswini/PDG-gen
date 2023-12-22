
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        if(N > 400 || K  > 400) return;
        int[] a = sc.nextIntArray(N);
        Arrays.sort(a);
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        if (sum < K) {
            System.out.println(N);
            return;
        }

        boolean[] no_need = new boolean[N];
        sum = 0;

        List<Integer> l = new ArrayList<>();
        int need = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] < K) {
                l.add(a[i]);
            } else {
                need++;
            }
        }
        int[] b = new int[l.size()];
        int M = b.length;
        for (int i = 0; i < M; i++) {
            b[i] = l.get(i);
        }
        for (int i = 0; i < M; i++) {
            // b[i]を利用しない部分集合を考える
            boolean[][] dp = new boolean[M + 1][K];
            dp[0][0] = true;
            for (int j = 0; j < M; j++) {
                if (i == j) {
                    for (int k = 0; k < K; k++) {
                        if (dp[j][k])
                            dp[j + 1][k] = true;
                    }
                } else {
                    for (int k = 0; k < K; k++) {
                        if (dp[j][k])
                            dp[j + 1][k] = true;
                        if (dp[j][k] && k + b[j] < K) {
                            dp[j + 1][k + b[j]] = true;
                        }
                    }
                }
            }
            L: for (int j = 0; j <= M; j++) {
                for (int k = 0; k < K; k++) {
                    if (dp[j][k] && k + b[i] >= K) {
                //        System.out.println(b[i] + "  = need");
                        need++;
                        break L;
                    }
                }
            }
        }
        System.out.println(N - need);
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

    void swap(char[] x, int a, int b) {
        char tmp = x[a];
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

    int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    int lcm(int a, int b) {
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