import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            int n = in.nextInt();
            int m = in.nextInt();
            Job[] ar = new Job[n];
            for (int i = 0; i < n; i++) {
                long day = in.nextInt();
                long rew = in.nextInt();
                ar[i] = new Job(rew, day);
            }
            Arrays.sort(ar, (o1, o2) -> {
                if (o1.rew != o2.rew) {
                    if (o1.rew < o2.rew)
                        return 1;
                    if (o1.rew > o2.rew)
                        return -1;
                    return 0;
                } else {
                    if (o1.day < o2.day)
                        return 1;
                    if (o1.day > o2.day)
                        return -1;
                    return 0;
                }
            });
            long totalRew = 0;
            int j = 0;
            for (int day = 1; day <= m; ) {
                if (j >= n)
                    break;
                else {
                    long curDay = ar[j].day;
                    long finalDay = day + curDay - 1;
                    if (finalDay <= m) {
                        totalRew += ar[j].rew;
                        day++;
                    }
                    j++;
                }
            }
            out.println(totalRew);
        }

        private class Job {
            private long day;
            private long rew;

            public Job(long rew, long day) {
                this.rew = rew;
                this.day = day;
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

