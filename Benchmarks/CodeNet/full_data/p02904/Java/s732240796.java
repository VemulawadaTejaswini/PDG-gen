import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    public class SegmentTreePush {
        // += on segment,
        // min on segment

        int[] pushAdd;
        int[] min;
        final int NEUTRAL_ELEMENT = Integer.MAX_VALUE;
        final int START_ELEMENT = 0;
        final int NEUTRAL_PUSH = 0;

        int n;

        SegmentTreePush(int n) {
            this.n = n;
            pushAdd = new int[n * 4];
            min = new int[n * 4];
            init(0, 0, n - 1);
        }

        void init(int v, int l, int r) {
            if (l == r) {
                min[v] = START_ELEMENT;
            } else {
                int m = (l + r) >> 1;
                init(v * 2 + 1, l, m);
                init(v * 2 + 2, m + 1, r);
                min[v] = join(min[v * 2 + 1], min[v * 2 + 2]);
            }
        }

        // TODO: change it
        int join(int leftValue, int rightValue) {
            return Math.min(leftValue, rightValue);
        }

        // TODO: change it
        void apply(int v, int l, int r, int addValue) {
            pushAdd[v] += addValue;
            min[v] += addValue;
        }

        void push(int v, int l, int r) {
            if (pushAdd[v] == NEUTRAL_PUSH) {
                return;
            }
            int m = (l + r) >> 1;
            apply(v * 2 + 1, l, m, pushAdd[v]);
            apply(v * 2 + 2, m + 1, r, pushAdd[v]);
            pushAdd[v] = NEUTRAL_PUSH;
        }

        int get(int v, int l, int r, int needL, int needR) {
            if (needL > needR) {
                return NEUTRAL_ELEMENT;
            }
            if (l == needL && r == needR) {
                return min[v];
            }
            int m = (l + r) >> 1;
            push(v, l, r);
            int leftAns = get(v * 2 + 1, l, m, needL, Math.min(needR, m));
            int rightAns = get(v * 2 + 2, m + 1, r, Math.max(needL, m + 1), needR);
            return join(leftAns, rightAns);
        }

        int get(int l, int r) {
            return get(0, 0, n - 1, l, r);
        }

        void add(int v, int l, int r, int needL, int needR, int addValue) {
            if (needL > needR) {
                return;
            }
            if (l == needL && r == needR) {
                apply(v, l, r, addValue);
            } else {
                int m = (l + r) >> 1;
                push(v, l, r);
                add(v * 2 + 1, l, m, needL, Math.min(needR, m), addValue);
                add(v * 2 + 2, m + 1, r, Math.max(needL, m + 1), needR, addValue);
                min[v] = join(min[v * 2 + 1], min[v * 2 + 2]);
            }
        }

        void add(int l, int r, int addValue) {
            add(0, 0, n - 1, l, r, addValue);
        }
    }


    void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] invPref = new int[n];
        for (int i = 0; i < n - 1; i++) {
            invPref[i + 1] = invPref[i] + (a[i + 1] < a[i] ? 1 : 0);
        }
        SegmentTreePush st = new SegmentTreePush(n);
        for (int i = 0; i < n; i++) {
            st.add(i, i, a[i]);
        }
        SegmentTreePush stMax = new SegmentTreePush(n);
        for (int i = 0; i < n; i++) {
            stMax.add(i, i, -a[i]);
        }
        int res = 1;
        for (int start = 1; start + k <= n; start++) {
            int realMin = st.get(start - 1, start + k - 1);
            int realMax = -stMax.get(start - 1, start + k - 1);
//            System.err.println(start + " " + realMin + " " + realMax);
            if (realMin == a[start - 1] && realMax == a[start + k - 1]) {

            } else {
                res++;
            }
        }
        int cntNoInver = 0;
        for (int start = 0; start + k <= n; start++) {
            int inversions = invPref[start + k - 1] - invPref[start];
            cntNoInver += (inversions == 0 ? 1 : 0);
        }
        res -= Math.max(cntNoInver - 1, 0);
        out.println(res);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
