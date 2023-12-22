import java.util.*;
import java.io.*;

class Main {
    static final int mod = 1000000000 + 7;
    static long f[] = new long [100010];
    static long inv[] = new long [100010];

    static long modpow(int x, int y) {
        if(y == 0) return 1;
        if((y & 1) == 1) return (modpow(x, y-1) * x) % mod;
        long m = modpow(x, y >> 1);
        return (m*m) % mod;
    }
    static long inverse(int x) {
        return modpow(x, mod - 2);
    }
    static long nCr(int x, int y) {
        if(x < y) return 0;
        long num = f[x];
        long den = (inv[y] * inv[x - y]) % mod;
        return (num * den) % mod;
    }
    public static void main(String [] args) {
        Reader in = new Reader ();
        Writer out = new Writer ();

        f[0] = inv[0] = 1;
        for(int i = 1; i <= 100000; i++) {
            f[i] = f[i - 1] * i;
            f[i] %= mod;
            inv[i] = inverse((int)f[i]);
        }

        int n = in.nextInt();
        int [] a = new int [n + 5];
        int [] b = new int [n + 5];
        int [][] dp = new int [2005][2005];
        for(int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            dp[a[i]][b[i]] += 1;
        }
        for(int i = 2000; i >= 0; i--) {
            for(int j = 2000; j >= 0; j--) {
                dp[i][j] += dp[i + 1][j];
                dp[i][j] += dp[i][j + 1];
                dp[i][j] %= mod;
            }
        }
        long ans = (1L * dp[0][0] * dp[0][0]) % mod;

        for(int i = 1; i <= 2000; i++) {
            for(int j = 1; j <= 2000; j++) {
                long ways = (1L * dp[0][i] * dp[j][0]) % mod;
                ways += 1L * dp[i][0] * dp[0][j];
                ways %= mod;
                ways *= nCr(i + j - 2, j - 1);
                ans += ways;
                ans %= mod;
            }
        }
        for(int i = 1; i <= n; i++) {
            ans -= nCr(2 * (a[i] + b[i]), 2 * a[i]);
            ans %= mod;
        }
        if(ans < 0) ans += mod;
        ans *= inverse(2);
        ans %= mod;
        out.writeln(ans);
        out.flush();
    }
    static class Reader {
        private StringTokenizer a;
        private BufferedReader b;
        Reader () {
            a = null;
            b = new BufferedReader (new InputStreamReader (System.in));
        }
        public String next () {
            while(a == null || !a.hasMoreTokens()) {
                try {
                    a = new StringTokenizer (b.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return a.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(this.next());
        }
        public long nextLong () {
            return Long.parseLong(this.next());
        }
        public double nextDouble () {
            return Double.parseDouble(this.next());
        }
        public String nextLine() {
            try {
                return b.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "";
        }
    }
    static class Writer {
        private PrintWriter a;
        private StringBuffer b;
        Writer () {
            a = new PrintWriter (System.out);
            b = new StringBuffer ("");
        }
        public void write (Object s) {
            b.append(s);
        }
        public void writeln(Object s) {
            b.append(s).append('\n');
        }
        public void flush () {
            a.print(b);
            a.flush();
            a.close();
        }
    }
    static class Pair implements Comparator <Pair> {
        int first;
        int second;
        Pair  (int a, int b) {
            this.first = a;
            this.second = b;
        }
        Pair (Pair a) {
            this.first = a.first;
            this.second = a.second;
        } 
        Pair () {}
        public String toString () {
            return "[" + first + ", " + second + "]";
        }
        public int compare (Pair a, Pair b) {
            if(a.first == b.first) {
                return a.second - b.second;
            } else {
                return a.first - b.first;
            }
        }
    } 
}