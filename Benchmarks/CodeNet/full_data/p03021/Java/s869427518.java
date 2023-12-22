import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    List<Integer>[] g;
    char[] s;

    int getSum(int v, int p, int h) {
        int res = 0;
        if (s[v] == '1') {
            res = h;
        }
        for (int to : g[v]) {
            if (to == p) {
                continue;
            }
            res += getSum(to, v, h + 1);
        }
        return res;
    }

    int[] merge(int[] a, int[] b) {
        int[] res = new int[]{0, a[1] + b[1], a[2] + b[2]};
        int min = Math.min(a[1], b[1]);
        int max = Math.max(a[0], b[0]);
        if (min >= max) {
            if (res[1] % 2 == 1) {
                res[0] = 1;
            }
        } else {
            res[0] = max - min;
        }
        return res;
    }

    int[] go(int v, int p) {
        int[] res = new int[]{0, 0, 0};
        for (int to : g[v]) {
            if (to == p) {
                continue;
            }
            int[] child = go(to, v);
//            System.err.println("cur v = " + v + ", from "+ to + ", re = " + Arrays.toString(child));
            res = merge(child, res);
        }
        if (s[v] == '1') {
            res[2]++;
        }
        res[0] += res[2];
        res[1] += res[2];
        return res;
    }

    int can(int root) {
        int[] r = go(root, root);
        if (r[0] != r[2]) {
            return Integer.MAX_VALUE;
        }
        return getSum(root, root, 0) / 2;
    }

    void solve() {
        int n = in.nextInt();
        s = in.next().toCharArray();
        g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i + 1 < n; i++) {
            int fr = in.nextInt() - 1;
            int to = in.nextInt() - 1;
            g[fr].add(to);
            g[to].add(fr);
        }
        int res = Integer.MAX_VALUE;
        for (int root = 0; root < n; root++) {
//            System.err.println("!" + root + " -> " + can(root));
            res = Math.min(res, can(root));
        }
        out.println(res == Integer.MAX_VALUE ? -1 : res);
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
