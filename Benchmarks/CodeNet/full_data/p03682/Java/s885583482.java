import java.util.*;
import java.util.stream.Stream;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Prim p = new Prim(n);
        
        int[][] xa = new int[n][];
        int[][] ya = new int[n][];
        
        for(int i=0; i<n; i++){
            xa[i] = new int[]{sc.nextInt(), i};
            ya[i] = new int[]{sc.nextInt(), i};
        }
        
        Arrays.sort(xa, Comparator.comparingInt(o->o[0]));
        Arrays.sort(ya, Comparator.comparingInt(o->o[0]));
        
        
        for(int i=0; i<n-1; i++){
            addEdge(p, xa, i);
            addEdge(p, ya, i);
        }
        
        System.out.println(p.prim());
    }
    
    public static void addEdge(Prim p, int[][] za, int i){
        int from = za[i][1];
        int to = za[i+1][1];
        int cost = za[i+1][0] - za[i][0];
        p.addEdge(from, to, cost);
    }
    
}

class Prim{
    
    public static int n;
    private static List<Edge>[] edge;
    
    public static final int inf = (int)10e9;
    
    public Prim(int n){
        this.n = n;
        
        edge = new List[n];
        for(int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }
    }
    
    public long prim(){
        boolean[] check = new boolean[n];
        Queue<Edge> q = new PriorityQueue<>();
        q.add(new Edge(0,0,0));//だみー
        
        long res = 0;
        
        while(!q.isEmpty()){
            Edge e = q.poll();
            if(check[e.to]){
                continue;
            }
            
            check[e.to] = true;
            res += e.cost;
            
            q.addAll(edge[e.to]);
        }
        
        return res;
    }
    
    public void addEdge(int from, int to, int cost){
        edge[from].add(new Edge(from, to, cost));
        edge[to].add(new Edge(to, from, cost));
    }
    
    class Edge implements Comparable<Edge>{
        public int from = 0;
        public int to = 0;
        public int cost = 0;
        
        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}