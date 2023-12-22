import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 1000001;
    private static int MOD = 1000000007;
    void COMinit() {
        this.fac = new long[MAX_LEN];
        this.finv = new long[MAX_LEN];
        this.inv = new long[MAX_LEN];
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        for (int i = 2; i < MAX_LEN; i++) {
            fac[i] = fac[i-1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.COMinit();
        main.solve();
    }

    public void solve() throws Exception {
        long mod = 1000000007;
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            max = Math.max(max, A[i]);
        }

        Map<Integer, Integer> lcm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            lcm = prime_factor(A[i], lcm);
        }
        long l = 1;
        for (int x : lcm.keySet()) {
            l *= pow(x, lcm.get(x), mod);
        }
        l %= mod;

        long ans = 0;
        for (int i = 0; i < N; i++) {
            long b = l * inv[A[i]];
            b %= mod;
            ans += b;
            ans %= mod;
        }
        System.out.println(ans);
    }
    private long pow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 1) {
            long x = base * pow(base, exp-1, mod);
            x %= mod;
            return x;
        }
        long x = pow(base, exp/2, mod);
        x = x * x;
        x %= mod;
        return x;
    }
    private Map<Integer, Integer> prime_factor(int N, Map<Integer, Integer> lcm) {
        int current = N;
        for (int i = 2; i * i <= N; i++) {
            int count = 0;
            while(current % i == 0) {
                current /= i;
                count += 1;
            }
            if (0 < count) {
                lcm.merge(i, count, Integer::max);
            }
        }
        if (0 < current) {
            lcm.merge(current, 1, Integer::max);
        }
        return lcm;
    }
    class FastScan {
        BufferedReader br;
        StringTokenizer st;
        FastScan(InputStream is) {
            InputStreamReader isr = new InputStreamReader(is);
            this.br = new BufferedReader(isr);
        }
        String next() throws IOException {
            while (this.st == null || !this.st.hasMoreTokens()) {
                this.st = new StringTokenizer(br.readLine().trim());
            }
            return st.nextToken();
        }
        long scanLong() throws IOException {
            return Long.parseLong(this.next());
        }
        int scanInt() throws IOException {
            return Integer.parseInt(this.next());
        }
        double scanDouble() throws IOException {
            return Double.parseDouble(this.next());
        }
        char scanCharacter() throws IOException {
            return this.next().charAt(0);
        }
        String nextLine() throws IOException {
            return br.readLine().trim();
        }
    }
}
