import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DRestoreTheTree solver = new DRestoreTheTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRestoreTheTree {
        int[][] g;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.NextInt();
            int m = in.NextInt();
            g = GraphExtension.parseGraph_n_m_lines_of_u_v_noSelfLoops(n, m + n - 1, in, false, true);
            int[] inDegree = new int[n];
            for (int[] gg : g) {
                for (int i : gg) {
                    inDegree[i]++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (inDegree[i] == 0) {
                    ArrayDeque<Integer> bfs = new ArrayDeque<>();
                    int[] parent = new int[n];
                    parent[i] = -1;
                    bfs.add(i);
                    while (!bfs.isEmpty()) {
                        int cur = bfs.pollFirst();
                        for (int j : g[cur]) {
                            parent[j] = cur;
                            inDegree[j]--;
                            if (inDegree[j] == 0)
                                bfs.addLast(j);
                        }
                    }
                    for (int j = 0; j < n; j++) {
                        parent[j]++;
                    }
                    out.println(parent);
                    return;
                }
            }
        }

    }

    static class GraphExtension {
        public static int[][] parseGraph_n_e_array_of_u_v_noSelfLoops(final int n, final int[][] e, final boolean directed) {
            int[] edgesCount = countEdgesPerVertex(n, e, directed);
            int[][] graph = new int[n][];
            for (int i = 0; i < n; i++) graph[i] = new int[edgesCount[i]];
            for (int[] i : e)
                graph[i[0]][--edgesCount[i[0]]] = i[1];
            if (!directed)
                for (int[] i : e)
                    graph[i[1]][--edgesCount[i[1]]] = i[0];
            return graph;
        }

        private static int[] countEdgesPerVertex(int n, int[][] e, boolean directed) {
            int[] edgesCount = new int[n];
            for (int[] i : e) {
                edgesCount[i[0]]++;
                if (!directed)
                    edgesCount[i[1]]++;
            }
            return edgesCount;
        }

        public static int[][] parseGraph_n_m_lines_of_u_v_noSelfLoops(final int n, final int m, final InputReader in, final boolean zeroBasedIndex, final boolean directed) {
            int[][] e = in.NextIntMatrix(m, 2, zeroBasedIndex ? 0 : -1);
            return parseGraph_n_e_array_of_u_v_noSelfLoops(n, e, directed);
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

        public int[][] NextIntMatrix(int n, int m, int offset) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = NextInt() + offset;
                }
            }
            return a;
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(Writer out) {
            super(out);
        }

        public OutputWriter(File file) throws FileNotFoundException {
            super(file);
        }

        public OutputWriter(OutputStream out) {
            super(out);
        }

        private void printArray(Object a) {
            int n = Array.getLength(a);
            if (n != 0) {
                this.print(Array.get(a, 0));
                for (int i = 1; i < n; i++) {
                    this.print(" ");
                    this.print(Array.get(a, i));
                }
            }
            this.println();
        }

        public void println(int[] a) {
            printArray(a);
        }

    }
}

