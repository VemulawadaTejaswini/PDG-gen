import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            List<TaskE.Vertex> vs = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                TaskE.Vertex v = new TaskE.Vertex();
                v.index = i;
                vs.add(v);
            }
            for (int i = 0; i < n - 1; ++i) {
                TaskE.Vertex a = vs.get(in.nextInt() - 1);
                TaskE.Vertex b = vs.get(in.nextInt() - 1);
                a.blueAdj.add(b);
                b.blueAdj.add(a);
            }
            for (int i = 0; i < n - 1; ++i) {
                TaskE.Vertex a = vs.get(in.nextInt() - 1);
                TaskE.Vertex b = vs.get(in.nextInt() - 1);
                a.redAdj.add(b);
                b.redAdj.add(a);
            }
            List<TaskE.Candidate> cands = new ArrayList<>();
            for (TaskE.Vertex a : vs) {
                for (TaskE.Vertex b : a.blueAdj) {
                    if (a.index < b.index && a.redAdj.contains(b)) {
                        cands.add(new TaskE.Candidate(a, b));
                    }
                }
            }
            for (int ptr = 0; ptr < cands.size(); ++ptr) {
                TaskE.Candidate ca = cands.get(ptr);
                TaskE.Vertex a = ca.a;
                TaskE.Vertex b = ca.b;
                if (a.blueAdj.size() + a.redAdj.size() < b.blueAdj.size() + b.redAdj.size()) {
                    TaskE.Vertex t = a;
                    a = b;
                    b = t;
                }
                if (!a.blueAdj.remove(b)) throw new RuntimeException();
                if (!b.blueAdj.remove(a)) throw new RuntimeException();
                if (!a.redAdj.remove(b)) throw new RuntimeException();
                if (!b.redAdj.remove(a)) throw new RuntimeException();
                for (TaskE.Vertex c : b.blueAdj) {
                    if (!a.blueAdj.add(c)) throw new RuntimeException();
                    if (!c.blueAdj.remove(b)) throw new RuntimeException();
                    if (!c.blueAdj.add(a)) throw new RuntimeException();
                    if (a.redAdj.contains(c)) {
                        cands.add(new TaskE.Candidate(a, c));
                    }
                }
                for (TaskE.Vertex c : b.redAdj) {
                    if (!a.redAdj.add(c)) throw new RuntimeException();
                    if (!c.redAdj.remove(b)) throw new RuntimeException();
                    if (!c.redAdj.add(a)) throw new RuntimeException();
                    if (a.blueAdj.contains(c)) {
                        cands.add(new TaskE.Candidate(a, c));
                    }
                }
            }
            out.println(cands.size() == n - 1 ? "YES" : "NO");
        }

        static class Vertex {
            int index;
            Set<TaskE.Vertex> blueAdj = new HashSet<>();
            Set<TaskE.Vertex> redAdj = new HashSet<>();

        }

        static class Candidate {
            TaskE.Vertex a;
            TaskE.Vertex b;

            public Candidate(TaskE.Vertex a, TaskE.Vertex b) {
                this.a = a;
                this.b = b;
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

