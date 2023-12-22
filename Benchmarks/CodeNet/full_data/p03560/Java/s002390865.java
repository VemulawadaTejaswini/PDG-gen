import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Queue;
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
            int K = in.nextInt();
            out.println(sumDigits(find2(K)));
        }

        private String find2(int K) {
            Queue<TaskD.Num> queue = new PriorityQueue<>();
            queue.add(new TaskD.Num("1", 1 % K));
            boolean rems[] = new boolean[K];
            rems[1 % K] = true;

            while (!queue.isEmpty()) {
                TaskD.Num num = queue.poll();
                if (num.remainder == 0) return num.repr;

                for (int d = 0; d < 2; d++) {
                    int newRem = (10 * num.remainder + d) % K;

                    if (!rems[newRem]) {
                        rems[newRem] = true;
                        queue.add(new TaskD.Num(num.repr + d, newRem));
                    }

                }
            }
            return "BRAK";
        }

        private static int sumDigits(String s) {
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                ans += (s.charAt(i) - '0');
            }
            return ans;
        }

        private static class Num implements Comparable<TaskD.Num> {
            private String repr;
            private int remainder;

            public Num(String repr, int remainder) {
                this.repr = repr;
                this.remainder = remainder;
            }


            public int compareTo(TaskD.Num that) {
                return sumDigits(this.repr) - sumDigits(that.repr);
            }

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

