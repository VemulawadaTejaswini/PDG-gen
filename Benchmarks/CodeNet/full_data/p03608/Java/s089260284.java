import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int N, M, R;
        List<Integer> r = new ArrayList<>();
        int ans = Integer.MAX_VALUE;

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            M = in.nextInt();
            R = in.nextInt();
            for (int i = 0; i < R; ++i) r.add(in.nextInt() - 1);

            FloydWarshall flw = new FloydWarshall(N);
            for (int i = 0; i < M; ++i) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                int c = in.nextInt();
                flw.addEdge(a, b, c);
                flw.addEdge(b, a, c);
            }
            flw.setDistances();

            for (List<Integer> towns : new PatternUtils<>(r).permutation(R)) {
                int cost = 0;
                for (int i = 0; i < R - 1; ++i) {
                    cost += flw.getDistance(towns.get(i), towns.get(i + 1));
                }
                ans = Math.min(cost, ans);
            }

            out.println(ans);
        }
    }

    static class FloydWarshall {
        private static int INF = Integer.MAX_VALUE;
        private int size;
        private int[][] d;

        public FloydWarshall(int n) {
            this.size = n;
            this.d = new int[n][n];
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    d[i][j] = i == j ? 0 : INF;
        }

        public void addEdge(int src, int dest, int weight) {
            d[src][dest] = weight;
        }

        public int getDistance(int src, int dest) {
            return d[src][dest];
        }

        public void setDistances() {
            for (int k = 0; k < size; ++k) {
                for (int i = 0; i < size; ++i) {
                    if (d[i][k] == INF) continue;
                    for (int j = 0; j < size; ++j) {
                        if (d[k][j] == INF) continue;
                        d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                    }
                }
            }
        }

        public boolean hasNegativeCycle() {
            for (int i = 0; i < size; ++i) {
                if (d[i][i] < 0) return true;
            }
            return false;
        }
    }

    static class PatternUtils<E> {
        private int[] indexes;
        private List<E> original;
        private List<List<E>> pattern;

        public PatternUtils(List<E> l) {
            this.original = l;
            this.indexes = new int[original.size()];
            for (int i = 0; i < original.size(); ++i)
                indexes[i] = i;
        }

        void search(int[] perm, Stack<E> stack, int rem) {
            if (rem == 0 || perm.length == 0) {
                pattern.add(new ArrayList<>(stack));
            } else {
                int[] nperm = Arrays.copyOfRange(perm, 1, perm.length);
                for (int i = 0; i < perm.length; ++i) {
                    stack.push(original.get(perm[i]));
                    search(nperm, stack, rem - 1);
                    if (i < nperm.length)
                        nperm[i] = perm[i];
                    stack.pop();
                }
            }
        }

        List<List<E>> permutation(int n) {
            pattern = new ArrayList<>();

            search(indexes, new Stack<>(), n);

            return pattern;
        }

        void csearch(int[] perm, Stack<E> stack, int rem, int prevIdx) {
            if (rem == 0 || perm.length == 0) {
                pattern.add(new ArrayList<>(stack));
            } else {
                int[] nperm = Arrays.copyOfRange(perm, 1, perm.length);
                for (int i = 0; i < perm.length; ++i) {
                    stack.push(original.get(perm[i]));
                    if (perm[i] > prevIdx)
                        csearch(nperm, stack, rem - 1, perm[i]);
                    if (i < nperm.length)
                        nperm[i] = perm[i];
                    stack.pop();
                }
            }
        }

        List<List<E>> combination(int n) {
            pattern = new ArrayList<>();

            csearch(indexes, new Stack<>(), n, -1);

            return pattern;
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}