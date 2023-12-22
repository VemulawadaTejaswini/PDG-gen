import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }

    public void solve() throws Exception {
        long mod = 1000000007;
//        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        FastScan scan = new FastScan(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            max = Math.max(max, A[i]);
        }
        List<Integer> primes = primes(1000000);

        Map<Integer, Integer>[] list = new Map[N];
        for (int i = 0; i < N; i++) {
            list[i] = prime_factor(primes, A[i]);
        }
        Map<Integer, Integer> lcm = new HashMap<>();
        for (int x : primes) {
            int max_count = 0;
            for (int i = 0; i < N; i++) {
                max_count = Math.max(max_count, list[i].getOrDefault(x, 0));
            }
            if (0 < max_count) {
                lcm.put(x, max_count);
            }
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            long b = 1;
            Map<Integer, Integer> factorize = list[i];
            for (int prime : lcm.keySet()) {
                b *= pow(prime, lcm.get(prime) - factorize.getOrDefault(prime, 0), mod);
            }
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
    private Map<Integer, Integer> prime_factor(List<Integer> primes, long N) {
        long current = N;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : primes) {
            if (current == 0) {
                break;
            }
            int count = 0;
            while(current % x == 0) {
                current /= x;
                count += 1;
            }
            if (0 < count) {
                map.put(x, count);
            }
        }
        return map;
    }
    private List<Integer> primes(int N) {
        boolean[] primes = new boolean[N+1];
        Arrays.fill(primes, true);
        for (int i = 2; i * i < N; i++) {
            if (!primes[i]) {
                continue;
            }
            primes[i] = true;
            for (int j = 2; i * j <= N; j++) {
                primes[i * j] = false;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (primes[i]) {
                list.add(i);
            }
        }
        return list;
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
        long nextLong() throws IOException {
            return Long.parseLong(this.next());
        }
        int nextInt() throws IOException {
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
