import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FAbsoluteMinima solver = new FAbsoluteMinima();
        solver.solve(1, in, out);
        out.close();
    }

    static class FAbsoluteMinima {
        PriorityQueue<Long> lower = new PriorityQueue<>((a, b) -> -Long.compare(a, b));
        PriorityQueue<Long> upper = new PriorityQueue<>();
        long lowerSum = 0;
        long upperSum = 0;

        void addUpper(long x) {
            upper.add(x);
            upperSum += x;
        }

        long pollUpper() {
            long x = upper.poll();
            upperSum -= x;
            return x;
        }

        void addLower(long x) {
            lower.add(x);
            lowerSum += x;
        }

        long pollLower() {
            long x = lower.poll();
            lowerSum -= x;
            return x;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int Q = in.nextInt();

            long sum = 0;


            for (int query = 0; query < Q; query++) {
                int q = in.nextInt();
                if (q == 1) {
                    long a = in.nextInt();
                    long b = in.nextInt();
                    sum += b;

                    if (lower.size() == 0 || a <= lower.peek()) {
                        addLower(a);
                    } else {
                        addUpper(a);
                    }

                    int desiredLowerSize = (lower.size() + upper.size() + 1) / 2;

                    while (lower.size() < desiredLowerSize) {
                        addLower(pollUpper());
                    }
                    while (lower.size() > desiredLowerSize) {
                        addUpper(pollLower());
                    }
                } else if (q == 2) {
                    long x = lower.peek();
                    long answer = sum;
                    answer += upperSum - x * upper.size();
                    answer += x * lower.size() - lowerSum;
                    out.println(x + " " + answer);
                }
            }
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

