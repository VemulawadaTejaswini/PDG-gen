import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CWalkOnMultiplicationTable solver = new CWalkOnMultiplicationTable();
        solver.solve(1, in, out);
        out.close();
    }

    static class CWalkOnMultiplicationTable {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] primes = sieveOfEratosthenes(1000000);
            long n = in.nextLong();
            List<Long> fact = new ArrayList<>();
            for (int i = 2; i < primes.length && n > 1; i++) {
                if (primes[i] == 0) {
                    while (n % i == 0) {
                        fact.add((long) i);
                        n /= i;
                    }
                }
            }
            if (fact.isEmpty()) {
                out.println(n - 1);
            } else {
                if (n != 1)
                    fact.add(n);
                long[] arr = new long[fact.size()];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = fact.get(i);
                }
                for (int i = 1; i < arr.length; i++) {
                    arr[i] *= arr[i - 1];
                }
                long min = Long.MAX_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    long a = arr[i];
                    long b = arr[arr.length - 1] / arr[i];
                    long aux = (a - 1) + (b - 1);
                    min = Math.min(min, aux);
                }
                out.println(min);
            }
        }

        int[] sieveOfEratosthenes(int n) {
            int prime[] = new int[n + 1];
            for (int p = 2; p * p <= n; p++) {
                if (prime[p] == 0) {
                    for (int i = p * p; i <= n; i += p)
                        prime[i] = 1;
                }
            }
            return prime;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

