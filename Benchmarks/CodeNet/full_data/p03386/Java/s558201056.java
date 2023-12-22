import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        BSmallAndLargeIntegers solver = new BSmallAndLargeIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSmallAndLargeIntegers {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), k = in.nextInt();

            TreeSet<Integer> answer = new TreeSet<>();
            for (int i = 0; i < k; i++) {
                int x = a + i;
                if (x <= b)
                    answer.add(x);

                x = b - i;
                if (x >= a)
                    answer.add(x);
            }

            StringBuilder sb = new StringBuilder();
            for (int x : answer) {
                sb.append(x + " ");
            }
            sb.deleteCharAt(sb.length() - 1);

            out.println(sb);
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

