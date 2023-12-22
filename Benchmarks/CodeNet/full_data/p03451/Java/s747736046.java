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
        CCandies solver = new CCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCandies {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] top = new int[n];
            int[] bottom = new int[n];
            for (int i = 0; i < n; i++)
                top[i] = in.nextInt();
            for (int i = 0; i < n; i++)
                bottom[i] = in.nextInt();

            int sumTop = top[0];
            int sumBottom = 0;
            for (int x : bottom)
                sumBottom += x;

            int answer = sumTop + sumBottom;
            for (int k = 1; k < n; k++) {
                sumTop += top[k];
                sumBottom -= bottom[k - 1];
                answer = Math.max(answer, sumTop + sumBottom);
            }

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

