import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        Point[] pts = new Point[n];
        for (int i = 0; i < n; i++)
            pts[i] = new Point(sc.nextInt(), sc.nextInt(), i);
        ArrayList<Edge> edges = new ArrayList<>();
        Arrays.sort(pts, new X());
        for (int i = 0; i < n - 1; i++)
            edges.add(new Edge(pts[i].id, pts[i + 1].id, pts[i + 1].x - pts[i].x));
        Arrays.sort(pts, new Y());
        for (int i = 0; i < n - 1; i++)
            edges.add(new Edge(pts[i].id, pts[i + 1].id, pts[i + 1].y - pts[i].y));
        DSU dsu = new DSU(n);
        long ans = 0;
        Collections.sort(edges);
        for (Edge e : edges)
            if (dsu.union(e.v, e.u)) ans += e.cost;
        out.println(ans);
        out.flush();
        out.close();
    }

    static class DSU {
        int n, p[], size[];

        public DSU(int n) {
            this.n = n;
            p = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++)
                p[i] = i;
        }

        int findParent(int x) {
            return p[x] == x ? x : (p[x] = findParent(p[x]));
        }

        boolean union(int x, int y) {
            x = findParent(x);
            y = findParent(y);
            if (x == y) return false;
            if (size[x] >= size[y]) {
                size[x] += size[y];
                p[y] = x;
            } else {
                p[x] = y;
                size[y] += size[x];
            }
            return true;
        }
    }

    static class Edge implements Comparable<Edge> {
        int u, v, cost;

        public Edge(int u, int v, int cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return cost - o.cost;
        }
    }

    static class X implements Comparator<Point> {

        @Override
        public int compare(Point o1, Point o2) {
            return o1.x - o2.x;
        }
    }

    static class Point {
        int x, y, id;

        public Point(int x, int y, int id) {
            this.x = x;
            this.y = y;
            this.id = id;
        }
    }

    static class Y implements Comparator<Point> {

        @Override
        public int compare(Point o1, Point o2) {
            return o1.y - o2.y;
        }
    }

    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        Scanner() throws FileNotFoundException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] ans = new Integer[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }
    }
}