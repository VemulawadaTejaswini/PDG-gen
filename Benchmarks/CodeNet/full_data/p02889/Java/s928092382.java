import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		ArrayList<Edge>[] edges = new ArrayList[n];
		for(int i = 0; i < n; i++){
		    edges[i] = new ArrayList<Edge>();
		}
		for(int i = 0; i < m; i++){
		    int from = sc.nextInt();
		    int to = sc.nextInt();
		    int weight = sc.nextInt();
		    
		    edges[from -1].add(new Edge(from, to, weight));
		    edges[to -1].add(new Edge(to, from, weight));
		}
		int q = sc.nextInt();
		int[][] st = new int[q][2];
		for(int i = 0; i < q; i++){
		    st[i][0] = sc.nextInt();
		    st[i][1] = sc.nextInt();
		}
		
		// 計算
		HashMap<Integer, Vertex[]> map = new HashMap<Integer, Vertex[]>();
		for(int i = 0; i < q; i++){
		    if(map.containsKey(st[i][0])){
		        Vertex[] vs = map.get(st[i][0]);
		        Vertex v = vs[st[i][1] - 1];
		        //System.out.println("from:" + st[i][0] + " to " + v.toString());
		        int result = -1;
		        if(v.distance != 1001001001){
		            result = v.cnt;
		        }
		        System.out.println(result);
		    }else{
		        Vertex[] vs = dijkstra(n, edges, st[i][0], l);
		        map.put(st[i][0], vs);
		        Vertex v = vs[st[i][1] - 1];
		        //System.out.println("from:" + st[i][0] + " to " + v.toString());
		        int result = -1;
		        if(v.distance != 1001001001){
		            result = v.cnt;
		        }
		        System.out.println(result);
		    }
		}
		//Vertex[] v = dijkstra(n, edges, st[0][0]);
		
		// 出力
		//System.out.println(Arrays.toString(v));
        
	}
	
	static Vertex[] dijkstra(int n, ArrayList<Edge>[] edges, int startId, int l){
	    Vertex[] v = new Vertex[n];
	    int INF = 1001001001;
	    int s = startId - 1;

	    for(int i = 0; i < n; i++){
	        v[i] = new Vertex(i+1, INF, new ArrayList<Integer>(), l, 0);
	    }
	    
	    PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
	    Vertex start = new Vertex(startId, 0, new ArrayList<Integer>(), l, 0);
	    pq.add(start);
	    
	    while(!pq.isEmpty()){
	        Vertex now = pq.poll();
	        if(v[now.id - 1].distance <= now.distance) continue;
	        now.path.add(now.id);
	        v[now.id - 1] = now;
	        //System.out.println(now.toString());
	        
	        for(Edge e : edges[now.id - 1]){
	            Vertex adj = v[e.to - 1];
	            int d = e.weight;
	            if(adj.distance > now.distance + d){
	                int nowl = now.l;
	                int nowcnt = now.cnt;
	                if(nowl - d < 0){
	                    nowl = l - d;
	                    nowcnt++;
	                }else{
	                    nowl = nowl - d;
	                }
	                pq.add(new Vertex(adj.id, now.distance + d, new ArrayList<Integer>(now.path), nowl, nowcnt));
	            }
	        }
	    }
	    
	    return v;
	}
}

// ◆◆グラフの辺クラス◆◆
class Edge {
    int from;
    int to;
    int weight;
    
    Edge(int from, int to, int weight){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public String toString(){
        return "from:" + from + " to:" + to + " weight:" + weight;
    }
    
}

// ◆◆グラフの頂点クラス◆◆
class Vertex implements Comparable<Vertex> {
    int id;
    int distance;
    ArrayList<Integer> path;
    int l;
    int cnt;
    
    Vertex(int id, int distance, ArrayList<Integer> path, int l, int cnt){
        this.id = id;
        this.distance = distance;
        this.path = path;
        this.l = l;
        this.cnt = cnt;
    }

	@Override
	public int compareTo(Vertex v) {
	    int order = 0;
	    
		// 第1ソートキー
	    order = Integer.compare(this.id, v.id);

		return order;
	}
    public String toString(){
        return "id:" + id + " distance:" + distance + " path:" + path.toString() + " cnt:" + cnt;
    }
    
}