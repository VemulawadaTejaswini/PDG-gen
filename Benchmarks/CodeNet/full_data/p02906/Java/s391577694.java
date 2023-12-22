import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long m = in.nextLong();
            TaskD.Vertex[] vs = new TaskD.Vertex[n];
            for (int i = 0; i < n; ++i) vs[i] = new TaskD.Vertex();
            int q = in.nextInt();
            for (int i = 0; i < q; ++i) {
                TaskD.Vertex a = vs[in.nextInt()];
                TaskD.Vertex b = vs[in.nextInt()];
                int c = in.nextInt();
                if (c == 0) {
                    a.one.add(b);
                    b.one.add(a);
                } else {
                    a = get(a);
                    b = get(b);
                    if (a != b) a.p = b;
                }
            }
            for (TaskD.Vertex a : vs) {
                for (TaskD.Vertex b : a.one) {
                    TaskD.Vertex va = get(a);
                    TaskD.Vertex vb = get(b);
                    if (va == vb) {
                        out.println("No");
                        return;
                    } else {
                        TaskD.Vertex wa = get2(a);
                        TaskD.Vertex wb = get2(b);
                        if (wa != wb) {
                            wa.p2 = wb;
                        }
                    }
                }
            }
            for (TaskD.Vertex a : vs) if (a.p == a) a.p3 = a;
            for (TaskD.Vertex a : vs) {
                TaskD.Vertex wa = get2(a);
                if (a != wa) {
                    TaskD.Vertex ua = get(a);
                    TaskD.Vertex ub = get(wa);
                    ua = get3(ua);
                    ub = get3(ub);
                    if (ua == ub) {
                        out.println("No");
                        return;
                    } else {
                        ua.p3 = ub;
                    }
                }
            }
            for (TaskD.Vertex a : vs) ++get(a).numChild;
            long minEdges = n - 1;
            for (TaskD.Vertex a : vs) if (a.p == a && a.numChild > 1) ++minEdges;
            if (minEdges > m) {
                out.println("No");
                return;
            }
            long maxEdges = n - 1;
            for (TaskD.Vertex a : vs)
                if (a.p == a) {
                    if (a.numChild >= 3) {
                        maxEdges += (a.numChild - 1) * (long) (a.numChild - 2) / 2;
                    }
                    TaskD.Vertex r = get3(a);
                    r.maxChild = Math.max(r.maxChild, a.numChild);
                    if (a.numChild == 2) ++r.numTwos;
                }
            int merged = 0;
            int numMerged = 0;
            for (TaskD.Vertex a : vs)
                if (a.p3 == a) {
                    if (a.numTwos > 1) {
                        out.println("No");
                        return;
                    }
                    int repr;
                    if (a.numTwos == 1) {
                        repr = 2;
                    } else {
                        repr = a.maxChild;
                    }
                    if (repr >= 3) {
                        maxEdges -= (repr - 1) * (long) (repr - 2) / 2;
                    }
                    merged += repr;
                    ++numMerged;
                }
            if (merged == 2) {
                if (numMerged == 1) {
                    out.println("No");
                    return;
                }
            }
            if (merged >= 3) {
                maxEdges += (merged - 1) * (long) (merged - 2) / 2;
            }
            if (maxEdges < m) {
                out.println("No");
                return;
            }
            out.println("Yes");
        }

        private TaskD.Vertex get(TaskD.Vertex a) {
            TaskD.Vertex r = a;
            while (r.p != r) {
                r = r.p;
            }
            TaskD.Vertex t = a;
            while (t.p != r) {
                TaskD.Vertex n = t.p;
                t.p = r;
                t = n;
            }
            return r;
        }

        private TaskD.Vertex get2(TaskD.Vertex a) {
            TaskD.Vertex r = a;
            while (r.p2 != r) {
                r = r.p2;
            }
            TaskD.Vertex t = a;
            while (t.p2 != r) {
                TaskD.Vertex n = t.p2;
                t.p2 = r;
                t = n;
            }
            return r;
        }

        private TaskD.Vertex get3(TaskD.Vertex a) {
            TaskD.Vertex r = a;
            while (r.p3 != r) {
                r = r.p3;
            }
            TaskD.Vertex t = a;
            while (t.p3 != r) {
                TaskD.Vertex n = t.p3;
                t.p3 = r;
                t = n;
            }
            return r;
        }

        static class Vertex {
            int numChild;
            int maxChild;
            int numTwos;
            TaskD.Vertex p;
            TaskD.Vertex p2;
            TaskD.Vertex p3;
            List<TaskD.Vertex> one = new ArrayList<>();

            public Vertex() {
                p = this;
                p2 = this;
                p3 = null;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

