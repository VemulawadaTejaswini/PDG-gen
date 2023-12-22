import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        BEvenDegrees solver = new BEvenDegrees();
        solver.solve(1, in, out);
        out.close();
    }

    static class BEvenDegrees {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();

            int[] score = new int[n];

            PriorityQueue<Vertex> vertices = new PriorityQueue<>(Comparator.comparingInt(v -> v.degree));

            HashSet<Integer>[] adj = new HashSet[n];
            for (int i = 0; i < n; i++)
                adj[i] = new HashSet<>();
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                adj[a].add(b);
                adj[b].add(a);
            }

            for (int i = 0; i < n; i++) {
                vertices.add(new Vertex(i, adj[i].size()));
            }

            StringBuilder sb = new StringBuilder();
            while (!vertices.isEmpty()) {
                Vertex v = vertices.poll();
                if (v.degree == 0)
                    continue;
                if (v.degree > adj[v.i].size())
                    continue;

                if (v.degree == 1) {
                    for (int j : adj[v.i]) {
                        adj[j].remove(v.i);
                        vertices.add(new Vertex(j, adj[j].size()));
                        if (score[v.i] == 1) {
                            score[v.i] ^= 1;
                            append(sb, v.i, j);
                        } else {
                            score[j] ^= 1;
                            append(sb, j, v.i);
                        }
                    }
                    adj[v.i].clear();
                    continue;
                }

                while (adj[v.i].size() >= 2) {
                    Iterator<Integer> it = adj[v.i].iterator();
                    for (int j = it.next(); ; j = it.next()) {
                        it.remove();
                        adj[j].remove(v.i);
                        vertices.add(new Vertex(j, adj[j].size()));
                        if (it.hasNext() || score[v.i] == 1) {
                            score[v.i] ^= 1;
                            append(sb, v.i, j);
                        } else {
                            score[j] ^= 1;
                            append(sb, j, v.i);
                        }
                        if (!it.hasNext())
                            break;
                    }
                }
            }

            boolean possible = true;
            for (int x : score) {
                if (x == 1)
                    possible = false;
            }

            out.println(possible ? sb.toString() : "-1");
        }

        static void append(StringBuilder sb, int i, int j) {
            sb.append(String.format("%d %d%n", i + 1, j + 1));
        }

        private class Vertex {
            final int i;
            final int degree;

            private Vertex(int i, int degree) {
                this.i = i;
                this.degree = degree;
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

