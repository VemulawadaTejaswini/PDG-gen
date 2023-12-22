import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int MOD = (int) Math.pow(10, 9);

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();

        boolean[] primes = new boolean[100111];
        Arrays.fill(primes, true);
        for (int i = 2; i <= 100110; i++) {
            if (primes[i]) {
                for (int j = i + i; j <= 100110; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= 100110; i++) {
            if (primes[i] && (i >= n)) {
                System.out.println(i);
                System.exit(0);
            }
        }

        System.exit(0);
    }

    static private long gcd(long m, long n) {
        if (m < n) { return gcd(n, m); }
        if (m % n == 0) { return n; }
        return gcd(n, m%n);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
            try{
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
