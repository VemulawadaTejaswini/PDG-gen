import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        OutputWriter out = new OutputWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long N = in.nextInt(), A = in.nextInt(), B = in.nextInt();
            long ans = MathUtils.fastExponentization(2, N);
            ans = (ans - 1 + Constants.PRIME_MOD) % Constants.PRIME_MOD;
            ans = (ans - nChooseK(N, A) + Constants.PRIME_MOD) % Constants.PRIME_MOD;
            ans = (ans - nChooseK(N, B) + Constants.PRIME_MOD) % Constants.PRIME_MOD;
            out.printLine(ans);
        }

        public long nChooseK(long N, long K) {
            long num = 1, den = 1;
            for (int i = 1; i <= K; i++) {
                num = (num * (N - K + i)) % Constants.PRIME_MOD;
                den = (den * i) % Constants.PRIME_MOD;
            }
            Long array[] = MathUtils.extendedGcd(den, Constants.PRIME_MOD);
            return (num * array[1]) % Constants.PRIME_MOD;
        }

    }

    static class Constants {
        public static final long PRIME_MOD = (long) 1e9 + 7;

    }

    static class MathUtils {
        public static Long[] extendedGcd(long p, long q) {
            if (q == 0) {
                return new Long[]{p, 1L, 0L};
            }

            Long array[] = extendedGcd(q, p % q);
            long d = array[0];
            long a = array[2];
            long b = array[1] - (p / q) * array[2];

            return new Long[]{d, a, b};
        }

        public static long fastExponentization(long base, long exp) {
            long result = 1;
            while (exp > 0) {
                if (exp % 2 == 1) {
                    result = (result * base) % Constants.PRIME_MOD;
                }
                base = (base * base) % Constants.PRIME_MOD;
                exp /= 2;
            }
            return result % Constants.PRIME_MOD;
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
}

