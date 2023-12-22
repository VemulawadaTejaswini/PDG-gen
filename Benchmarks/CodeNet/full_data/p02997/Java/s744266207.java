import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        EFriendships solver = new EFriendships();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFriendships {
        List<String> answer;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();

            int e = (n - 1) * (n - 2) / 2;

            answer = new ArrayList<>();

            for (int i = 2; i <= n; i++) {
                output(1, i);
            }

            outer:
            for (int i = 2; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (e == k) {
                        break outer;
                    }

                    output(i, j);
                    e--;
                }
            }

            if (e == k) {
                out.println(answer.size());
                for (String s : answer)
                    out.println(s);
            } else {
                out.println(-1);
            }
        }

        private void output(int a, int b) {
            answer.add(a + " " + b);
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

