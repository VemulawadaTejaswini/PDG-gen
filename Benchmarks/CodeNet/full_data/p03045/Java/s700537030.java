
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        try {
//			solveA();
            //			solveB();
            //			solveC();
            //			solveD();
            //			solveD2();
            solveE();
            //			 solveF();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }

    }

    private void solveA() {
        int n = nextInt();
        int k = nextInt() - 1;
        StringBuilder builder = new StringBuilder(next());

        out.println(builder.replace(k, k + 1, builder.substring(k, k + 1).toLowerCase()).toString());
    }

    private void solveA2() {
        int n = nextInt();
        int k = nextInt();
        String[] wk = next().split("");
        wk[k - 1] = wk[k - 1].toLowerCase();

        String res = Arrays.stream(wk).collect(Collectors.joining(""));

        out.println(res);
    }

    private void solveB() {
        int wk = nextInt();

        int front = wk / 100;
        int back = wk % 100;

        if ((0 < front && front <= 12) && (back <= 0 || back > 12)) {
            out.println("MMYY");
        } else if ((0 < back && back <= 12) && (front <= 0 || front > 12)) {
            out.println("YYMM");
        } else if ((0 < front && front <= 12) && (0 < back && back <= 12)) {
            out.println("AMBIGUOUS");
        } else {
            out.println("NA");
        }

    }

    private void solveC() {
        int n = nextInt();
        int k = nextInt();

        BigDecimal res = new BigDecimal("0");
        for (int i = 1; i <= n; i++) {
            int pow = recursiveC(i, k);
            /*
             * コインの裏表は1/2なので0.5のn乗
             * ダイス面がiの時、0.5^pow
             */
            BigDecimal powB = new BigDecimal("0.5").pow(pow);
            //足しておく
            res = res.add(powB);
        }

        //最後、一括でダイス面で割る
        out.println(res.divide(new BigDecimal(n), 11, RoundingMode.HALF_UP));
    }

    /**
     * 何回×2したらnを超えるのかを返す
     *
     * @param i
     * @param n
     * @return
     */
    private int recursiveC(int i, int n) {
        if (i >= n) {
            return 0;
        }
        return recursiveC(i * 2, n) + 1;
    }

    private void solveD() {
        int n = nextInt();

        int[] u = new int[n - 1];
        int[] v = new int[n - 1];
        int[] w = new int[n - 1];

        /*
         * 辺のMapを作成
         */
        Map<Integer, List<Edge>> wk = new TreeMap<Integer, List<Edge>>();

        for (int i = 0; i < n - 1; i++) {
            Edge e = null;
            List<Edge> tmp = null;

            u[i] = nextInt() - 1;
            v[i] = nextInt() - 1;
            w[i] = nextInt();
            /*
             * コストは偶奇以外不要なのでmodしたけど別にしなくてもよかったよね。。。
             */
            int cost = w[i] % 2;
            e = new Edge();
            e.from = u[i];
            e.to = v[i];
            e.cost = cost;
            tmp = wk.getOrDefault(e.from, new ArrayList<Edge>());
            tmp.add(e);
            wk.put(e.from, tmp);

            e = new Edge();
            e.from = v[i];
            e.to = u[i];
            e.cost = cost;
            tmp = wk.getOrDefault(e.from, new ArrayList<Edge>());
            tmp.add(e);
            wk.put(e.from, tmp);
        }
        /*
         * BFS用のQueue
         */
        Deque<Edge> ek = new ArrayDeque<Edge>();
        /*
         * tree探索するための最初のqueの選択
         * なんでもよいわけではなくて、子が一つのものを選択
         * 頂点がN個で辺がN-1個なので、必ずこの条件にあてはまるものがいる。
         * while()の中で最初のqueueだけは自分の行き先を全て見ていないので。
         * まぁ、while()に入る前に位置0のedgeを全てqueueに入れておけば良いだけな気はしている。
         */
        for (List<Edge> edges : wk.values()) {
            if (edges.size() == 1) {
                ek.addLast(edges.get(0));
                break;
            }
        }
        //		ek.addLast(wk.get(0).get(0));
        int[] res = new int[n];
        //色の格納用
        res[0] = 0;
        while (!ek.isEmpty()) {
            Edge e = ek.removeLast();
            /*
             * costの偶奇で塗る色を決定
             */
            if (e.cost % 2 == 0) {
                //偶数ならfromもtoも同じ色
                res[e.to] = res[e.from];
            } else {
                //奇数ならfromと違う色にtoを塗る必要がある
                res[e.to] = 1 - res[e.from];
            }
            //toに子がいるのかの探索
            List<Edge> edges = wk.get(e.to);
            for (Edge edge : edges) {
                /*
                 * 親↔子が循環しないように
                 */
                if (e.from == edge.to) {
                    continue;
                }
                /*
                 * 探索対象なのでQueueにadd
                 */
                ek.addLast(edge);
            }
        }

        for (int resN : res) {
            out.println(resN);
        }

    }

    /**
     * 辺を表すためのinnerクラス
     */
    private static class Edge {
        private int from;
        private int to;
        private int cost;
    }

    private void solveD2() {
        int n = nextInt();

        int[] u = new int[n - 1];
        int[] v = new int[n - 1];
        int[] w = new int[n - 1];

        Map<Integer, List<Edge>> wk = new TreeMap<Integer, List<Edge>>();
        for (int i = 0; i < n - 1; i++) {
            Edge e = null;
            List<Edge> tmp = null;

            u[i] = nextInt() - 1;
            v[i] = nextInt() - 1;
            w[i] = nextInt();
            e = new Edge();
            e.from = u[i];
            e.to = v[i];
            e.cost = w[i];
            tmp = wk.getOrDefault(e.from, new ArrayList<Edge>());
            tmp.add(e);
            wk.put(e.from, tmp);

            e = new Edge();
            e.from = v[i];
            e.to = u[i];
            e.cost = w[i];
            tmp = wk.getOrDefault(e.from, new ArrayList<Edge>());
            tmp.add(e);
            wk.put(e.from, tmp);
        }
        int[] res = new int[n];
        dfs(0, -1, 0, res, wk);
        for (int resN : res) {
            out.println(resN);
        }

    }

    private void dfs(int v, int p, int c, int[] res, Map<Integer, List<Edge>> wk) {
        res[v] = c;
        for (Edge e : wk.get(v)) {
            if (e.to == p) {
                continue;
            }
            if (e.cost % 2 == 0) {
                dfs(e.to, v, c, res, wk);
            } else {
                dfs(e.to, v, 1 - c, res, wk);
            }
        }
    }
    /*
     * OOM
     */
    //	private void solveD() {
    //		int n = nextInt();
    //
    //		int[] u = new int[n - 1];
    //		int[] v = new int[n - 1];
    //		int[] w = new int[n - 1];
    //		long[][] graph = new long[n][n];
    //		for (int i = 0; i < n; i++) {
    //			Arrays.fill(graph[i], Integer.MAX_VALUE / 2);
    //			graph[i][i] = 0;
    //		}
    //		for (int i = 0; i < n - 1; i++) {
    //			u[i] = nextInt() - 1;
    //			v[i] = nextInt() - 1;
    //			w[i] = nextInt();
    //			int cost = w[i] % 2== 0 ? 2 : 1;
    //			graph[u[i]][v[i]] = cost;
    //			graph[v[i]][u[i]] = cost;
    //		}
    //		for (int i = 0; i < n; i++) {
    //			for (int j = 0; j < n; j++) {
    //				for (int k = 0; k < n; k++) {
    //					graph[j][k] = Long.min(graph[j][k], graph[j][i] + graph[i][k]);
    //				}
    //			}
    //		}
    //		for (int i = 0; i < n; i++) {
    //			long color = 0;
    //			if (i == 0) {
    //				color = 0;
    //			} else {
    //				color = graph[0][i] % 2;
    //			}
    //			out.println(color);
    //		}
    //	}

    private void solveE() {
        int n = nextInt();
        int m = nextInt();

        int[] x = new int[m];
        int[] y = new int[m];
        int[] z = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = nextInt() - 1;
            y[i] = nextInt() - 1;
            z[i] = nextInt();
        }
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            int min = Math.min(x[i], y[i]);
            int max = Math.max(x[i], y[i]);
            unionFind.unite(min, max);
        }
        for (int i = 0; i < m; i++) {
            unionFind.getRoot(i);
        }
        out.println(unionFind.getSet().size());
    }

    private static class UnionFind {

        public int[] par;

        public UnionFind(int n) {
            this.par = new int[n];
            for (int i = 0; i < n; i++) {
                par[i] = i;
            }
        }

        public Set<Integer> getSet() {
            return Arrays.stream(par).mapToObj(i -> i).collect(Collectors.toSet());
        }

        public int getRoot(int n) {
            if (par[n] == n) {
                return n;
            } else {
                return par[n] = getRoot(par[n]);
            }
        }

        public void unite(int x, int y) {
            if (!isSame(x, y)) {
                par[x] = y;
            }
        }

        public boolean isSame(int x, int y) {
            return getRoot(x) == getRoot(y);
        }


    }

    private void solveF() {
        int n = nextInt();

        out.println("");
    }

    private final PrintWriter out = new PrintWriter(System.out);
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}