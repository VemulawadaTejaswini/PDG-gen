import java.util.*;

public class Main{
    
    public static int[] C;
    public static int[] D;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        
        Dijkstra g = new Dijkstra(n);
        
        for(int i=0; i<m; i++){
            int u = Integer.parseInt(sc.next())-1;
            int v = Integer.parseInt(sc.next())-1;
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            
            g.addEdge(u, v, a, b);
        }
        
        C = new int[n];
        D = new int[n];
        for(int i=0; i<n; i++){
            C[i] = Integer.parseInt(sc.next());
            D[i] = Integer.parseInt(sc.next());
        }
        
        g.build(0, s);
        for (int i=1; i<n; i++) {
            long ans = g.INF;
            for (int j = 0; j <= 2500; j++) {
                ans = Math.min(ans, g.d[i][j]);
            }
            System.out.println(ans);
        }
    }
}


class Dijkstra{
    
    public final long INF = (long)1e18;
    private int n;
    private List<Edge>[] edge;
    public long[][] d;
    
    public Dijkstra(int n){
        this.n = n;
        edge = new List[n];
        for(int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }
        d = new long[n][2501];
    }
    
    public void addEdge(int from, int to, int cost, long time){
        edge[from].add(new Edge(from, to, cost, time));
        edge[to].add(new Edge(to, from, cost, time));
    }
    
    public void build(int from, int gin){
        for(long[] tmp : d){
            Arrays.fill(tmp, INF);
        }
        gin = Math.min(2500, gin);
        d[from][gin] = 0;
        
        //手持ち銀貨が少ない順に処理したい
        PriorityQueue<Vertex> q = new PriorityQueue<>();
        q.add(new Vertex(0, d[from][gin], gin));
        while(q.size() != 0){
            Vertex now = q.poll();
            int v = now.ver;
            int moti = now.gin;
            
            if(d[v][moti] < now.dist) continue;
            if(d[v][Math.min(2500, moti+Main.C[v])] > d[v][moti]+Main.D[v]){
                //両替してキューに入れる
                d[v][Math.min(2500, moti + Main.C[v])] = d[v][moti] + Main.D[v];
                q.add(new Vertex(v, d[v][Math.min(2500, moti+Main.C[v])], Math.min(2500, moti + Main.C[v])));
            }
            
            for(Edge e : edge[v]){
                if(moti - e.cost >= 0 && d[e.to][moti - e.cost] > d[v][moti] + e.time){
                    //次の街へ行ってキューに入れる
                    d[e.to][moti - e.cost] = d[v][moti] + e.time;
                    q.add(new Vertex(e.to, d[e.to][moti - e.cost], moti - e.cost));
                }
            }
        }
        
    }
}

class Edge implements Comparable<Edge>{
    public int from = 0;
    public int to = 0;
    public int cost = 0;
    public long time = 0;
    
    public Edge(int from, int to, int cost, long time) {
        this.from = from;
        this.to = to;
        this.cost = cost;
        this.time = time;
    }
    
    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

class Vertex implements Comparable<Vertex>{
    public int ver = 0;
    public long dist = 0;
    public int gin = 0;
    
    public Vertex(int ver, long dist, int gin) {
        this.ver = ver;
        this.dist = dist;
        this.gin = gin;
    }
    
    @Override
    public int compareTo(Vertex o) {
        long tmp = this.gin - o.gin;
        if(tmp == 0) return 0;
        return (int)(tmp/Math.abs(tmp));
    }
}