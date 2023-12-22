import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private ArrayList<ArrayList<Integer>> edges;
        private HashMap<Set<Integer>, Integer> length = new HashMap<>();
        private int[] color;

        private void dfs(int par, int v) {
            for (int child : edges.get(v)) {
                if (child != par) {
                    int l = length.get(new HashSet<>(Arrays.asList(v, child)));
                    if ((l & 1) == 0) {
                        color[child] = color[v];
                    } else {
                        color[child] = color[v] ^ 1;
                    }
                    dfs(v, child);
                }
            }
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int nVertices = in.nextInt();
            edges = new ArrayList<>(nVertices + 1);
            for (int i = 0; i <= nVertices; i++) {
                edges.add(new ArrayList<>());
            }
            for (int i = 0; i < nVertices - 1; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                int l = in.nextInt();
                edges.get(u).add(v);
                edges.get(v).add(u);
                length.put(new HashSet<>(Arrays.asList(u, v)), l);
            }
            color = new int[nVertices + 1];
            color[1] = 0;
            dfs(0, 1);
            for (int i = 1; i <= nVertices; i++) {
                out.println(color[i]);
            }
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        private InputStream stream;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

    }
}

