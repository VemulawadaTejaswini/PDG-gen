import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Queue;
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
        OutputWriter out = new OutputWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int N = in.nextInt();
            int graph[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String s = in.next();
                for (int j = 0; j < N; j++) {
                    graph[i][j] = s.charAt(j) - '0';
                }
            }
            int ans = -1;
            for (int i = 0; i < N; i++) {
                ans = Math.max(bfs(graph, i), ans);
            }
            out.printLine(ans);
        }

        public int bfs(int graph[][], int u) {
            Queue<Integer> queue = new LinkedList<>();
            ((LinkedList<Integer>) queue).add(u);
            int N = graph[0].length;
            int set[] = new int[N];
            set[u] = 1;
            while (!queue.isEmpty()) {
                int element = queue.poll();
                for (int i = 0; i < N; i++) {
                    if (graph[element][i] == 0) {
                        continue;
                    }
                    if (set[i] == 0) {
                        set[i] = set[element] + 1;
                        ((LinkedList<Integer>) queue).add(i);
                    } else {
                        if (Math.abs(set[i] - set[element]) != 1) {
                            return -1;
                        }
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                if (set[i] == 0) {
                    return -1;
                } else {
                    max = Math.max(max, set[i]);
                }
            }
            return max;
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tokenizer = null;

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(in.readLine());
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                return null;
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class OutputWriter {
        PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

