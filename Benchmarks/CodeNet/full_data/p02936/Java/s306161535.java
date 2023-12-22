import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N;
    static int Q;
    static ArrayList<Edge>[] G;
    static ArrayList<Pair> operate;
    static long[] count;

    public static void init() {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        Q = scanner.nextInt();

        G = new ArrayList[N];
        operate = new ArrayList<>();
        count = new long[N];

        for(int i = 0; i < N; i++) {
            G[i] = new ArrayList<>();
        }

        for(int i = 0; i < N - 1; i++) {
            int from = scanner.nextInt() - 1;
            int to = scanner.nextInt() - 1;

            if(to < from) {
                int tmp = from;
                from = to;
                to = tmp;
            }

            G[from].add(new Edge(from, to));
        }

        for(int i = 0; i < Q; i++) {
            int target = scanner.nextInt() - 1;
            long count = scanner.nextLong();
            operate.add(new Pair(target, count));
        }

        scanner.close();
    }

    public static void dfs(int i, long plus) {
        count[i] += plus;

        for(Edge edge: G[i]) {
            dfs(edge.to, plus);
        }
    }

    public static void main(String[] args) {
        init();

        for(Pair pair: operate) {
            dfs(pair.first, pair.second);
        }

        for(long c: count) {
            System.out.print(c + " ");
        }
    }
}

class Edge {
    int from;
    int to;

    public Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}

class Pair {
    int first; // target vertex
    long second; // count

    public Pair(int first, long second) {
        this.first = first;
        this.second = second;
    }
}