import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;


    void solve() {
        int n = in.nextInt();
        boolean[][] g = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String s = in.next();
            for (int j = 0; j < n; j++) {
                g[i][j] = s.charAt(j) == '1';
            }
        }
        int best = -1;
        for (int start = 0; start < n; start++) {
            int[] layer = new int[n];
            Arrays.fill(layer, -1);
            List<Integer> curLayer = new ArrayList<>();
            layer[start] = 0;
            curLayer.add(start);
            while (!curLayer.isEmpty()) {
                List<Integer> nextLayer = new ArrayList<>();
                for (int v : curLayer) {
                    for (int i = 0; i < n; i++) {
                        if (g[v][i] && layer[i] == -1) {
                            layer[i] = layer[v] + 1;
                            nextLayer.add(i);
                        }
                    }
                }
                curLayer = nextLayer;
            }
            int maxLayer = 0;
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (!g[i][j]) {
                        continue;
                    }
                    int d = Math.abs(layer[i] - layer[j]);
                    if (d != 1) {
                        ok = false;
                    }
                }
                maxLayer = Math.max(layer[i], maxLayer);
            }
            if (ok) {
                best = Math.max(best, maxLayer + 1);
            }
        }
        out.println(best);
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
