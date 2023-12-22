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
            String s = in.next();
            int n = s.length();
            int[] ans = new int[n];
            int i = 0;
            while (i < n) {
                int lR = len(s, n, i, 'R');
                int j = i + lR;
                int lL = len(s, n, j, 'L');
                int sum = lR + lL;
                int v1, v2;
                if (sum % 2 == 0)
                    v1 = v2 = sum / 2;
                else {
                    int half1 = sum / 2 + 1;
                    int half2 = sum - half1;
                    if (lR % 2 == 0) {
                        v1 = half2;
                        v2 = half1;
                    } else {
                        v2 = half2;
                        v1 = half1;
                    }
                }
                ans[j - 1] = v1;
                ans[j] = v2;
                i = j + lL;
            }
            for (int el : ans)
                out.print(el + " ");
        }

        private static int len(String s, int n, int beg, char c) {
            int cnt = 0;
            int j = beg;
            while (j < n && s.charAt(j) == c) {
                j++;
                cnt++;
            }
            return cnt;
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

    }
}

