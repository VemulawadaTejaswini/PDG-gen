import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        long c = in.nextLong();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextLong();
        }
        Stack<Line> lines = new Stack<>();
        int start = 0;
        for (int i = 0; i < n; ++i) {

            while (start <= (int) lines.size() - 2) {
                Line A = lines.get(start);
                Line B = lines.get(start + 1);
                if (A.value(h[i]) >= B.value(h[i])) {
                    ++start;
                } else {
                    break;
                }
            }

            long best = 0; // dp[i]
            if (i != 0) {
                best = lines.get(start).value(h[i]) + square(h[i]) + c;
            }
            Line line = new Line(-2 * h[i], (best + square(h[i])));

            while (start <= (int) lines.size() - 2) {
                Line A = lines.get(lines.size() - 2);
                Line B = lines.get(lines.size() - 1);// .back()
                Pair one = A.inter(B);
                Pair two = B.inter(line);
                // one.first/one.second < two.first/two.second
                if (one.first * two.second >= one.second * two.first) {
                    lines.pop();
                } else {
                    break;
                }
            }
            lines.push(line);

            if (i == n - 1) {
                out.println(best);
            }
        }
        out.close();
    }

    static long square(long a) {
        return a * a;
    }

    static class Line {
        long a, b;

        public Line(long a, long b) {
            this.a = a;
            this.b = b;
        }

        long value(long x) {
            return a * x + b;
        }

        Pair inter(Line he) {
            long one = he.b - b;
            long two = a - he.a;
            if (two < 0) {
                one *= -1;
                two *= -1;
            }
            assert (two > 0);
            return new Pair(one, two);
        }
    }

    static class Pair {
        long first, second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}
