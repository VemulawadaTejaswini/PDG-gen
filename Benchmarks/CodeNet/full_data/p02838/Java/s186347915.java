import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            long[] A = new long[N];
            int[] bitCnt = new int[60];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextLong();
                for (int j = 0; j < 60; j++) {
                    if ((A[i] & (1L << j)) > 0) {
                        bitCnt[j]++;
                    }
                }
            }
            BigInteger ans = BigInteger.ZERO;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 60; j++) {
                    if ((A[i] & (1L << j)) > 0) {
                        bitCnt[j]--;
                    }
                }
                for (int j = 0; j < 60; j++) {
                    if ((A[i] & (1L << j)) > 0) {
                        ans = ans.add(BigInteger.valueOf(N - i - 1 - bitCnt[j]).multiply(BigInteger.valueOf(2).pow(j)));
                    } else {
                        ans = ans.add(BigInteger.valueOf(bitCnt[j]).multiply(BigInteger.valueOf(2).pow(j)));
                    }
                }
            }
            out.println(ans.mod(BigInteger.valueOf(1_000_000_007)));
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer stt;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                return null;
            }
        }

        public String next() {
            while (stt == null || !stt.hasMoreTokens()) {
                stt = new StringTokenizer(nextLine());
            }
            return stt.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

