import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
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
        DMegalomania solver = new DMegalomania();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMegalomania {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            DMegalomania.Job[] jobs = new DMegalomania.Job[n];
            for (int i = 0; i < n; i++) {
                jobs[i] = new DMegalomania.Job(in.nextInt(), in.nextInt());
            }

            Arrays.sort(jobs, Comparator.comparingInt(j -> j.deadline));

            boolean answer = true;
            long curTime = 0;
            for (int i = 0; i < n; i++) {
                curTime += jobs[i].time;
                answer &= (curTime <= jobs[i].deadline);
            }

            out.println(answer ? "Yes" : "No");
        }

        private static class Job {
            final int time;
            final int deadline;

            private Job(int time, int deadline) {
                this.time = time;
                this.deadline = deadline;
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

