import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        static GLongestPath.Node[] graph;
        static boolean[] visited;
        static int ans;

        static int dfs(int a) {
            visited[a] = true;
            int res = 0;
            int tmp;
            boolean d5al = false;
            for (int i : graph[a].edges) {
                d5al = true;
                tmp = dfs(i);
                res = Math.max(tmp, res);
            }
            if (d5al) {
                res++;
            }
            ans = Math.max(res, ans);
            return res;
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ans = 0;
            graph = new GLongestPath.Node[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new GLongestPath.Node();
                graph[i].edges = new ArrayList<>();
            }

            visited = new boolean[n];
            int x, y;
            for (int i = 0; i < m; i++) {
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
                graph[x].edges.add(y);
            }
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    dfs(i);
                }
            }
            out.println(ans);

        }

        static class Node {
            ArrayList<Integer> edges;

        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

