import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.LinkedList;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            Queue<TaskC.State> bfs = new LinkedList<>();
            Set<int[]> cache = new TreeSet<>((n1, n2) -> {
                for (int i = 0; i < n1.length; i++) {
                    if (n1[i] < n2[i]) return -1;
                    if (n1[i] > n2[i]) return 1;
                }
                return 0;
            });

            TaskC.State f = new TaskC.State(new int[]{a, b, c}, 0);
            bfs.add(f);
            cache.add(f.num);

            while (!bfs.isEmpty()) {
                TaskC.State st = bfs.poll();

                if (st.num[0] == st.num[1] && st.num[1] == st.num[2]) {
                    out.println(st.steps);
                    return;
                }

                for (int i = 0; i < 3; i++) {
                    for (int dx = -1; dx <= 2; dx += 3) {
                        int[] nnum = st.num.clone();
                        nnum[i] += dx;

                        if (!cache.contains(nnum)) {
                            TaskC.State nst = new TaskC.State(nnum, st.steps + 1);
                            cache.add(nst.num);
                            bfs.add(nst);
                        }
                    }
                }
            }


        }

        static class State {
            int[] num;
            int steps;

            public State(int[] num, int steps) {
                this.num = num;
                this.steps = steps;
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

