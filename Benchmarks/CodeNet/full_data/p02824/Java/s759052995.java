import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.util.Collections;
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
        OutputWriter out = new OutputWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int V = in.nextInt();
            int P = in.nextInt();
            Long A[] = new Long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextLong();
            }
            Arrays.sort(A, Collections.reverseOrder());
            int ans = P;
            int remaining = N - 1;
            BigInteger sum = BigInteger.valueOf(A[P - 1]);
            BigInteger m = BigInteger.valueOf(M);
            for (int i = P; i < N; i++) {
                if (V <= remaining) {
                    if (A[i] + M >= A[P - 1]) {
                        ans++;
                    }
                } else {
                    BigInteger rem = m.multiply(BigInteger.valueOf(V - remaining));
                    BigInteger points = rem.add(sum);
                    int people = i - P + 1;
                    BigInteger maxPoints = points.divide(BigInteger.valueOf(people));
                    if (points.remainder(BigInteger.valueOf(people)).compareTo(BigInteger.ZERO) > 0) {
                        maxPoints = maxPoints.add(BigInteger.ONE);
                    }

                    if (BigInteger.valueOf(A[i]).add(m).compareTo(maxPoints) >= 0 && A[i] + M >= A[P - 1]) {
                        ans++;
                    }
                }
                sum = sum.add(BigInteger.valueOf(A[i]));
                remaining--;
            }
            out.printLine(ans);
        }

    }

    static class OutputWriter {
        PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tokenizer = null;

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(in.readLine());
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                return null;
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

