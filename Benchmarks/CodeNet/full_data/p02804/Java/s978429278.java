import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        // https://img.atcoder.jp/abc151/editorial.pdf
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = in.nextIntArray(n);
        Arrays.sort(a);

        initFact(n, MOD);

        long maxSum = 0;
        long minSum = 0;
        for (int i = 0; i < n; i++) {
            int num = a[i];

            // max
            long comb = combinationMod(i, k - 1, MOD);
            long toAdd = comb * num;
            toAdd %= MOD;
            maxSum += toAdd;
            maxSum %= MOD;

            // min
            comb = combinationMod(n - i - 1, k - 1, MOD);
            toAdd = comb * num;
            toAdd %= MOD;
            minSum += toAdd;
            minSum %= MOD;
        }

        out.println((maxSum - minSum + MOD) % MOD);
    }

    // factorial in mod
    // factMod[1] = 1, factMod[2] = 2, ...
    private static long[] factMod;
    // inverse factorial in mod
    private static long[] iFactMod;

    private static void initFact(long n, long mod) {
        factMod = new long[(int)n+1];
        iFactMod = new long[(int)n+1];
        factMod[0] = 1;
        iFactMod[0] = 1;
        for (int i = 0; i < n; i++) {
            factMod[i+1] = factMod[i] * ((long) (i+1)) % mod;
            iFactMod[i+1] = iFactMod[i] * modInv(i+1, mod) % mod;
        }
    }

    // x^-1 (mod m)
    private static long modInv(long x, long mod) {
        return modPow(x, mod-2, mod);
    }

    // x^n (mod m)
    private static long modPow(long x, long n, long mod) {
        long ans = 1;
        while (n != 0) {
            if ((n & 1) == 1L) ans = ans * x % mod;
            x = x * x % mod;
            n = n >> 1;
        }
        return ans;
    }

    // aCb (mod m)
    // must call initFact() first.
    private static long combinationMod(int a, int b, long mod) {
        if(a == 0 && b == 0) return 1;
        if(a < b || a < 0) return 0;
        long tmp = iFactMod[a-b]* iFactMod[b] % mod;
        return tmp * factMod[a] % mod;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
