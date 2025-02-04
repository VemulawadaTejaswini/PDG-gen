import java.io.*;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    class Rat {
        long a, b;

        public Rat(long a, long b) {
            this.a = a;
            this.b = b;
            good();
        }

        Rat add(Rat an) {
            return new Rat(an.a * b + a * an.b, an.b * b);
        }

        Rat mul(Rat o) {
            return new Rat(a * o.a, b * o.b);
        }

        void good() {
            long g = gcd(a, b);
            a /= g;
            b /= g;
        }

        @Override
        public String toString() {
            String res = a + "/" + b;
            while (res.length() < 10) {
                res += " ";
            }
            return res;
        }
    }

    long gcd(long x, long y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point() {
            x = in.nextInt();
            y = in.nextInt();
        }

        @Override
        public int compareTo(Point o) {
            return Integer.compare(x, o.x);
        }
    }

    void solve33() {
        String s1 = in.next();
        String s2 = in.next();
        int cntA = 0, cntSame = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '1' && s2.charAt(i) == '1') {
                cntSame++;
            } else if (s1.charAt(i) == '1') {
                cntA++;
            }
        }
        final int mod = 998244353;
        final int n = s1.length() + 1;
        int[][] c = new int[n][n];
        c[0][0] = 1;
        for (int i = 1; i < n; i++) {
            c[i][0] = 1;
            for (int j = 1; j < n; j++) {
                c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
                if (c[i][j] >= mod) {
                    c[i][j] -= mod;
                }
            }
        }
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++) {
            fact[i] = (int) (fact[i - 1] * 1L * i % mod);
        }
        long res = 0;
        int[] dp = new int[cntSame + 1];
        int[] nextDp = new int[cntSame + 1];
        dp[cntSame] = 1;
        for (int layer = 0; layer < cntA; layer++) {
            Arrays.fill(nextDp, 0);
            for (int curHave = 0; curHave <= cntSame; curHave++) {
                int nowDp = dp[curHave];
                if (nowDp == 0) {
                    continue;
                }
                for (int use = 0; use <= curHave; use++) {
                    long mul = c[curHave][use] * 1L * fact[use] % mod;
                    mul = mul * nowDp + nextDp[curHave - use];
                    mul %= mod;
                    nextDp[curHave - use] = (int) mul;
                }
            }
            int[] tmp = nextDp;
            nextDp = dp;
            dp = tmp;
        }
        for (int stay = 0; stay <= cntSame; stay++) {
            long curDP = dp[stay];
            curDP = curDP * fact[stay] % mod;
            curDP = curDP * fact[stay] % mod;
            curDP = curDP * c[cntSame + cntA][stay] % mod;
            res += curDP;
        }
        res %= mod;
        res = res * fact[cntA] % mod * fact[cntA] % mod;
        out.println(res);
    }

    void solve() {
        Point from = new Point();
        Point to = new Point();
        int n = in.nextInt();
        Point[] a = new Point[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Point();
        }
        if (from.x > to.x) {
            from.x = -from.x;
            to.x = -to.x;
            for (Point p : a) {
                p.x = -p.x;
            }
        }
        if (from.y > to.y) {
            from.y = -from.y;
            to.y = -to.y;
            for (Point p : a) {
                p.y = -p.y;
            }
        }
        double q = Math.PI * 5;
        double len = 100.0 * (to.x - from.x + to.y - from.y);
        if (from.x == to.x || from.y == to.y) {
            boolean have = false;
            for (Point p : a) {
                if (p.x >= from.x && p.x <= to.x && p.y >= from.y && p.y <= to.y) {
                    have = true;
                }
            }
            if (have) {
                len -= 20;
                len += 2 * q;
            }
            out.println(len);
            return;
        }
        Arrays.sort(a);
        ArrayList<Integer> all = new ArrayList<>();
        for (Point p : a) {
            if (p.x >= from.x && p.x <= to.x && p.y >= from.y && p.y <= to.y) {
                all.add(p.y);
            }
        }
        int cnt = getMax(all);
//        System.err.println("cnt = " + cnt);
        if (cnt == 1 + Math.min(to.x - from.x, to.y - from.y)) {
            len += q;
        }
        len -= 20 * cnt;
        len += q * cnt;

        out.println(len);
    }

    int getMax(ArrayList<Integer> all) {
        int n = all.size();
        int[] d = new int[n + 1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[0] = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int l = 0, r = n;
            while (r - l > 1) {
                int mid = (l + r) >> 1;
                if (d[mid] >= all.get(i)) {
                    r = mid;
                } else {
                    l = mid;
                }
            }
            d[r] = Math.min(d[r], all.get(i));
        }
        for (int res = n; res >= 0; res--) {
            if (d[res] != Integer.MAX_VALUE) {
                return res;
            }
        }
        return -1;
    }

    void solve332() {
        String s = in.next();
        int n = s.length();
        long res = n * 1L * (n - 1) / 2 + 1;
        int[] sum = new int[256];
        for (char c : s.toCharArray()) {
            res -= sum[c];
            sum[c]++;
        }
        out.println(res);
    }

    private void solve123() {

        final int n = 10;
        Rat[][] dp = new Rat[n][n];
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[0][i] = new Rat(i, 1);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i <= j) {
                    Rat left = new Rat(j, i + j + 0).mul(new Rat(1, 1).add(dp[i][j - 1]));
                    Rat right = new Rat(i, (i + j)).mul(dp[i - 1][j]);
                    dp[i][j] = left.add(right);
                } else {
                    dp[i][j] = dp[j][i];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.err.printf(dp[i][j] + " ");
            }
            System.err.println("");
        }
        System.err.println(dp[3][4]);
    }

    private void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}