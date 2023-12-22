import java.util.*;
import java.util.stream.LongStream;

public class Main {
    static int[] dp;
    static int n;
    static int m;
    static int s;
    static int t;
    static long arigane = (long) 1e15;
    static int[][][] graph;
    static PriorityQueue<Path> paths;
    static long min = Long.MAX_VALUE;
    static List<Long> ret = new ArrayList<>();
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
            solve(n - i - 1);
            paths.clear();
        }
        Collections.reverse(ret);
        ret.forEach(System.out::println);
    }

    static void solve(int year) {
        hoge: {
            paths.add(new Path(s, new HashSet<>(), 0, 0));
            while (true) {
                Path c = paths.poll();
                if(c.current == year) {
                    paths.clear();
                    c.isYen = 1;
                    paths.add(c);
                    break hoge;
                }
                for (int i = 0; i < n; i++) {
                    if (graph[c.isYen][c.current][i] > 0) {
                        Status nextStatus = new Status(i, c.isYen);
                        if (c.itta.contains(nextStatus)) {
                            continue;
                        }
                        Path next = new Path(i, c.itta, c.score + graph[c.isYen][c.current][i], c.isYen);
                        paths.add(next);
                    }
                }
            }
        }

        hoge: {
            while(true) {
                Path c = paths.poll();
                if(c.current == t) {
                    paths.clear();
                    paths.add(c);
                    break hoge;
                }
                for (int i = 0; i < n; i++) {
                    if (graph[c.isYen][c.current][i] > 0) {
                        Status nextStatus = new Status(i, c.isYen);
                        if (c.itta.contains(nextStatus)) {
                            continue;
                        }
                        Path next = new Path(i, c.itta, c.score + graph[c.isYen][c.current][i], c.isYen);

                        paths.add(next);
                    }
                }
            }
        }
        Path c = paths.poll();
        min = Math.min(c.score, min);
        ret.add(arigane - min);
    }

    static void solve1(int year) {

    }

    static class Path {
        int current;
        Set<Status> itta = new HashSet<>();
        int isYen = 0;
        long score;

        Path(int current, Set<Status> itta, long score, int isYen) {
            this.current = current;
            this.itta = new HashSet<>(itta);
            this.itta.add(new Status(current, isYen));
            this.score = score;
            this.isYen = isYen;
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