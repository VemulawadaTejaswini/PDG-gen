
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    MyScanner      sc    = new MyScanner();
    Scanner        sc2   = new Scanner(System.in);
    long           start = System.currentTimeMillis();
    long           fin   = System.currentTimeMillis();
    final int      MOD   = 1000000007;
    int[]          dx    = { 1, 0, 0, -1 };
    int[]          dy    = { 0, 1, -1, 0 };

    int            N, M;
    boolean[]      v;
    Set<Integer>[] g;
    List<Integer>  p1;
    List<Integer>  p2;

    void run() {
        N = sc.nextInt();
        M = sc.nextInt();
        g = new HashSet[N];
        v = new boolean[N];
        for (int i = 0; i < N; i++) g[i] = new HashSet<>();
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            g[s].add(t);
            g[t].add(s);
        }
        p1 = new ArrayList<>();
        p2 = new ArrayList<>();
        int ind = 0;
        for (int start : g[0]) {
            if (ind == 0) dfs(0);
            if (ind == 1) dfs2(-1 , 0);
            if (ind == 1)
                break;
            ind++;
        }

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < p2.size(); i++) l.add(p2.get(p2.size() - i - 1) + 1);
        l.add(1);
        for (int i = 0; i < p1.size(); i++) l.add(p1.get(i) + 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l.size(); i++) {
            if(i != 0) sb.append(" "+l.get(i));
            else sb.append(l.get(i));
        }
        System.out.println(l.size());
        System.out.println(sb);
    }

    void dfs(int now) {
        v[now] = true;
        for (int next : g[now]) {
            if (v[next]) continue;
            p1.add(next);
            dfs(next);
            return;
        }
    }

    void dfs2(int pre, int now) {
        v[now] = true;
        for (int next : g[now]) {
            if (v[next]) continue;
            p2.add(next);
            dfs2(now, next);
            return;
        }
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