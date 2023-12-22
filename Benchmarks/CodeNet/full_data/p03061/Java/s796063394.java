import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGCDOnBlackboard solver = new CGCDOnBlackboard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGCDOnBlackboard {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int res;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int val = 0;
            int val2 = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(arr[i]);
            }
            if (n == 2) {
                out.println(Math.max(arr[0], arr[1]));
                return;
            }
            Collections.shuffle(list);
            for (int i = 1; i < n; i++) {
                int gcd = GCD(list.get(0), list.get(i));
                if (gcd < min) {
                    val = list.get(0);
                    val2 = list.get(i);
                    min = gcd;
                }
            }
            list.remove(Integer.valueOf(val));
            list.remove(Integer.valueOf(val2));
            res = findGCD(list.stream().mapToInt(i -> i).toArray(), list.size());
            out.println(Math.max(GCD(val, res), GCD(val2, res)));
        }

        int findGCD(int arr[], int n) {
            int result = arr[0];
            for (int i = 1; i < n; i++)
                result = GCD(arr[i], result);

            return result;
        }

        private int GCD(int a, int b) {
            return b == 0 ? a : GCD(b, a % b);
        }

    }

    static class InputReader implements AutoCloseable {
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public void close() {
        }

    }
}

