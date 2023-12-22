import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashMap;
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
        CGreenBin solver = new CGreenBin();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGreenBin {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            HashMap<String, Integer> count = new HashMap<>();
            int n = in.nextInt();

            for (int i = 0; i < n; i++) {
                char[] c = in.next().toCharArray();
                Arrays.sort(c);
                String s = String.valueOf(c);
                count.put(s, count.getOrDefault(s, 0) + 1);
            }

            long answer = 0;
            for (int x : count.values()) {
                answer += nc2(x);
            }

            out.println(answer);
        }

        long nc2(long n) {
            return n * (n - 1) / 2;
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

