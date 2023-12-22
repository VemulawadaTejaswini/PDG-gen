import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] = scanner.nextInt();
        }
        Set<Long> divisors = divisors(sum);
        for (long d : divisors) {
            long[] b = new long[n];
            long m = 0;
            for (int i = 0; i < n; i++) {
                m += b[i] = a[i] % d == 0 ? 0 : a[i] / d * d + d - a[i];
            }
            Arrays.sort(b);
            long cost = 0;
            m /= d;
            for (int i = n - 1; i >= 0; i--) {
                if (--m < 0) {
                    break;
                }
                cost += d - b[i];
            }
            if (cost <= k) {
                System.out.println(d);
                return;
            }
        }
    }

    static Set<Long> divisors(long n) {
        Set<Long> divisors = new TreeSet<>(Comparator.reverseOrder());
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        return divisors;
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tokenizer.nextToken();
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
    }
}