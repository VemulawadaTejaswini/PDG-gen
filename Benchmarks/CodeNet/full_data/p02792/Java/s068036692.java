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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand2 solver = new DHandstand2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand2 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int h[] = new int[100];
            long ans = 0;
            for (int i = 1; i <= n; i++) {
//            out.println((Integer.toString(i).charAt(0)-'0') * 10 + i%10);
                h[(Integer.toString(i).charAt(0) - '0') * 10 + i % 10]++;
                if ((((i % 10) * 10) + Integer.toString(i).charAt(0) - '0') % 10 != (((i % 10) * 10) + Integer.toString(i).charAt(0) - '0') / 10) {
                    ans += 2 * h[((i % 10) * 10) + Integer.toString(i).charAt(0) - '0'];
//                out.println(i + " " + 2 *h[((i % 10) * 10) + Integer.toString(i).charAt(0) - '0']);
                } else {
                    ans += 2 * (h[((i % 10) * 10) + Integer.toString(i).charAt(0) - '0'] - 1) + 1;
//                out.println(i + " " + h[((i%10)*10) + Integer.toString(i).charAt(0)-'0']);
                }
//            out.println(i + " " + h[((i%10)*10) + Integer.toString(i).charAt(0)-'0']);
            }
            out.println(ans);
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

