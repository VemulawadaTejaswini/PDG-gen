import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static class SegmentTree {
        int N;
        int[] tree;

        public SegmentTree(int n) {
            N = n;
            tree = new int[N << 2];
        }

        private static int left(int p) {
            return p << 1;
        }

        private static int right(int p) {
            return left(p) | 1;
        }

        private static int mid(int L, int R) {
            return (L + R) >> 1;
        }

        public void update(int idx, int val) {
            update(1, 0, N - 1, idx, val);
        }

        private void update(int p, int L, int R, int idx, int val) {
            if (idx < L || idx > R) return;
            if (idx == L && idx == R) tree[p] += val;
            else {
                int mid = mid(L, R), left = left(p), right = left | 1;
                update(left, L, mid, idx, val);
                update(right, mid + 1, R, idx, val);
                tree[p] = tree[left] + tree[right];
            }
        }

        public long query(int i, int j) {
            return query(1, 0, N - 1, i, j);
        }

        private long query(int p, int L, int R, int i, int j) {
            if (L > j || R < i) return 0;
            if (L >= i && R <= j) return tree[p];
            int mid = mid(L, R), left = left(p), right = left | 1;
            return query(left, L, mid, i, j) + query(right, mid + 1, R, i, j);
        }
    }

    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt(), K = sc.nextInt();
        SegmentTree st = new SegmentTree(N);
        for (int b = K + 1; b <= N; b++)
            for (int j = 0; j <= N; j += b)
                st.update(j, 1);
        long ans = 0;
        for (int k = K; k <= N - 1; k++) {
            if (k == 0) for (int b = 1; b <= N; b++) ans += N / b;
            else {
                int low = 0, high = N, res = -1;
                while (low <= high) {
                    int mid = (low + high) >> 1;
                    if (mid + k <= N) {
                        res = mid;
                        low = mid + 1;
                    } else high = mid - 1;
                }
                if (res != -1) ans += st.query(0, res);
            }
            for (int j = 0; j <= N; j += k + 1) st.update(j, -1);
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    private static class MyScanner {
        StringTokenizer st;
        BufferedReader br;

        public MyScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public MyScanner(String filename) throws IOException {
            br = new BufferedReader(new FileReader(new File(filename)));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}
