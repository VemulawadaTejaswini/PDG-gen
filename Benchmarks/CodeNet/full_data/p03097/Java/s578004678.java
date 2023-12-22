import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        CDifferBy1Bit solver = new CDifferBy1Bit();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDifferBy1Bit {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();
            int n = 1 << k;
            int a = in.nextInt(), b = in.nextInt();

            if (Integer.bitCount(a ^ b) % 2 == 0) {
                out.println("NO");
                return;
            }

            out.println("YES");
            int[] answer = solveAbsolute(a, b, n);

            StringBuilder sb = new StringBuilder();
            for (int x : answer) {
                sb.append(x + " ");
            }
            sb.deleteCharAt(sb.length() - 1);
            out.println(sb);
        }

        private static int[] solveAbsolute(int a, int b, int n) {
            int d = a ^ b;
            int[] answer = solveRelative(d, n, n - 1);

            for (int i = 0; i < n; i++) {
                answer[i] ^= a;
            }

            return answer;
        }

        private static int[] solveRelative(int d, int n, int bitsToUse) {
            int[] answer = new int[n];

            if (Integer.bitCount(bitsToUse) == 1) {
                return new int[]{0, bitsToUse};
            }

            d &= bitsToUse;

            int bit;
            if (d == 0) {
                bit = Integer.lowestOneBit(bitsToUse);
            } else {
                bit = Integer.lowestOneBit(d);
                d ^= bit;
            }

            int[] half = solveRelative(d, n / 2, bitsToUse ^ bit);
            for (int i = 0; i < n / 2; i++) {
                answer[i] = half[i];
            }
            for (int i = 0; i < n / 2; i++) {
                answer[i + n / 2] = half[n / 2 - 1 - i] | bit;
            }

            return answer;
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

