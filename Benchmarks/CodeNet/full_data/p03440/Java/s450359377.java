import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        O[] a = new O[n];
        for (int i = 0; i < n; i++) {
            a[i] = new O(i, in.nextInt());
        }
        p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int fr = in.nextInt();
            int to = in.nextInt();
            unite(fr, to);
        }
        O[] groupMin = new O[n];
        for (int i = 0; i < n; i++) {
            int id = get(i);
            if (groupMin[id] == null || groupMin[id].cost > a[i].cost) {
                groupMin[id] = a[i];
            }
        }
        long result = 0;
        int groups = 0;
        for (int i = 0; i < n; i++) {
            if (groupMin[i] != null) {
                groupMin[i].used = true;
                result += groupMin[i].cost;
                groups++;
            }
        }
        if (groups == 1) {
            out.println(0);
            return;
        }
        int more = 2 * (groups - 1) - groups;
        Arrays.sort(a);
        for (O o : a) {
            if (!o.used && more > 0) {
                more--;
                o.used = true;
                result += o.cost;
            }
        }
        if (more > 0) {
            out.println("Impossible");
            return;

        }
        out.println(result);
    }

    int[] p;

    int get(int x) {
        return p[x] == x ? x : (p[x] = get(p[x]));
    }

    void unite(int x, int y) {
        p[get(x)] = get(y);
    }

    class O implements Comparable<O> {
        int id;
        int cost;

        public O(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }

        boolean used;

        @Override
        public int compareTo(O o) {
            return Integer.compare(cost, o.cost);
        }
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