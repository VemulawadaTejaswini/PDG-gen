import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
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
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            Set<Integer> first = new HashSet<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
            Set<Integer> second = new HashSet<>(Arrays.asList(4, 6, 9, 11));
            Set<Integer> third = new HashSet<>(Arrays.asList(2));
            int x = in.nextInt(), y = in.nextInt();
            List<Set<Integer>> list = Arrays.asList(first, second, third);
            for (int i = 0; i < 3; ++i) {
                if (list.get(i).contains(x) && !list.get(i).contains(y)) {
                    out.println("No");
                    return;
                } else if (list.get(i).contains(y) && !list.get(i).contains(x)) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
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

