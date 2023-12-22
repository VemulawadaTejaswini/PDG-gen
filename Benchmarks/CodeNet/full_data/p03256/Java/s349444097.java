import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        char[] s = in.next().toCharArray();
        int[] id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = (s[i] == 'A' ? 0 : 1);
        }
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int fr = in.nextInt() - 1;
            int to = in.nextInt() - 1;
            g[fr].add(to);
            g[to].add(fr);
        }
        int[][] cnt = new int[2][n];
        for (int i = 0; i < n; i++) {
            for (int to : g[i]) {
                cnt[id[to]][i]++;
            }
        }
        boolean[] good = new boolean[n];
        Arrays.fill(good, true);
        List<Integer> bad = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (cnt[0][i] == 0 || cnt[1][i] == 0) {
                good[i] = false;
                bad.add(i);
            }
        }
        while (bad.size() > 0) {
            int v = bad.get(bad.size() - 1);
            bad.remove(bad.size() - 1);
            for (int to : g[v]) {
                cnt[id[v]][to]--;
                if (good[to] && (cnt[0][to] == 0 || cnt[1][to] == 0)) {
                    good[to] = false;
                    bad.add(to);
                }
            }
        }
        boolean haveGood = false;
        for (boolean z : good) {
            haveGood |= z;
        }
        out.println(!haveGood ? "No" : "Yes");
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