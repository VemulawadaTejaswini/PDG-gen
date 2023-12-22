    import java.io.OutputStream;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.PrintWriter;
    import java.util.HashMap;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.HashSet;
    import java.util.AbstractCollection;
    import java.util.StringTokenizer;
    import java.util.Map;
    import java.util.Map.Entry;
    import java.io.BufferedReader;
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
            FMustBeRectangular solver = new FMustBeRectangular();
            solver.solve(1, in, out);
            out.close();
        }
     
        static class FMustBeRectangular {
            static final int MAX = 100_000;
            HashMap<Integer, HashSet<Integer>> xToY;
            HashMap<Integer, HashSet<Integer>> yToX;
     
            public void solve(int testNumber, InputReader in, PrintWriter out) {
                int n = in.nextInt();
                xToY = new HashMap<>();
                yToX = new HashMap<>();
     
                for (int i = 0; i < n; i++) {
                    int x = in.nextInt(), y = in.nextInt();
                    addXY(x, y);
                    addYX(x, y);
                }
     
                UnionFind equalX = new UnionFind(MAX + 1);
     
    //        System.out.println(xToY);
    //        System.out.println(yToX);
     
                for (Map.Entry<Integer, HashSet<Integer>> e : xToY.entrySet()) {
                    int x = e.getKey();
                    for (int y : e.getValue()) {
                        for (int x2 : yToX.get(y)) {
                            equalX.union(x, x2);
                        }
                    }
                }
     
                HashMap<Integer, HashSet<Integer>> xToYAfter = new HashMap<>();
     
                for (int i = 1; i <= MAX; i++) {
                    if (!xToY.containsKey(i))
                        continue;
     
                    int x = equalX.rep(i);
                    if (!xToYAfter.containsKey(x)) {
                        xToYAfter.put(x, new HashSet<>());
                    }
                    xToYAfter.get(x).addAll(xToY.get(i));
                }
     
                long answer = 0;
                for (Map.Entry<Integer, HashSet<Integer>> e : xToYAfter.entrySet()) {
                    answer += ((long) e.getValue().size()) * equalX.size(e.getKey());
                }
                answer -= n;
     
                out.println(answer);
            }
     
            private void addXY(int x, int y) {
                if (!xToY.containsKey(x))
                    xToY.put(x, new HashSet<>());
                xToY.get(x).add(y);
            }
     
            private void addYX(int x, int y) {
                if (!yToX.containsKey(y))
                    yToX.put(y, new HashSet<>());
                yToX.get(y).add(x);
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
     
        static class UnionFind {
            private int[] __rep;
            private int[] __size;
     
            public UnionFind(int n) {
                __rep = new int[n];
                __size = new int[n];
                for (int i = 0; i < n; i++) {
                    __rep[i] = i;
                    __size[i] = 1;
                }
            }
     
            public int rep(int x) {
                if (__rep[x] == x) {
                    return x;
                }
     
                int r = rep(__rep[x]);
                __rep[x] = r;
                return r;
            }
     
            public int size(int x) {
                return __size[rep(x)];
            }
     
            public void union(int x, int y) {
                x = rep(x);
                y = rep(y);
     
                if (x == y) {
                    return;
                }
     
                if (size(x) < size(y)) {
                    int t = x;
                    x = y;
                    y = t;
                }
     
                // now size(x) >= size(y)
     
                __rep[y] = x;
                __size[x] += __size[y];
            }
     
        }
    }
     