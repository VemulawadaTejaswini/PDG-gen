import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        System.out.println(solve());
    }

    static int solve() {
        int[] P = getSqrtPrimes(M);
        List<Integer> factors = enumFactors(M, P);
        int k = factors.size();

        int ans = 1;
        for (int s = 0; s < 1 << k; s++) {
            int a = 1;
            for (int b = 0; b < k; b++) {
                if( (s & b) > 0 ) {
                    a *= factors.get(b);
                }
            }

            int b = M / a;
            if( a >= N ) {
                ans = Math.max(b, ans);
            }
            if( b >= N ) {
                ans = Math.max(a, ans);
            }
        }
        return ans;
    }

    static List<Integer> enumFactors(int n, int[] P) {
        List<Integer> factors = new ArrayList<>();
        int i = 0;
        for (int p : P) {
            int cnt = 0;
            while( n % p == 0 ) {
                factors.add(p);
                n /= p;
            }
        }
        if( n != 1 ) {
            factors.add(n);
        }
        return factors;
    }

    static boolean[] sieveEratos(int n) {
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        int root = (int)Math.sqrt(n);
        for (int i = 2; i <= root; i++) {
            if( primes[i] ) {
                for (int d = 2; d*i <= n; d++) {
                    primes[i*d] = false;
                }
            }
        }
        return primes;
    }

    static int[] getSqrtPrimes(int n) {
        boolean[] sieve = sieveEratos( (int)Math.sqrt(n) );
        int cnt = 0;
        for (boolean prime : sieve) {
            if( prime ) cnt++;
        }
        int[] primes = new int[cnt];
        int idx = 0;
        for (int num = 2; num < sieve.length; num++) {
            if( sieve[num] ) {
                primes[idx++] = num;
            }
        }
        return primes;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
