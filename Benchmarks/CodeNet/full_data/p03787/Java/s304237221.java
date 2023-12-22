import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Aksenov239 on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public void solveA() throws IOException {
        int n = nextInt();
        int c = nextInt();
        int k = nextInt();

        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = nextInt();
        }

        Arrays.sort(t);

        int ans = 0;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < i + c && j < n && t[j] <= t[i] + k) {
                j++;
            }
            i = j;
            ans++;
        }
        out.println(ans);
    }

    public void solveB() throws IOException {
        int n = nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }

        Arrays.sort(a);

        int l = -1;
        int r = n;
        while (l < r - 1) {
            int m = (l + r) / 2;
            long size = a[m];
            for (int i = 0; i < m; i++) {
                size += a[i];
            }
            int i = m + 1;
            while (i < n && 2 * size >= a[i]) {
                size += a[i];
                i++;
            }
            if (i == n) {
                r = m;
            } else {
                l = m;
            }
        }
        out.println(n - r);
    }

    int[] color;
    ArrayList<Integer>[] e;
    int size;

    public boolean dfs(int v, int c) {
        color[v] = c;
        size++;
        boolean ans = true;
        for (int u : e[v]){
            if (color[u] == 0) {
                ans &= dfs(u, 3 - c);
            } else {
                ans &= color[v] + color[u] == 3;
            }
        }
        return ans;
    }

    public void solveC() throws IOException {
        int n = nextInt();
        int m = nextInt();
        e = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            e[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int a = nextInt() - 1;
            int b = nextInt() - 1;
            e[a].add(b);
            e[b].add(a);
        }
        color = new int[n];
        long k1 = 0;
        long k2 = 0;
        for (int i = 0; i < n; i++) {
            if (color[i] == 0) {
                size = 0;
                if (dfs(i, 1) && size > 1) {
                    k1++;
                } else {
                    k2++;
                }
            }
        }
        out.println(4 * k1 * k1 + 4 * k1 * k2 + k2 * k2);
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solveC();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
