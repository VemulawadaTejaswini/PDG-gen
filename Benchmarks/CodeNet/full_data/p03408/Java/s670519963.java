import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Collection;
import java.util.HashMap;
import java.io.IOException;
import java.util.OptionalInt;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        BTwoColorsCardGame solver = new BTwoColorsCardGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTwoColorsCardGame {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            HashMap<String, Integer> scores = new HashMap<>();

            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                String s = in.next();
                scores.put(s, scores.getOrDefault(s, 0) + 1);
            }

            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                String s = in.next();
                scores.put(s, scores.getOrDefault(s, 0) - 1);
            }

            int answer = scores.values().stream().mapToInt(x -> x).max().getAsInt();
            answer = Math.max(0, answer);

            out.println(answer);
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

