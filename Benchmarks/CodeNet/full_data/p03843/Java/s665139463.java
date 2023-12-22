import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

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
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        static final int INF = (int) 1e6;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            TaskF.Vertex[] vs = new TaskF.Vertex[n];
            for (int i = 0; i < n; ++i) {
                vs[i] = new TaskF.Vertex(i);
            }
            for (int i = 0; i < n - 1; ++i) {
                TaskF.Vertex a = vs[in.nextInt() - 1];
                TaskF.Vertex b = vs[in.nextInt() - 1];
                a.adj.add(b);
                b.adj.add(a);
            }
            String likes = in.next();
            for (int i = 0; i < n; ++i) {
                vs[i].liked = likes.charAt(i) == '1';
            }
            vs[0].dfs1(null);
            long res = 1;
            for (TaskF.Vertex a : vs) {
                a.getMaxDepth(null);
            }
            for (TaskF.Vertex a : vs)
                if (a.liked) {
                    ++res;
                    res += Math.max(0, a.max2 - 1);
                }
            for (TaskF.Vertex a : vs)
                if (a.adj.size() >= 2) {
                    for (TaskF.Vertex b : a.adj) {
                        if (b.getMinPropagate(a) <= 0) {
                            ++res;
                        }
                    }
                    int minSimple = a.max3;
                    int minSimpleUpTo2 = a.max2;
                    for (TaskF.Vertex b : a.adj) {
                        int d = Math.max(1, b.getMinPropagate(a));
                        int dd = b.getMaxDepth(a) + 1;
                        minSimple = Math.min(minSimple, Math.max(dd, d));
                        if (b != a.maxVia && b != a.max2Via) {
                            minSimpleUpTo2 = Math.min(minSimpleUpTo2, Math.max(dd, d));
                        }
                        int maxd;
                        if (b == a.maxVia || b == a.max2Via) {
                            maxd = a.max3 - 1;
                        } else {
                            maxd = a.max2 - 1;
                        }
                        res += Math.max(0, Math.min(dd - 1, maxd) - d + 1);
                    }
                    if (!a.liked) {
                        res += Math.max(0, a.max3 - minSimple);
                        res += Math.max(0, a.max2 - Math.max(a.max3, minSimpleUpTo2));
                    }
                }
            out.println(res);
        }

        static class Vertex {
            int index;
            boolean liked;
            int subtreeLiked;
            TaskF.Vertex parent;
            List<TaskF.Vertex> adj = new ArrayList<>();
            int state = 0;
            TaskF.Vertex skipped = null;
            int max = 0;
            TaskF.Vertex maxVia = null;
            int max2 = 0;
            TaskF.Vertex max2Via = null;
            int max3 = 0;
            TaskF.Vertex max3Via = null;

            public Vertex(int index) {
                this.index = index;
            }

            public int getMaxDepth(TaskF.Vertex except) {
                switch (state) {
                    case 0:
                        for (TaskF.Vertex v : adj)
                            if (v != except) {
                                int cur = 1 + v.getMaxDepth(this);
                                if (cur > max) {
                                    max3 = max2;
                                    max3Via = max2Via;
                                    max2 = max;
                                    max2Via = maxVia;
                                    max = cur;
                                    maxVia = v;
                                } else if (cur > max2) {
                                    max3 = max2;
                                    max3Via = max2Via;
                                    max2 = cur;
                                    max2Via = v;
                                } else if (cur > max3) {
                                    max3 = cur;
                                    max3Via = v;
                                }
                            }
                        skipped = except;
                        state = except == null ? 2 : 1;
                        return max;

                    case 1:
                        if (skipped == except) {
                            return max;
                        }
                    {
                        TaskF.Vertex v = skipped;
                        int cur = 1 + v.getMaxDepth(this);
                        if (cur > max) {
                            max3 = max2;
                            max3Via = max2Via;
                            max2 = max;
                            max2Via = maxVia;
                            max = cur;
                            maxVia = v;
                        } else if (cur > max2) {
                            max3 = max2;
                            max3Via = max2Via;
                            max2 = cur;
                            max2Via = v;
                        } else if (cur > max3) {
                            max3 = cur;
                            max3Via = v;
                        }
                        skipped = null;
                        state = 2;
                    }
                    // FALLSTHROUGH

                    case 2:
                        if (except == maxVia) {
                            return max2;
                        } else {
                            return max;
                        }

                    default:
                        throw new RuntimeException();
                }
            }

            public void dfs1(TaskF.Vertex parent) {
                this.parent = parent;
                subtreeLiked = liked ? 1 : 0;
                for (TaskF.Vertex v : adj)
                    if (v != parent) {
                        v.dfs1(this);
                        subtreeLiked += v.subtreeLiked;
                    }
            }

            public int getMinPropagate(TaskF.Vertex dest) {
                if (dest != maxVia) {
                    return INF;
                }
                int res;
                if (liked) {
                    res = Math.max(0, max2 - 1);
                } else {
                    res = INF;
                    for (TaskF.Vertex child : adj)
                        if (child != dest) {
                            res = Math.min(res, child.getMinPropagate(this) - 1);
                        }
                    res = Math.max(res, Math.max(0, max2 - 1));
                }
                return res;
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

