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

    private void solve() throws IOException {
        int n = nextInt();
        init(n);
        for (int i = 0; i < n - 1; i++) {
            addEdge(i + 1, nextInt() - 1);
        }
        dfs(0, -1);
        out.println(d[0]);
    }

    void init(int n) {
        this.n = n;
        this.m = (n - 1) * 2;
        last = 0;
        head = new int[n];
        nx = new int[m];
        dst = new int[m];
        d = new int[n];
        temp = new int[n];
        Arrays.fill(head, -1);
    }


    void addEdge(int x, int y) {
        nx[last] = head[x];
        dst[last] = y;
        head[x] = last;
        last++;
        nx[last] = head[y];
        dst[last] = x;
        head[y] = last;
        last++;
    }

    private void dfs(int x, int p) {
        int j = head[x];
        while (j >= 0) {
            int y = dst[j];
            if (y != p) {
                dfs(y, x);
            }
            j = nx[j];
        }
        int n = 0;
        j = head[x];
        while (j >= 0) {
            int y = dst[j];
            if (y != p) {
                temp[n++] = d[y];
            }
            j = nx[j];
        }
        Arrays.sort(temp, 0, n);
        for (int i = 0; i < n; i++) {
            d[x] = Math.max(d[x], temp[n - 1 - i] + i + 1);
        }
    }

    int n, m;
    int[] head;
    int[] nx;
    int[] dst;
    int[] d;
    int[] temp;
    int last;


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
