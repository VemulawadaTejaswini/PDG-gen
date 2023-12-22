import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        long min = Integer.MAX_VALUE;
        long first = -1;
        long sec = -1;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] primes = sieveOfEratosthenes(1000000);
            long n = in.nextLong();
            long a = 1;
            long b = 1;
            List<Integer> fact = new ArrayList<>();
            for (int i = 2; i < primes.length && n > 1; i++) {
                if (primes[i] == 0) {
                    while (n % i == 0) {
                        fact.add(i);
                        n /= i;
                    }
                }
            }
            if (fact.isEmpty()) {
                out.println(n - 1);
            } else {
                solve(fact, 0, 1, 1);
                long ans = (first - 1) + (sec - 1);
                out.println(ans);
            }
        }

        public void solve(List<Integer> fact, int i, long a, long b) {
            if (i == fact.size()) {
                if (Math.abs(a - b) < min) {
                    min = Math.abs(a - b);
                    first = a;
                    sec = b;
                }
                return;
            }

            solve(fact, i + 1, a * fact.get(i), b);
            solve(fact, i + 1, a, b * fact.get(i));
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

