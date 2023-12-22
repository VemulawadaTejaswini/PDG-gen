import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    ArrayList<Integer>[] g;

    int go(int v, int p) {
        ArrayList<Integer> ch = new ArrayList<>();
        for (int to : g[v]) {
            if (to == p) {
                continue;
            }
            ch.add(go(to, v));
        }
        Collections.sort(ch);
        int sum = 0;
        for (int i = 0; i < ch.size(); i++) {
            sum += Math.max(i == 0 ? 0 : 1, ch.get(i));
        }
        return sum;
    }

    void solve() {
        int n = in.nextInt();
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i + 1 < n; i++) {
            int fr = in.nextInt();
            int to = in.nextInt();
            g[fr].add(to);
            g[to].add(fr);
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (g[i].size() > 2) {
                root = i;
            }
        }
        if (root == -1) {
            out.println(1);
            return;
        }
        out.println(go(root, -1));
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