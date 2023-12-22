import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static ArrayList<Integer>[] g;
    private static int[] match;
    private static boolean[] vis;

    private static int MCBM(int u) {
        if (vis[u]) return 0;
        vis[u] = true;
        for (int v : g[u])
            if (match[v] == -1 || MCBM(match[v]) == 1) {
                match[v] = u;
                return 1;
            }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        N = sc.nextInt();
        int[] rx = new int[N];
        int[] ry = new int[N];
        for (int i = 0; i < N; i++) {
            rx[i] = sc.nextInt();
            ry[i] = sc.nextInt();
        }
        int[] bx = new int[N];
        int[] by = new int[N];
        for (int i = 0; i < N; i++) {
            bx[i] = sc.nextInt();
            by[i] = sc.nextInt();
        }
        g = new ArrayList[N + N];
        for (int i = 0; i < N + N; i++) g[i] = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = rx[i], y = ry[i];
            for (int j = 0; j < N; j++)
                if (x < bx[j] && y < by[j]) {
                    g[i].add(N + j);
                    g[N + j].add(i);
                }
        }
        match = new int[N + N];
        Arrays.fill(match, -1);
        int ans = 0;
        for (int node = 0; node < N; node++) {
            vis = new boolean[N + N];
            ans += MCBM(node);
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
