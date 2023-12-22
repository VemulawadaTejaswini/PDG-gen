import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] vals = new int[m][3];
        for(int i = 0; i < m; i++) {
            vals[i][0] = scanner.nextInt()-1;
            vals[i][1] = scanner.nextInt()-1;
            vals[i][2] = scanner.nextInt();
        }
        Arrays.sort(vals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return b[0] - a[0];
            }
        });
        SegTree sg = new SegTree(n, 0, n-1);
        long[] best = new long[n];
        Arrays.fill(best, Long.MAX_VALUE/3);
        best[n-1] = 0;
        sg.update(1, n-1,0);
        for(int[] vv: vals) {
            long tt =sg.query(1,vv[0] + 1, vv[1]) + vv[2];
            if (tt < best[vv[0]]) {
                best[vv[0]] = tt;
                sg.update(1, vv[0], best[vv[0]]);
            }
        }
        if (best[0] == Long.MAX_VALUE/3) out.println(-1);
        else out.println(best[0]);
        out.flush();
    }
    static class SegTree {
        int[] hi, lo;
        long[] min;
        public SegTree(int ss, int l, int r) {
            hi = new int[4 * ss + 1];
            lo = new int[4 * ss + 1];
            min = new long[4 * ss + 1];
            Arrays.fill(min, Long.MAX_VALUE/3);
            init(1, l, r);
        }
        public void init(int cur, int l, int r) {
            hi[cur] = r;
            lo[cur] = l;
            if (l == r) { return; }
            int mid = (l + r)/2;
            init(cur*2, l, mid);
            init(cur * 2 + 1, mid + 1, r);
        }
        void update(int cur) {
            min[cur] = Math.min(min[cur*2], min[cur*2+1]);
        }
        void update(int cur, int loc, long amt) {
            if (hi[cur] == loc && lo[cur] == loc) {
                min[cur] = amt;
                return;
            }
            int mid = (hi[cur] + lo[cur]) /2;
            if (loc <= mid) update(cur*2, loc, amt);
            else update(cur*2+1, loc, amt);
            update(cur);
        }
        long query(int cur, int l, int r) {
            if (l > hi[cur] || r < lo[cur]) return Long.MAX_VALUE/3;
            if (l <= lo[cur] && r >= hi[cur]) {
                return min[cur];
            }
            long rr = query(cur*2, l, r);
            long ll = query(cur*2+ 1,l, r);
            return Math.min(rr, ll);
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
