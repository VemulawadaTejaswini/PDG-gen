import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		Town[] towns = new Town[n];
		Town[] copy = new Town[n];
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			towns[i] = new Town(Integer.parseInt(tmpArray[0]), Integer.parseInt(tmpArray[1]));
			copy[i] = towns[i];
		}
		
		//xについてソート
		Arrays.sort(copy, new Comparator<Town>() {
			public int compare(Town t1, Town t2){
				return t1.x - t2.x;
			}
		});
		
		//隣接する街のコスト計算
		for(int i = 0; i < n - 1; i++){
			int cost = Math.min(copy[i+1].x - copy[i].x, Math.abs(copy[i+1].y - copy[i].y));
			copy[i].addCost(copy[i+1], cost);
			copy[i+1].addCost(copy[i], cost);
		}
		
		//yについてソート
		Arrays.sort(copy, new Comparator<Town>() {
			public int compare(Town t1, Town t2){
				return t1.y - t2.y;
			}
		});

		//隣接する街のコスト計算
		for(int i = 0; i < n - 1; i++){
			int cost = Math.min(copy[i+1].y - copy[i].y, Math.abs(copy[i+1].x - copy[i].x));
			copy[i].addCost(copy[i+1], cost);
			copy[i+1].addCost(copy[i], cost);
		}
		
		long result = MST(towns);
		System.out.println(result);
	}
	
	static long MST(Town[] towns){
		long cost = 0;
		int n = towns.length;
		boolean[] visited = new boolean[n];
		boolean[] allChecked = new boolean[n];
		
//		Edge[][] edges = new Edge[n][];
//		//すべての辺の情報を格納
//		for(int i = 0; i < n; i++){
//			edges[i] = towns[i].getEdges();
//		}
		
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		//0番目の街から始める
		visited[0] = true;
		Edge[] edges = towns[0].getEdges();
		for(int i = 0; i < edges.length ; i++){
			pq.add(edges[i]);
		}
		
		int count = 0;
		while(!pq.isEmpty()){
			//最小の辺を探す
//			boolean comp = true;
//			int minCost = Integer.MAX_VALUE;
			Edge minEdge = pq.poll();
			visited[minEdge.from] = true;
			if(visited[minEdge.to]){
				continue;
			}
			
			cost += minEdge.cost;
			Town nextTown = towns[minEdge.to];
			
			edges = nextTown.getEdges();
			
			for(int i = 0; i < edges.length ; i++){
				pq.add(edges[i]);
			}
//			for(int i = 0; i < n; i++){
//				if(!visited[i]){
////					System.out.println(i+" is unknown");
//					comp = false;
//					continue;
//				}
//				else if(allChecked[i]){
////					System.out.println("skip");
//					continue;
//				}
//				else {
////					System.out.println("i = "+i);
//					boolean noEdge = true;
//					for(int j = 0; j < edges[i].length ; j++){
////						System.out.println("j = "+j);
//						if(!visited[edges[i][j].to]){
//							noEdge = false;
//							if( edges[i][j].cost < minCost){
////								System.out.println("Update");
//								minEdge = edges[i][j];
//								minCost = minEdge.cost;
//							}
//						}
//					}
//					
//					if(noEdge){
//						allChecked[i] = true;
//					}
//				}
//			}
//			
//			if(comp){
//				break;
//			}
//			
//			visited[minEdge.to] = true;
//			if(count % 1000 == 0)System.out.println("visit "+minEdge.to + "remain "+(n - count));
//			cost += minEdge.cost;
			
			count++;
			
		}
		
		return cost;
	}

}

class Edge implements Comparable<Edge>{
	int from;
	int to;
	int cost;
	
	public Edge(Town t1, Town t2, int cost){
		from = t1.id;
		to = t2.id;
		this.cost = cost;
	}
	
	public int compareTo(Edge e){
		return this.cost - e.cost;
	}
	
	public String toString(){
		return "from "+from+" to "+to+" (cost "+cost+")";
	}
}
class Town {
	int x;
	int y;
	int id;
	static int IDSEED = 0;
	HashMap<Town, Integer> map = new HashMap<Town, Integer>();
	
	public Town(int x, int y){
		this.id = IDSEED;
		IDSEED++;
		this.x = x;
		this.y = y;
	}
	
	public void addCost(Town t, int cost){
		if(!map.containsKey(t)){
			map.put(t, cost);
		}
		else if(map.get(t) > cost){
			map.put(t, cost);
		}
	}
	
	public Edge[] getEdges(){
		Edge[] result = new Edge[map.size()];
		Set<Town> set = map.keySet();
		Iterator<Town> it = set.iterator();
		int i = 0;
		while(it.hasNext()){
			Town tmpTown = it.next();
			result[i] = new Edge(this, tmpTown, map.get(tmpTown));
			i++;
		}
		
		return result;
	}
}