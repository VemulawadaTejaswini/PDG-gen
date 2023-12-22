import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        new Main().go();
    }

    PrintWriter out;
    Reader in;
    BufferedReader br;

    Main() throws IOException {

        try {

            //br = new BufferedReader( new FileReader("input.txt") );
            in = new Reader("input.txt");
            out = new PrintWriter( new BufferedWriter(new FileWriter("output.txt")) );
        }
        catch (Exception e) {

            //br = new BufferedReader( new InputStreamReader( System.in ) );
            in = new Reader();
            out = new PrintWriter( new BufferedWriter(new OutputStreamWriter(System.out)) );
        }
    }

    void go() throws IOException {

        int t = 1;
        while (t > 0) {
            solve();
            //out.println();
            t--;
        }

        out.flush();
        out.close();
    }

    int inf = 2000000000;
    int mod = 1000000007;
    double eps = 0.000000001;

    int n;
    int m;

    ArrayList<Integer>[] g = new ArrayList[100000];
    int[] a;
    void solve() throws IOException {

        TreeSet<Pair> set = new TreeSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            a[i] = x;
            set.add(new Pair(x, i));
            g[i] = new ArrayList<>();
        }

        long ans = 0;

        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            g[x].add(y);
            g[y].add(x);
        }

        int cc = 0;

        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                mx = -1;
                dfs(i, -1);
                ans += a[mx];
                set.remove(new Pair(a[mx], mx));
                cc++;
            }
        }

        if (cc == 1) {
            out.println(0);
            return;
        }

        if (cc%2 == 1) {
            if (set.size() == 0) {
                ans = -1;
            }
            else {
                Pair f = set.pollFirst();
                ans += f.a;
            }
        }

        cc /= 2;

        while (cc > 1) {
            if (set.size() < 2) {
                ans = -1;
                break;
            }
            else {
                ans += set.pollFirst().a;
                ans += set.pollFirst().a;
                cc--;
            }
        }

        out.println(ans != -1 ? ans : "Impossible");
    }

    int mx = -1;
    boolean[] used = new boolean[100000];

    void dfs(int v, int p) {

        used[v] = true;
        if (mx == -1 || a[mx] > a[v])
            mx = v;

        for (int u : g[v])
            if (u != p) {
                dfs(u, v);
            }

    }

    class Pair implements Comparable<Pair>{

        int a;
        int b;

        Pair(int a, int b) {

            this.a = a;
            this.b = b;
        }

        public int compareTo(Pair p) {

            if (a > p.a) return 1;
            if (a < p.a) return -1;
            if (b > p.b) return 1;
            if (b < p.b) return -1;
            return 0;
        }
    }

    class Item {

        int a;
        int b;
        int c;

        Item(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

    class Reader {

        BufferedReader  br;
        StringTokenizer tok;

        Reader(String file) throws IOException {
            br = new BufferedReader( new FileReader(file) );
        }

        Reader() throws IOException {
            br = new BufferedReader( new InputStreamReader(System.in) );
        }

        String next() throws IOException {

            while (tok == null || !tok.hasMoreElements())
                tok = new StringTokenizer(br.readLine());
            return tok.nextToken();
        }

        int nextInt() throws NumberFormatException, IOException {
            return Integer.valueOf(next());
        }

        long nextLong() throws NumberFormatException, IOException {
            return Long.valueOf(next());
        }

        double nextDouble() throws NumberFormatException, IOException {
            return Double.valueOf(next());
        }


        String nextLine() throws IOException {
            return br.readLine();
        }

    }

}