import java.util.*;
import java.io.*;

// Template for atcoder
public class Main {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    final long MOD = 1000L * 1000L * 1000L + 7;
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {1, 0, -1, 0};


    void solve() throws IOException {
        int n = nextInt();
        long k = nextLong();
        long[][] init = new long[n][n];
        for (int i = 0; i < n; i++) {
            init[i] = nextLongArr(n);
        }
        long[][] res = powMod(init, k, MOD);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += res[i][j];
                if (sum >= MOD) {
                    sum -= MOD;
                }
            }
        }
        outln(sum);
    }

    long[][] powMod(long[][] mat, long pow, long Mod) {
        int n = mat.length;
        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }
        if (pow == 0) {
            return res;
        }
        if (pow % 2 != 0) {
            res = mat;
        }
        long[][] hf = mult(mat, mat, Mod);
        long[][] tmp = powMod(hf, pow / 2, Mod);
        return mult(tmp, res, Mod);
    }

    long[][] mult(long[][] m1, long[][] m2, long Mod) {
        int n = m1.length;
        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long tmp = 0;
                for (int k = 0; k < n; k++) {
                    tmp += m1[i][k] * m2[k][j] % Mod;
                    if (tmp >= Mod) {
                        tmp -= Mod;
                    }
                }
                res[i][j] = tmp;
            }
        }
        return res;
    }

    // Power Calculate N^M % MOD, N and M can be long (up to 2^64, ~10^18)
    public long powMod(long N, long M, long Mod){//N^M % Mod
        if(M == 0L)
            return 1L;
        long[] hp = new long[64];
        boolean[] bp = new boolean[64];
        hp[0] = N;
        for(int i = 1; i < hp.length; i++) {
            hp[i] = (hp[i - 1] * hp[i - 1]) % Mod;
        }
        for(int j = 0; j < hp.length; j++) {
            if((M & (1L << j)) != 0)
                bp[j] = true;
        }
        long res = 1;
        for(int i = 0;i < bp.length; i++){
            if(bp[i]) {
                res = (res * hp[i]) % Mod;
            }
        }
        return res;
    }

    void shuffle(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }
    private void outln(Object o) {
        out.println(o);
    }
    private void out(Object o) {
        out.print(o);
    }
    public Main() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public long[] nextLongArr(int n) throws IOException{
        long[] res = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
    public int[] nextIntArr(int n) throws IOException {
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }
    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }
    public String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
