import java.util.*;

public class Main {
    static int[] dp;
    static int n;
    static int m;
    static int s;
    static int t;
    static long arigane = (long) 1e15;
    static int[][][] graph;
    static PriorityQueue<Path> paths;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt() - 1;
        t = sc.nextInt() - 1;
        graph = new int[2][n][n];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[0][u][v] = a;
            graph[0][v][u] = a;
            graph[1][u][v] = b;
            graph[1][v][u] = b;
        }

        paths = new PriorityQueue<>(Comparator.comparingLong(x -> x.score));

        for (int i = 0; i < n; i++) {
            solve(i- 1);
            paths.clear();
        }
    }

    static void solve(int year) {
        paths.add(new Path(s, new HashSet<>(), 0, 0, -1));
        while (true) {
            Path c = paths.poll();
            if(c.current == t && (c.isYen != 0 || c.current > year)) {
                System.out.println(arigane - c.score);
                return;
            }
            for (int i = 0; i < n; i++) {
                if (graph[c.isYen][c.current][i] > 0) {
                    Status nextStatus = new Status(i, c.isYen);
                    if(c.itta.contains(nextStatus)) {
                        continue;
                    }
                    Path next = new Path(i, c.itta, c.score + graph[c.isYen][c.current][i], c.isYen, c.current);
                    paths.add(next);
                }
            }
            if(c.current > year && c.isYen == 0) {
                for (int i = 0; i < n; i++) {
                    if (graph[c.isYen ^ 1][c.current][i] > 0) {
                        Status nextStatus = new Status(i, c.isYen ^1);
                        if(c.itta.contains(nextStatus)) {
                            continue;
                        }
                        Path next = new Path(i, c.itta, c.score + graph[c.isYen ^ 1][c.current][i], c.isYen ^1, c.current);
                        paths.add(next);
                    }
                }
            }
        }
    }

    static class Path {
        int current;
        Set<Status> itta = new HashSet<>();
        int isYen = 0;
        long score;
        int before;
        Path(int current, Set<Status> itta, long score, int isYen, int before) {
            this.current = current;
            this.itta = new HashSet<>(itta);
            this.itta.add(new Status(current, isYen));
            this.score = score;
            this.isYen = isYen;
            this.before = before;
        }
    }

    static class Status {
        int node;
        int isYen;

        public Status(int node, int isYen) {
            this.node = node;
            this.isYen = isYen;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Status)) return false;

            Status status = (Status) o;

            if (node != status.node) return false;
            return isYen == status.isYen;
        }

        @Override
        public int hashCode() {
            int result = node;
            result = 31 * result + isYen;
            return result;
        }
    }
}