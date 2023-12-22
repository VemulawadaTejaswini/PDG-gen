import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Pavel Mavrin
 */
public class Main {

    void init(int n, int m) {
        m *= 2;
        this.n = n;
        this.m = m;
        last = 0;
        head = new int[n];
        nx = new int[m];
        dst = new int[m];
        src = new int[m];
        Arrays.fill(head, -1);
    }

    void addEdge(int x, int y) {
        nx[last] = head[x];
        src[last] = x;
        dst[last] = y;
        head[x] = last;
        last++;
        nx[last] = head[y];
        src[last] = y;
        dst[last] = x;
        head[y] = last;
        last++;
    }

    int res = 0;
    boolean qqq = false;

    private boolean dfs(int x, int p) {
        int j = head[x];
        boolean s = false;
        int k = 0;
        while (j >= 0) {
            int y = dst[j];
            if (y != p) {
                if (!dfs(y, x))
                    k++;
                else
                    s = true;
            }
            j = nx[j];
        }
//        System.out.println(x + " " + k);
        if (k >= 2) {
            res += k - 1;
            s = true;
//            System.out.println(res);
        }
        qqq = k > 0;
        return s;
    }

    int n, m;
    int[] head;
    int[] nx;
    int[] src;
    int[] dst;
    int last;

    private void solve() throws IOException {
        int n = nextInt();
        init(n, n - 1);
        int[] d = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int x = nextInt();
            int y = nextInt();
            d[x]++;
            d[y]++;
            addEdge(x, y);
        }
        res = 1;
        for (int i = 0; i < n; i++) {
            if (d[i] > 2) {
                res = 0;
                dfs(i, -1);
                break;
            }
        }
        out.println(res);
    }

    // ------------------

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PrintWriter out = new PrintWriter(System.out);

    String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        solve();
        out.close();
    }

}
