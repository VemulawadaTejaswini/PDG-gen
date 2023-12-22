import java.util.Scanner;

public class Main {
    static int V;
    static int E;
    static Edge[] ES;
    static long[] d;
    static long[] d2;
    static long INF = Long.MIN_VALUE + 10000;
    static boolean isGameEstablish = true;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        V = scanner.nextInt();
        E = scanner.nextInt();

        ES = new Edge[E];
        for(int i = 0; i < E; i++) {
            int from = scanner.nextInt() - 1;
            int to = scanner.nextInt() - 1;
            int cost = scanner.nextInt();
            ES[i] = new Edge(from, to, cost);
        }

        d = new long[V];
        d2 = new long[V];
        for(int i = 0; i < V; i++) d[i] = INF;

        scanner.close();
    }

    private static boolean findNegativeLoop() {
        for(int i = 0; i < V; i++) {
            for(int j = 0; j <E; j++){
                Edge e = ES[j];
                if(d2[e.to] > d2[e.from] + e.cost) {
                    d2[e.to] = d2[e.from] + e.cost;
                    if(i == V - 1) return true;
                }
            }
        }

        return false;
    }

    private static void bellmanford(int s) {
        d[s] = 0;
        while (true) {
            boolean update = false;

            for(int i = 0; i < E; i++) {
                Edge e = ES[i];
                if(d[e.to] < d[e.from] + e.cost) {
                    d[e.to] = d[e.from] + e.cost;
                    update = true;
                }
            }

            if(!update) break;
        }
    }


    public static void main(String args[]) {
        init();

        isGameEstablish = !findNegativeLoop();

        if(isGameEstablish) {
            bellmanford(0);
            System.out.println(d[V - 1]);
        } else {
            System.out.println("inf");
        }
    }
}

class Edge {
    public int from;
    public int to;
    public long cost;

    public Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }


    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}