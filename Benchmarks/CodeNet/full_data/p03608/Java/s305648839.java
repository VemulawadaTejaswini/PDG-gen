import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    int n, m, r;
    int[] rs;
    int ans;
    boolean[] visited;
    int[][] distances;
    int INF = 1 << 28;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        rs = new int[r];
        for (int i = 0; i < r; i++) {
            rs[i] = sc.nextInt() - 1;
        }
        solve(sc);
    }

    void solve(FastReader sc) {
        distances = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) distances[i][j] = INF;
            }
        }
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1 ;
            int cost = sc.nextInt();
            distances[from][to] = cost;
            distances[to][from] = cost;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    distances[i][j] = Math.min(distances[i][j],
                                distances[i][k] + distances[k][j]);
                }
            }
        }
        ans = INF;
        //visited = new boolean[r];
        //dfs(0, -1, 0);
        int[] a = new int[r];
        for (int i = 0; i < r; i++) {
            a[i] = i;
        }
        while (Permutation.next(a)) {
            int tmp = 0;
            for (int j = 0; j < r - 1; j++) {
                tmp += distances[rs[a[j]]][rs[a[j+1]]];
            }
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }

    static class Permutation {
        public static boolean next(int[] a) {
            int n = a.length;

            int i = n - 1;
            while (i > 0 && a[i - 1] >= a[i])
                i--;
            if (i <= 0)
                return false;

            int j = n - 1;
            while (a[j] <= a[i - 1])
                j--;
            swap(a, i - 1, j);

            int k = n - 1;
            while (i < k)
                swap(a, i++, k--);

            return true;
        }

        private static void swap(int[] a, int i, int j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

    }

    void dfs(int c, int last, int distance) {
        if (c == r) {
            if (distance < ans) {
                ans = distance;
            }
            return;
        }
        for (int i = 0; i < r; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (last == -1) {
                    dfs(c + 1, i, 0);
                } else {
                    dfs(c + 1, i, distance + distances[rs[last]][rs[i]]);
                }
                visited[i] = false;
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
