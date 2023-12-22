import java.util.*;

class Main {

    /*
     * Segment Tree.
     *
     *  n=4
     *     [      0      ]
     *     [  1  ] [  2  ]
     *     [3] [4] [5] [6]
     *     (0) (1) (2) (3)
     *
     *  For min, change Math.max to Math.min
     */
    static class SegmentTree {
        static int INF = 1<<29;

        int n;
        long[] dat;

        // Find a minimum in [a,b).
        // A node k corresponds to a range [l,r) in the segment tree.
        // So, the initial query should be query(a, b, 0, 0, n)
        private long query(int a, int b, int k, int l, int r) {
            // 1) No cross between [a,b) and [l, r)
            if (r<=a || b<=l) return -INF;

            // 2) [a,b) includes [l ,r)
            if (a <= l && r <= b) return dat[k];

            // 3) otherwise
            long vl = query(a, b, k*2+1, l, (l+r)/2);
            long vr = query(a, b, k*2+2, (l+r)/2, r);

            // ===== CHANGE HERE =====
            // return Math.min(vl, vr);
            return Math.max(vl, vr);
        }

        public SegmentTree(int n_) {
            // Set n to power of 2
            n = 1;
            while (n < n_) n *= 2;

            dat = new long[2*n-1];
            Arrays.fill(dat, -INF);
        }

        // Update the value of the k-th node (zero indexed) to a.
        public void update(int k, long a) {
            k += n - 1;
            dat[k] = a;
            // Climbing up the tree
            while (k>0) {
                k = (k-1)/2;
                dat[k] = Math.max(dat[k*2+1], dat[k*2+2]);
            }
        }

        public long query(int a, int b) {
            return query(a, b, 0, 0, n);
        }

    };

    static int N_MAX=100000+2;
    static int N;
    static long C;
    static List<Long> X;
    static List<Long> V;

    static long solve() {
        long[] toLeft = new long[N+2];
        SegmentTree toRight = new SegmentTree(N+2);

        for (int i=1; i<=N+1; i++) {
            toLeft[i] = toLeft[i-1] + V.get(i) - (X.get(i) - X.get(i-1));
        }

        long tmp1 = 0;
        toRight.update(N+1, 0);
        for (int i=N; i>=0; i--) {
            tmp1 += V.get(i) - (X.get(i+1) - X.get(i));
            toRight.update(i, tmp1);
        }

        List<Long> ret = new ArrayList<>(N+1);
        for (int i=0; i<=N; i++) {
            long tmp2 = toRight.query(i+1, N+1) - X.get(i);
            ret.add(toLeft[i] + Math.max(0L, tmp2));
        }

        return Collections.max(ret);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // * word: next()
        // * integer: nextInt(), nextLong()
        // * string: nextLine()
        N = sc.nextInt();
        C = sc.nextLong();
        X = Arrays.asList(new Long[N+1+1]);
        V = Arrays.asList(new Long[N+1+1]);
        X.set(0, 0L);
        V.set(0, 0L);
        X.set(N+1, C);
        V.set(N+1, 0L);
        for (int i=1; i<=N; i++) {
            X.set(i, sc.nextLong());
            V.set(i, sc.nextLong());
        }
        long ret1 = solve();

        Collections.reverse(X);
        Collections.reverse(V);

        for (int i=0; i<X.size(); i++) {
            X.set(i, C-X.get(i));
        }
        long ret2 = solve();
        System.out.println(Math.max(ret1, ret2));
    }
}
