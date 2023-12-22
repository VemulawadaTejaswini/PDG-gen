import java.io.*;
import java.util.*;

public class Main {
    static final int INF = Integer.MAX_VALUE / 3;
    /// test
//    public static class SegmentTreeRMQ {
//        int[] a;
//        public SegmentTreeRMQ(int n) {
//            a = new int[n + 1];
//        }
//        public void update(int i, int x) {
//            a[i] = x;
//        }
//        public int query(int l, int r) {
//            int minimum = l == -1 ? 0 : INF;
//            l = Math.max(l, 0);
//            for (int i = l; i < r; i++) {
//                minimum = Math.min(minimum, a[i]);
//            }
//            return minimum;
//        }
//    }
    public static class SegmentTreeRMQ {
        int n;
        int[] a;
        public SegmentTreeRMQ(int n) {
            this.n = n;
            a = new int[n * 4];
        }
        public void update(int i, int x) {
//            a[i] = x;
            update(0, n, 1, i, x);
        }
        public void update(int L, int R, int idx, int i, int val) {
            if (L == i && R == i + 1) {
                a[idx] = val;
                return;
            }
            int mid = (L + R) >> 1;
            if (i < mid) {
                update(L, mid, idx << 1, i, val);
            } else {
                update(mid, R, idx << 1 | 1, i, val);
            }
            a[idx] = Math.min(a[idx << 1], a[idx << 1| 1]);
        }
        public int query(int l, int r) {
//            int minimum = INF;
//            for (int i = l; i < r; i++) {
//                minimum = Math.min(minimum, a[i]);
//            }
//            return minimum;
            return query(0, n, 1, l, r);
        }
        public int query(int L, int R, int idx, int l, int r) {
            if (l <= L && R <= r) return a[idx];
            if (R <= l || r <= L) return INF;
            int mid = (L + R) >> 1;
            return Math.min(query(L, mid, idx << 1, l, r), query(mid, R, idx << 1 | 1, l , r));
        }
    }
    public static class Query implements Comparable<Query> {
        int l, r;

        public Query(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public int compareTo(Query query) {
            if (l == query.l) return Integer.compare(r, query.r);
            return Integer.compare(l, query.l);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] distPrefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            distPrefix[i + 1] = distPrefix[i] + (b[i] == 0 ? 1 : 0);
        }
        int q = sc.nextInt();
        Query[] queries = new Query[q];
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            queries[i] = new Query(l, r);
        }
        Arrays.sort(queries);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        SegmentTreeRMQ st = new SegmentTreeRMQ(n + 1);
        for (int i = 0; i <= n; i++) {
            st.update(i, dp[i] - distPrefix[i]);
        }
        int queryIdx = 0;
        for (int i = 0; i < n; i++) {
            while (queryIdx < q && queries[queryIdx].l == i) {
                int curL = queries[queryIdx].l;
                int curR = queries[queryIdx].r;
                int distR = distPrefix[curR];
                int bestL = st.query(curL, curR);
                dp[curR] = Math.min(dp[curR], distR + bestL);
                st.update(curR, dp[curR] - distPrefix[curR]);
                queryIdx++;
            }
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + b[i]);
            st.update(i + 1, dp[i + 1] - distPrefix[i + 1]);
        }
        System.out.println(dp[n]);
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException{
            return Integer.parseInt(next());
        }
    }
}