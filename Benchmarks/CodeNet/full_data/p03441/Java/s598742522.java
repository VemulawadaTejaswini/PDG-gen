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
        z = new boolean[n];
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

    private boolean dfs(int x) {
        z[x] = true;
        int j = head[x];
        boolean s = false;
        int k = 0;
        while (j >= 0) {
            int y = dst[j];
            if (!z[y]) {
                if (!dfs(y))
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
        return s;
    }

    int n, m;
    int[] head;
    int[] nx;
    int[] src;
    int[] dst;
    boolean[] z;
    int last;

    private void solve() throws IOException {
        int n = nextInt();
        init(n, n - 1);
        for (int i = 0; i < n - 1; i++) {
            int x = nextInt();
            int y = nextInt();
            addEdge(x, y);
        }
        int i = 0;
        while (nx[head[i]] != -1) i++;
        dfs(i);
        res++;
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
