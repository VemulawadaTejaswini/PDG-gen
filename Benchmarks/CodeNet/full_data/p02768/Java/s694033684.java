import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt(), a = nextInt(), b = nextInt();
        long mod = 1000000007;
        long ans = (3 * mod + twoPow(n, mod) - 1 - combinations(n, a, mod) - combinations(n, b, mod)) % mod;
        System.out.println(ans);
    }

    private static long twoPow(int pow, long p) {
        long res = 1;
        long base = 2;
        while (pow > 0) {
            if (pow % 2 == 1) res = (res * base) % p;
            pow /= 2;
            base = (base * base) % p;
        }
        return res;
    }

    private static int get_degree(long n, long p) { // returns the degree with which p is in n!
        int degree_num = 0;
        long u = p;
        long temp = n;

        while (u <= temp) {
            degree_num += temp / u;
            u *= p;
        }
        return degree_num;
    }

    private static long degree(long a, long k, long p) {
        long res = 1;
        long cur = a;

        while (k > 0) {
            if (k % 2 > 0) {
                res = (res * cur) % p;
            }
            k /= 2;
            cur = (cur * cur) % p;
        }
        return res;
    }

    private static long combinations(int n, int k, long p) {
        int num_degree = get_degree(n, p) - get_degree(n - k, p);
        int den_degree = get_degree(k, p);

        if (num_degree > den_degree) {
            return 0;
        }
        long res = 1;
        for (long i = n; i > n - k; --i) {
            long ti = i;
            while (ti % p == 0) {
                ti /= p;
            }
            res = (res * ti) % p;
        }
        for (long i = 1; i <= k; ++i) {
            long ti = i;
            while (ti % p == 0) {
                ti /= p;
            }
            res = (res * degree(ti, p - 2, p)) % p;
        }
        return res;
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}