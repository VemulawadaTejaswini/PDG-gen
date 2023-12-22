import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.Comparator;
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

            Graph graph = new Graph(n);
            Graph rev = new Graph(n);
            int[] count = new int[n];
            for (int i = 0; i < n + m - 1; i++) {
                int from = in.nextInt() - 1;
                int to = in.nextInt() - 1;
                graph.addDirectedEdge(from, to);
                rev.addDirectedEdge(to, from);
                count[to]++;
            }

            ArrayDeque<Integer> q = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                if (count[i] == 0) {
                    q.add(i);
                }
            }

            int[] sorted = new int[n];
            Arrays.fill(sorted, -1);
            int index = 0;
            while (!q.isEmpty()) {
                int from = q.poll();
                if (sorted[from] != -1) continue;
                sorted[from] = index++;

                for (int to : graph.get(from)) {
                    count[to]--;
                    if (count[to] == 0) {
                        q.add(to);
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                rev.get(i).sort(Comparator.comparingInt(x -> -sorted[x]));
            }

            for (int i = 0; i < n; i++) {
                if (rev.get(i).isEmpty()) {
                    out.println(0);
                } else {
                    out.println(rev.get(i).get(0) + 1);
                }
            }
        }

    }

    static class Graph {
        int n;
        ArrayList<Integer>[] G;

        public Graph(int n) {
            this.n = n;
            G = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                G[i] = new ArrayList<>();
            }
        }

        public void addDirectedEdge(int from, int to) {
            G[from].add(to);
        }

        public ArrayList<Integer> get(int from) {
            return G[from];
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }
}

