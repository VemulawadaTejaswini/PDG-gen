import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int MOD = (int) (1e9 + 7);
    private static long BIG_MOD = (long) (1e20 + 7);

    private static BufferedReader br;
    private static StringTokenizer tokenizer;

    private static long gcd(long m, long n) {
        return m % n == 0 ? n : gcd(n, m % n);
    }

    private static long lcm(long m, long n) {
        return ((m * n) / gcd(m, n)) % BIG_MOD;
    }

    private static void solve() throws IOException {
        int n = nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        long lcm = 1;
        for (int i = 0; i < n; i++) {
            lcm = lcm(arr[i], lcm) % BIG_MOD;
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + lcm / arr[i]) % MOD;
        }
        
        System.out.println(ans);
    }


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    public static String next() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null)
                throw new IOException();
            tokenizer = new StringTokenizer(line);
        }
        return tokenizer.nextToken();
    }

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

}