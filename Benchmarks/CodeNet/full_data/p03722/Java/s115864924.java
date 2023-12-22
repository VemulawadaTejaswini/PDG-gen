import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		Graph g = new Graph(n, true);
		for(int i = 0; i < m; i++){
		    int from = sc.nextInt()-1;
		    int to = sc.nextInt()-1;
		    int w = sc.nextInt()*(-1);
		    g.add(from, to, w);
		}
		
		// 計算
		long result = 0;
		if(g.bf(0)){
		    System.out.println("inf");
		    return;
		}else{
		    result = g.dist[n-1]*(-1);
		}
		
		// 出力
		System.out.println(result);
	}
}

class Graph {
	int n;
	boolean directed;
	ArrayList<Edge>[] adjList;
	int m;
	long[] dist;
	long[][] distWF;
	int start;
	int[] prev;
	ArrayList<Integer> path;
	long INF = 1001001001001001001L;

	public Graph (int n, boolean directed) {
		this.n = n;
		this.m = 0;
		this.directed = directed;
		this.adjList = new ArrayList[n];
		for(int i = 0; i < n; i++){
			adjList[i] = new ArrayList<Edge>();
		}
	}
	
	public void add(int from, int to) {
		add(from, to, 1);
	}
	public void add(int from, int to, int w) {
		adjList[from].add(new Edge(from, to, w));
		this.m++;
		if(!directed){
			adjList[to].add(new Edge(to, from, w));
			this.m++;
		}
	}
	
	public boolean bf(int start) { // O(NM)
		this.start = start;
		this.prev = new int[n];
		Arrays.fill(prev, -1);
		prev[start] = start;
		this.dist = new long[n];
		Arrays.fill(dist, INF);
		dist[start] = 0;
		boolean hasNegativeLoop = false;
		for(int i = 0; i < n*2; i++){
			for(int j = 0; j < n; j++){
				for(Edge e : adjList[j]){
					if(dist[e.to] <= dist[e.from] + e.w) continue;
					dist[e.to] = dist[e.from] + e.w;
					prev[e.to] = e.from;
					if(i == n-1) dist[e.to] = -INF;
				}
			}
		}
		if(dist[n-1] <= -INF) hasNegativeLoop = true;
		return hasNegativeLoop;
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
		if(dist != null) return Arrays.toString(dist);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(distWF[i][j] == INF){
					sb.append("from:" + i + " to:" + j + " dist:INF" + "\n");
				}else{
					sb.append("from:" + i + " to:" + j + " dist:" + distWF[i][j] + "\n");
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
		
		Vertex(int id, long distance){
			this.id = id;
			this.distance = distance;
		}
		
		public String toString(){
			return "id:" + id + " distance:" + distance;
		}
	}
}

