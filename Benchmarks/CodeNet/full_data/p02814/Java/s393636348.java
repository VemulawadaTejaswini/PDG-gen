import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        int n = nextInt();
        long m = nextLong();
        int[] a = new int[n];


        for (int i = 0; i < a.length; i++) a[i] = nextInt();

        long lcm = a[0];
        for (int i = 1; i < a.length; i++) {
            long gcd = gcd(a[i], lcm);
            lcm = lcm*a[i]/gcd;
        }

        boolean odd = (a[0]/2) % 2 == 1;
        boolean change = false;
        for (int i = 1; i < a.length; i++) {
            if (((a[i]/2) % 2 == 1) != odd) {
                change = true;
                break;
            }
        }

        if (change) System.out.println(0);
        else {
            double ans = Math.ceil(((2.0 * m) / lcm) / 2.0);
            if (odd) System.out.println((int) ans);
            else {
                odd = (lcm/a[0]) % 2 == 1;
                for (int i = 1; i < a.length; i++) {
                    odd = odd && (lcm/a[i]) % 2 == 1;
                }
                if (odd) System.out.println((int) ans);
                else System.out.println(0);
            }
        }
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
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