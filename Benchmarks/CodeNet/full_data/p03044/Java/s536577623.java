import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
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
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EvenRelation solver = new EvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class EvenRelation {
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

        public void solve(int testNumber, Reader in, PrintWriter out) throws IOException {
            int nVertices = 0;
            try {
                nVertices = in.nextInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
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

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private InputStream in;
        private byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public Reader(InputStream stream) {
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
            in = stream;
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = in.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

    }
}

