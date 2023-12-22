import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMinCostCycle solver = new CMinCostCycle();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMinCostCycle {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            CMinCostCycle.Node[] nodes = new CMinCostCycle.Node[n];
            LinkedList<CMinCostCycle.Node> incom;
            LinkedList<CMinCostCycle.Node> outgo;
            for (int i = 0; i < n; i++) {
                nodes[i] = new CMinCostCycle.Node(i, in.ints(), in.ints());
            }
            Arrays.sort(nodes, Comparator.comparing(node -> node.in));
            incom = new LinkedList<>(Arrays.asList(nodes));
            Arrays.sort(nodes, Comparator.comparing(node -> node.out));
            outgo = new LinkedList<>(Arrays.asList(nodes));

            long ans = 0;
            try {
                outer:
                while (incom.size() > 1) {
                    // System.out.println(incom);
                    // System.out.println(outgo);
                    while (incom.get(0).in < 0) {
                        incom.poll();
                    }
                    while (outgo.get(0).in < 0) {
                        incom.poll();
                    }
                    if (incom.get(0).in < outgo.get(0).out) {
                        CMinCostCycle.Node m = incom.poll();
                        ans += m.in;
                        Iterator<CMinCostCycle.Node> it = outgo.descendingIterator();
                        CMinCostCycle.Node p = it.next();
                        if (p == m) {
                            p = it.next();
                        }
                        it.remove();
                        m.in = p.in;
                        p.out = m.out;
                    } else {
                        CMinCostCycle.Node m = outgo.poll();
                        ans += m.out;
                        Iterator<CMinCostCycle.Node> it = incom.descendingIterator();
                        CMinCostCycle.Node p = it.next();
                        if (p == m) {
                            p = it.next();
                        }
                        it.remove();
                        m.out = p.out;
                        p.in = m.in;
                    }
                }
            } catch (IndexOutOfBoundsException ex) {
            }
            CMinCostCycle.Node last = incom.poll();
            out.println(ans + Math.min(last.in, last.out));
        }

        static class Node {
            int i;
            int in;
            int out;

            public Node(int i, int in, int out) {
                this.i = i;
                this.in = in;
                this.out = out;
            }

            public String toString() {
                return in + "->" + out;
            }

        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

