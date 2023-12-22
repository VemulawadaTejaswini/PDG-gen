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
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        static DEvenRelation.Node[] graph;
        static boolean[] visited;

        static void dfs(int a, int c) {
            visited[a] = true;
            graph[a].color = c;
            for (DEvenRelation.Pair i : graph[a].edges) {
                if (!visited[i.x]) {
                    if (i.y % 2 == 0) {
                        dfs(i.x, c);
                    } else {
                        dfs(i.x, (c + 1) % 2);
                    }
                }
            }
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            graph = new DEvenRelation.Node[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new DEvenRelation.Node();
                graph[i].edges = new ArrayList<>();
            }
            visited = new boolean[n];
            int x, y, z;
            DEvenRelation.Pair p;
            for (int i = 0; i < n - 1; i++) {
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
                z = sc.nextInt();
                p = new DEvenRelation.Pair();
                p.x = y;
                p.y = z;
                graph[x].edges.add(p);
                p = new DEvenRelation.Pair();
                p.x = x;
                p.y = z;
                graph[y].edges.add(p);
            }
            dfs(0, 0);

            for (int i = 0; i < n; i++) {
                out.println(graph[i].color);
            }
        }

        static class Pair {
            int x;
            int y;

        }

        static class Node {
            ArrayList<DEvenRelation.Pair> edges;
            int color;

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

