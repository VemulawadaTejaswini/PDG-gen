import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author dyominov
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
            Job[] jobs = new Job[n];
            for (int i = 0; i < n; i++) {
                jobs[i] = new Job(in.nextInt(), in.nextInt());
            }
            Arrays.sort(jobs);
            long time = 0;
            for (int i = 0; i < n; i++) {
                time += jobs[i].a;
                if (time > jobs[i].b) {
                    out.print("No");
                    return;
                }
            }
            out.print("Yes");
        }

        class Job implements Comparable<Job> {
            int a;
            int b;

            public Job(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Job job = (Job) o;
                return a == job.a &&
                        b == job.b;
            }

            public int hashCode() {
                return Objects.hash(a, b);
            }

            public int compareTo(Job o) {
                return this.b == o.b ? Integer.compare(this.a, this.a) : Integer.compare(this.b, o.b);
            }

        }

    }

    static class InputReader implements AutoCloseable {
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

        public void close() {
        }

    }
}

