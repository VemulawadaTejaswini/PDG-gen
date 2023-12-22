import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        TreeSet<Integer> vals = new TreeSet<>();
        int[][] locs = new int[n][2];
        for(int i = 0;i < n; i++) {
            locs[i][0] = scanner.nextInt();
            locs[i][1] = scanner.nextInt();
            vals.add(locs[i][0]);
            vals.add(locs[i][0] - locs[i][1]);
            vals.add(locs[i][0] + locs[i][1]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        for(int vv: vals) {
            map.put(vv, cnt++);
        }
        SegTree sg = new SegTree(cnt, 0, cnt-1);
        Arrays.sort(locs, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for(int i = 0; i < n; i++) {
            int[] loc = locs[i];
            int left = map.get(loc[0]-loc[1]);
            int right = map.get(loc[0] + loc[1]);
            long best = sg.query(1, 0, left);
            long cval = sg.query(1,right,right);
            if (cval < best + 1) sg.update(1,right,right,best + 1);
        }
        out.println(sg.query(1, 0, cnt-1));
        out.flush();
    }
    static class SegTree {
        int[] hi, lo;long[] max, delta;
        public SegTree(int ss, int l, int r) {
            hi = new int[4 * ss + 1];
            lo = new int[4 * ss + 1];
            delta = new long[4 * ss + 1];
            max = new long[4 * ss + 1];
            init(1, l, r);
        }
        public void init(int cur, int l, int r) {
            hi[cur] = r;
            lo[cur] = l;
            if (l == r) return;
            int mid = (l + r)/2;
            init(cur*2, l, mid);
            init(cur*2 + 1, mid +1, r);
        }
        void prop(int cur) {
            delta[cur*2] += delta[cur];
            delta[cur*2+1] += delta[cur];
            delta[cur] = 0;
        }
        void update(int cur) {
            max[cur] = Math.max(delta[cur*2] + max[cur*2], delta[cur*2+1] + max[cur*2 + 1]);
        }
        long query(int cur, int l, int r) {
            if (l > hi[cur] || r < lo[cur]) return Long.MIN_VALUE;
            if (l <= lo[cur] && r >= hi[cur]) {
                return max[cur] + delta[cur];
            }
            prop(cur);
            long ll = query(cur*2, l, r);
            long rr = query(cur*2 + 1, l, r);
            update(cur);
            return Math.max(ll, rr);
        }
        void update(int cur, int l, int r, long amt) {
            if (l > hi[cur] || r < lo[cur]) return;
            if (l <= lo[cur] && r >= hi[cur]) {
                delta[cur] += amt;
                return;
            }
            prop(cur);
            update(cur*2, l, r,amt);
            update(cur*2+1, l, r,amt);
            update(cur);
        }
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
