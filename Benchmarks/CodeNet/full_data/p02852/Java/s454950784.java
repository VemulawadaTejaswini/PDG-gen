import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Deque;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        FSugoroku solver = new FSugoroku();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSugoroku {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            char[] inputS = in.next().toCharArray(); // len n+1
            boolean[] s = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                s[i] = inputS[i] == '1';
            }

            Deque<Integer> answer = new ArrayDeque<>();

            int cur = n;
            int last = Integer.MAX_VALUE;
            outer:
            while (cur > 0) {
                for (int i = Math.max(0, cur - m); i < cur && i < last - m; i++) {
                    if (!s[i]) {
                        answer.addFirst(cur - i);
                        last = cur;
                        cur = i;
                        continue outer;
                    }
                }
                out.println(-1);
                return;
            }

            out.println(Util.join(answer));
        }

    }

    static class Util {
        public static String join(Iterable i) {
            StringBuilder sb = new StringBuilder();
            for (Object o : i) {
                sb.append(o);
                sb.append(" ");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
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

