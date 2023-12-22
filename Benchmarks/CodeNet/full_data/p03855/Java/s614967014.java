import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DConnectivity solver = new DConnectivity();
        solver.solve(1, in, out);
        out.close();
    }

    static class DConnectivity {
        private final int UNDEF = -1;
        private int nCities;

        private void addEdge(int v, int u, Vertex[] vs) {
            vs[v].outgo.add(u);
            vs[u].outgo.add(v);
        }

        private void dfs(int v, Vertex[] vs, int[] comp, int curComp) {
            comp[v] = curComp;
            vs[v].comp = curComp;
            for (int next : vs[v].outgo) {
                if (comp[next] == UNDEF) {
                    dfs(next, vs, comp, curComp);
                }
            }
        }

        private ArrayList<HashSet<Integer>> getComps(Vertex[] vs) {
            int curComp = 0;
            int[] comp = new int[nCities];
            Arrays.fill(comp, UNDEF);
            for (int i = 0; i < nCities; i++) {
                if (comp[i] == UNDEF) {
                    dfs(i, vs, comp, curComp++);
                }
            }
            ArrayList<HashSet<Integer>> set = new ArrayList<>();
            for (int i = 0; i < curComp; i++) {
                set.add(new HashSet<>());
            }
            for (int i = 0; i < nCities; i++) {
                set.get(comp[i]).add(i);
            }
            return set;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            nCities = in.nextInt();
            int nRoads = in.nextInt();
            int nRails = in.nextInt();
            Vertex[] roads = new Vertex[nCities];
            for (int i = 0; i < nCities; i++) {
                roads[i] = new Vertex();
            }
            Vertex[] rails = new Vertex[nCities];
            for (int i = 0; i < nCities; i++) {
                rails[i] = new Vertex();
            }
            for (int i = 0; i < nRoads; i++) {
                addEdge(in.nextInt() - 1, in.nextInt() - 1, roads);
            }
            for (int i = 0; i < nRails; i++) {
                addEdge(in.nextInt() - 1, in.nextInt() - 1, rails);
            }

            ArrayList<HashSet<Integer>> roadComps = getComps(roads);
            ArrayList<HashSet<Integer>> railComps = getComps(rails);
            for (int i = 0; i < nCities; i++) {
//            HashSet<Integer> compRoads = roadComps.get(roads[i].comp);
//            HashSet<Integer> common = new HashSet<>(compRoads);
//            HashSet<Integer> compRails = railComps.get(rails[i].comp);
//            common.retainAll(compRails);
//            out.print(common.size() + " ");
                out.print("1 ");
            }
        }

        private class Vertex {
            private int comp;
            private ArrayList<Integer> outgo = new ArrayList<>();

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void close() {
            writer.close();
        }

    }
}

