import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int x = sc.nextInt()-1;
		int y = sc.nextInt()-1;
		Graph g = new Graph(n, false);
		for(int i = 0; i < n-1; i++){
		    g.add(i, i+1);
		}
		g.add(x, y);
		
		// 計算
		long result = 0;
		int[] cnt = new int[n];
		for(int i = 0; i < n; i++){
		    long[] dist = g.dijkstra(i);
		    for(int j = 0; j < n; j++){
		        cnt[(int)dist[j]]++;
		    }
		}
		for(int i = 1; i < n; i++){
		    System.out.println(cnt[i]/2);
		}
		
		// 出力
		//System.out.println(result);
	}
}


class Graph {
    int n; // N
    boolean directed;
    ArrayList<Edge>[] adjList; // M
    long[][] dist;
    ArrayList<Integer>[][] path;
    long INF = 1001001001001001001L;

    public Graph (int n, boolean directed) {
        this.n = n;
        this.directed = directed;
        this.adjList = new ArrayList[n];
        for(int i = 0; i < n; i++){
			adjList[i] = new ArrayList<Edge>();
		}
        this.dist = new long[n][n];
        for(int i = 0; i < n; i++){
			Arrays.fill(dist[i], INF);
			dist[i][i] = 0;
		}
		//this.path = new ArrayList[n][n];
    }
    
    public void add(int from, int to) {
        add(from, to, 1);
    }
    public void add(int from, int to, int w) {
        adjList[from].add(new Edge(from, to, w));
        if(!directed) adjList[to].add(new Edge(to, from, w));
    }
    
    public long[] bfs(int from) { // O(M)
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        q.add(from);
        while(!q.isEmpty()){
            int now = q.poll();
            for(Edge e : adjList[now]){
                if(dist[from][e.to] != INF) continue;
                dist[from][e.to] = dist[from][now] + 1;
                q.add(e.to);
            }
        }
        return dist[from];
    }
    
    public long[] dijkstra(int from) { // O(MlogM)
        PriorityQueue<Vertex> q = new PriorityQueue<Vertex>((x, y) -> Long.compare(x.distance, y.distance));
        q.add(new Vertex(from, 0, new ArrayList<Integer>(Arrays.asList(from))));
        while(!q.isEmpty()){
            Vertex now = q.poll();
            if(from != now.id && now.distance > dist[from][now.id]) continue; 
            dist[from][now.id] = now.distance;
            //path[from][now.id] = now.path;
            for(Edge e : adjList[now.id]){
                long newDist = now.distance + e.w;
                if(dist[from][e.to] <= newDist) continue;
                dist[from][e.to] = newDist;
                ArrayList<Integer> path = new ArrayList<Integer>(now.path);
                path.add(e.to);
                q.add(new Vertex(e.to, newDist, path));
            }
        }
        return dist[from];
    }
    
    
    
    public long[][] wf() { // O(N^3)
		for(ArrayList<Edge> list : adjList){
		    for(Edge e : list){
		        dist[e.from][e.to] = e.w;
		    }
		}
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
		return dist;
	}
	
	public String toString(){
	    StringBuilder sb = new StringBuilder();
	    for(ArrayList<Edge> list : adjList){
	        for(Edge e : list){
	            sb.append(e.toString());
	            sb.append("\n");
	        }
	    }
	    return sb.toString();
	}
	
	public String distToString(){
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	            if(dist[i][j] == INF){
	                sb.append("from:" + i + " to:" + j + " dist:INF" + "\n");
	            }else{
	                sb.append("from:" + i + " to:" + j + " dist:" + dist[i][j] + "\n");
	            }
	        }
	    }
	    return sb.toString();
	}
    
    class Edge {
        int from;
        int to;
        int w;
        
        Edge(int from, int to, int w){
            this.from = from;
            this.to = to;
            this.w = w;
        }
        
        public String toString(){
            return "from:" + from + " to:" + to + " w:" + w;
        }
    }
    
    class Vertex {
        int id;
        long distance;
        ArrayList<Integer> path;
        
        Vertex(int id, long distance, ArrayList<Integer> path){
            this.id = id;
            this.distance = distance;
            this.path = path;
        }
        
        public String toString(){
            return "id:" + id + " distance:" + distance + " path:" + path.toString();
        }
    }
    
}
