import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * https://abc065.contest.atcoder.jp/tasks/arc076_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Point[] points = new Point[N];
		for(int i=0; i<N; i++){
			points[i] = new Point(i, Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}
		sc.close();
		
		Node[] nodes = new Node[N];
		for(int i=0; i<N; i++) nodes[i] = new Node(i);
		Arrays.sort(points, (o1,o2) -> o1.x-o2.x);
		for(int i=1; i<N; i++){
			Point p1 = points[i-1];
			Point p2 = points[i];
			int c = Math.min(Math.abs(p2.x-p1.x), Math.abs(p2.y-p1.y));
			Node a = nodes[p1.i];
			Node b = nodes[p2.i];
			a.neighbor.put(b, c);
			b.neighbor.put(a, c);
		}
		Arrays.sort(points, (o1,o2) -> o1.y-o2.y);
		for(int i=1; i<N; i++){
			Point p1 = points[i-1];
			Point p2 = points[i];
			int c = Math.min(Math.abs(p2.x-p1.x), Math.abs(p2.y-p1.y));
			Node a = nodes[p1.i];
			Node b = nodes[p2.i];
			a.neighbor.put(b, c);
			b.neighbor.put(a, c);
		}
		
		Node[] mst = buildMST(nodes);
		
		long ans = 0;
		for(Node n:mst){
			for(int c:n.neighbor.values()){
				ans += c;
			}
		}
		
		System.out.println(ans);
		
	}
	
	static class Node{
		int id;
		Map<Node,Integer> neighbor = new HashMap<>();
		int color = -1;
		int status = -1;
		int inDegree = 0;
		long cost;
		Node(int id){
			this.id = id;
		}
	}
	
	static class Point{
		int i;
		int x;
		int y;
		Point(int i, int x, int y){
			this.i = i;
			this.x = x;
			this.y = y;
		}
	}
	
	static class Edge{
		Node from;
		Node to;
		int cost;
		Edge(Node parent, Node child, int cost){
			this.from = parent;
			this.to = child;
			this.cost = cost;
		}
	}
	
	static Node[] buildMST(Node[] nodeList) {
		Node base = nodeList[0];
		Node[] mst = new Node[nodeList.length];
		PriorityQueue<Edge> que = new PriorityQueue<>(new Comparator<Edge>(){
			public int compare(Edge e1, Edge e2) {
				return e1.cost < e2.cost ? -1 : 1;
			}
		});
		mst[base.id] = new Node(base.id);
		for(Entry<Node, Integer> n: base.neighbor.entrySet()){
			que.add(new Edge(base, n.getKey(), n.getValue()));
		}
		for(int i=1; i<mst.length; i++){
			Edge minEdge = null;
			while(true){
				minEdge = que.remove();
				if(mst[minEdge.to.id]==null) break;
			}
			mst[minEdge.to.id] = new Node(minEdge.to.id);
			mst[minEdge.from.id].neighbor.put(mst[minEdge.to.id], minEdge.cost);
			for(Entry<Node, Integer> entry: minEdge.to.neighbor.entrySet()){
				if(mst[entry.getKey().id]==null)
					que.add(new Edge(minEdge.to, entry.getKey(), entry.getValue()));
			}
		}
		return mst;
	}

}