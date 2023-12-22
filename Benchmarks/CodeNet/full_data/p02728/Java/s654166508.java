import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.function.BiFunction;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.ArrayList;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FDistributingIntegers solver = new FDistributingIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDistributingIntegers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Edge> edges = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                edges.add(new Edge(in.nextInt() - 1, in.nextInt() - 1, 0));
            }
            ModComb mc = new ModComb(n);
            ReRooting<FDistributingIntegers.Data> reRooting = new ReRooting<>(
                    edges,
                    n,
                    new FDistributingIntegers.Data(new ModInt(1), 0),
                    (x, y) -> {
                        int cnt = x.size + y.size;
                        return new FDistributingIntegers.Data(x.comb.mul(y.comb)
                                .mul(mc.getFac(cnt))
                                .mul(mc.getInv(x.size))
                                .mul(mc.getInv(y.size)), cnt);
                    },
                    (x, id) -> new FDistributingIntegers.Data(x.comb, x.size + 1)
            );

            for (int i = 0; i < n; i++) {
                out.println(reRooting.query(i).comb.toString());
            }
        }

        static class Data {
            ModInt comb;
            int size;

            private Data(ModInt m, int size) {
                comb = m;
                this.size = size;
            }

        }

    }

    static class ModInt {
        long val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (i + MOD) % MOD;
        }

        public ModInt mul(long l) {
            return new ModInt(this.val * l);
        }

        public ModInt mul(ModInt m) {
            return new ModInt(this.val * m.getVal());
        }

        public ModInt inv() {
            return this.pow(MOD - 2);
        }

        public ModInt pow(long l) {
            ModInt res = new ModInt(1);
            ModInt v = new ModInt(this.val);
            while (l > 0) {
                if (l % 2 != 0) {
                    res = res.mul(v.val);
                }
                v = v.mul(v.val);
                l /= 2;
            }
            return res;
        }

        public long getVal() {
            return val;
        }

        public String toString() {
            return Long.toString(val);
        }

    }

    static class Edge {
        public int from;
        public int to;
        public long cost;

        public Edge(int to) {
            this.to = to;
        }

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }

    static class ModComb {
        private int size;
        private ModInt[] fac;
        private ModInt[] inv;

        public ModComb(int n) {
            size = n;
            fac = new ModInt[n + 1];
            inv = new ModInt[n + 1];
            makeFac();
        }

        private void makeFac() {
            for (int i = 0; i <= size; i++) {
                if (i == 0) {
                    fac[i] = new ModInt(1);
                } else {
                    fac[i] = fac[i - 1].mul(i);
                }
                inv[i] = fac[i].inv();
            }
        }

        public ModInt getFac(int n) {
            return fac[n];
        }

        public ModInt getInv(int n) {
            return inv[n];
        }

    }

    static class ReRooting<T> {
        int size;
        T unit;
        BinaryOperator<T> operator;
        BiFunction<T, Integer, T> nodeOperator;
        T[][] dp;
        T[] res;
        ArrayList<Integer>[] adj;
        ArrayList<Integer>[] index4Adj;

        public ReRooting(ArrayList<Edge> edges, int size, T unit, BinaryOperator<T> operator, BiFunction<T, Integer, T> nodeOperator) {
            this.size = size;
            adj = new ArrayList[size];
            index4Adj = new ArrayList[size];
            for (int i = 0; i < size; i++) {
                adj[i] = new ArrayList<>();
                index4Adj[i] = new ArrayList<>();
            }
            for (Edge e : edges) {
                index4Adj[e.from].add(adj[e.to].size());
                index4Adj[e.to].add(adj[e.from].size());
                adj[e.to].add(e.from);
                adj[e.from].add(e.to);
            }
            this.unit = unit;
            this.operator = operator;
            this.nodeOperator = nodeOperator;
            dp = GenArray.newArray(size, size, unit);
            res = GenArray.newArray(size, unit);
            for (int i = 0; i < size; i++) {
                Arrays.fill(dp[i], unit);
            }
            Arrays.fill(res, unit);
            if (size > 1) init();
            else res[0] = this.nodeOperator.apply(unit, 0);
        }

        private void init() {
            int[] par = new int[size];
            int[] ord = new int[size];

            int index = 0;
            ArrayDeque<Integer> stack = new ArrayDeque<>();
            stack.push(0);
            par[0] = -1;
            while (!stack.isEmpty()) {
                int node = stack.pop();
                ord[index++] = node;
                for (Integer nxt : adj[node]) {
                    if (nxt == par[node]) continue;
                    stack.push(nxt);
                    par[nxt] = node;
                }
            }

            for (int i = ord.length - 1; i >= 1; i--) {
                int node = ord[i];
                int parent = par[node];
                int parIdx = -1;
                T acc = unit;
                for (int j = 0; j < adj[node].size(); j++) {
                    if (adj[node].get(j) == parent) {
                        parIdx = j;
                    } else {
                        acc = operator.apply(acc, dp[node][j]);
                    }
                }
                dp[parent][index4Adj[node].get(parIdx)] = nodeOperator.apply(acc, node);
            }

            // 葉に向かう
            for (int node : ord) {
                T acc = unit;
                T[] fromLeaf = GenArray.newArray(adj[node].size(), unit);
                fromLeaf[fromLeaf.length - 1] = unit;
                for (int j = fromLeaf.length - 1; j >= 1; j--)
                    fromLeaf[j - 1] = operator.apply(dp[node][j], fromLeaf[j]);
                for (int j = 0; j < fromLeaf.length; j++) {
                    dp[adj[node].get(j)][index4Adj[node].get(j)] = nodeOperator.apply(operator.apply(acc, fromLeaf[j]), node);
                    acc = operator.apply(acc, dp[node][j]);
                }
                res[node] = nodeOperator.apply(acc, node);
            }


        }

        public T query(int index) {
            return res[index];
        }

    }

    static class GenArray {
        public static <T> T[] newArray(final int length, final T type) {
            return (T[]) Array.newInstance(type.getClass(), length);
        }

        public static <T> T[][] newArray(final int y, final int x, final T type) {
            return (T[][]) Array.newInstance(type.getClass(), y, x);
        }

    }
}

