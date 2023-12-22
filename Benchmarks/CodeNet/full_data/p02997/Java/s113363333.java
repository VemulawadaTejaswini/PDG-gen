
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
            solveE2();
            //			solveE();
//            solveF();
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
        char[] wk = next().toCharArray();
        for (int i = 1; i < wk.length; i++) {
            if (wk[i] == wk[i - 1]) {
                out.println("Bad");
                return;
            }
        }
        out.println("Good");
    }

    private void solveB() {
        int n = nextInt();
        int l = nextInt();

        int total = 0;
        int temp = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            total += l + i - 1;
            if (Math.abs(temp) > Math.abs(l + i - 1)) {
                temp = (l + i - 1);
            }
        }
        out.println(total - temp);
    }

    private void solveC() {
        long a = nextLong();
        long b = nextLong();
        long c = nextLong();
        long d = nextLong();

        long res1 = (b / c) - ((a - 1) / c);
        long res2 = (b / d) - ((a - 1) / d);
        long lcm = getLcm2Args(c, d);
        long res4 = (b / lcm) - ((a - 1) / lcm);

        out.println((b - (a - 1)) - (res1 + res2 - res4));
    }

    public long getLcm2Args(long num1, long num2) {
        return num1 * num2 / getGcd2Args(num1, num2);
    }

    public long getGcd2Args(long num1, long num2) {
        try {
            long wkVal1 = Long.max(num1, num2);
            long wkVal2 = Long.min(num1, num2);
            long res = wkVal1 % wkVal2;
            if (res != 0) {
                return getGcd2Args(wkVal2, res);
            } else {
                return wkVal2;
            }

        } catch (Exception e) {
            System.out.println("num1 : " + num1 + " / num2:" + num2);
            e.printStackTrace();
            return -1;
        }

    }

    private void solveD() {
        int n = nextInt();
        int[][] ab = Stream.generate(() -> new int[]{nextInt(), nextInt()}).limit(n).toArray(int[][]::new);

        Arrays.sort(ab, (x, y) -> {
            int ret = Integer.compare(x[1], y[1]);
            return ret != 0 ? ret : Integer.compare(x[0], y[0]);
        });

        long curTime = 0;
        for (int i = 0; i < n; i++) {
            curTime += ab[i][0];
            if (curTime > ab[i][1]) {
                out.println("No");
                return;
            }
        }
        out.println("Yes");
    }

    private void solveE2() {
        int n = nextInt();
        int k = nextInt();
        int max = (n - 1) * (n - 2) / 2;
        if (max < k) {
            out.println(-1);
            return;
        }
        List<SimplePair> res = new ArrayList<SimplePair>();
        for (int i = 0; i < n - 1; i++) {
            res.add(new SimplePair(i + 1, n));
        }
        int cnt = max - k;
//        int tmp = 0;
        List<SimplePair> edge = new ArrayList<SimplePair>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (i == j)
                    continue;
//                if (tmp > cnt)
//                    break;
//                tmp++;
//                res.add(new SimplePair(i + 1, j + 1));
                edge.add(new SimplePair(i + 1, j + 1));
            }
        }
        for (int i = 0; i < cnt; i++) {
            res.add(edge.get(i));
        }
        out.println(res.size());
        for (SimplePair p : res) {
            out.println(p.k + " " + p.v);
        }
    }

    private static class SimplePair implements Comparable<SimplePair> {
        long k;
        long v;

        public SimplePair(int k, int v) {
            this.k = k;
            this.v = v;
        }

        public SimplePair(long k, long v) {
            this.k = k;
            this.v = v;
        }

        public int compareTo(SimplePair pair) {
            return Long.compare(this.v, pair.v);
        }
    }

    private void solveE() {
        int n = nextInt();
        int k = nextInt();

        /*
         * Kの下限は0
         * 完全グラフ（ある頂点から、他の頂点への距離が全て1）
         *
         * Kの上限は(n-1)(n-2)/2
         * star（ある頂点を起点に、ほかの頂点へ辺が伸びている）
         * 全頂点の組み合わせがn(n-1)/2個
         * 辺をはるので全頂点の組み合わせから(n-1)引く
         */

        long cntEdge = (n - 1) * (n - 2) / 2;
        if (k > cntEdge) {
            out.println(-1);
            return;
        }

        long maxCnt = cntEdge - k + (n - 1);
        long cnt = 0;

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (i == j) {
                    continue;
                }
                if (cnt < maxCnt) {
                    builder.append(i + " " + j + System.lineSeparator());
                }
                cnt++;
            }
        }

        out.println(maxCnt);
        out.println(builder.toString());
    }

    private void solveF() {
        int n = nextInt();
        int[][] xy = IntStream.range(0, n).mapToObj(i -> new int[]{nextInt() - 1, nextInt() - 1}).toArray(int[][]::new);
        final int CONST = 110000;
        Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        for (int[] item : xy) {
            int x = item[0];
            int y = item[1] + CONST;
            graph.put(x, graph.getOrDefault(x, new ArrayList<Integer>()));
            graph.get(x).add(y);
            graph.put(y, graph.getOrDefault(y, new ArrayList<Integer>()));
            graph.get(y).add(x);
        }
        boolean[] visited = new boolean[CONST * 2];
        long res = 0;
        for (int i = 0; i < CONST * 2; i++) {
            long[] cnt = new long[2];
            dfs(graph, visited, cnt, i, CONST);
            res += cnt[0] * cnt[1];
        }
        out.println(res - n);
    }

    private void dfs(Map<Integer, List<Integer>> graph, boolean[] visited, long[] cnt, int i, final int CONST) {
        if (visited[i])
            return;
        visited[i] = true;
        cnt[i / CONST]++;
        for (int next : graph.getOrDefault(i, new ArrayList<Integer>())) {
            dfs(graph, visited, cnt, next, CONST);
        }
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