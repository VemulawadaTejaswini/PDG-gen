import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	int N;

	private void solve() {
		// input
		Scanner io = new Scanner(System.in);
		N = io.nextInt();
		PriorityQueue<Point> queX = new PriorityQueue<>();
		PriorityQueue<Point> queY = new PriorityQueue<>();
		Node[] node = new Node[N];
		
		for(int i=0;i<N;i++){
			int x = io.nextInt();
			int y = io.nextInt();
			queX.add(new Point(x,i));
			queY.add(new Point(y,i));
			node[i] = new Node();
		}
		
		Point prev = queX.poll();
		Point now;
		while(!queX.isEmpty()){
			now = queX.poll();
			int far = now.dis - prev.dis;
			node[now.id].prevX = new Point (far,prev.id);
			node[prev.id].nextX = new Point (far,now.id);
			prev = now;
		}
		prev = queY.poll();
		while(!queY.isEmpty()){
			now = queY.poll();
			int far = now.dis - prev.dis;
			node[now.id].prevY = new Point (far,prev.id);
			node[prev.id].nextY = new Point (far,now.id);
			prev = now;
		}
		
		boolean[] fin = new boolean[N];
 		PriorityQueue<Point> queR = new PriorityQueue<>();
 		long ans = 0;
 		
 		fin[0] = true;
 		queR.add(node[0].nextX);
 		queR.add(node[0].prevX);
 		queR.add(node[0].nextY);
 		queR.add(node[0].prevY);
 		
 		while(!queR.isEmpty()){
 			now = queR.poll();
 			if(now.id==-1) break;
 			if(fin[now.id]) continue;
 			
 			ans += now.dis;
 			fin[now.id] = true;
 	 		queR.add(node[now.id].nextX);
 	 		queR.add(node[now.id].prevX);
 	 		queR.add(node[now.id].nextY);
 	 		queR.add(node[now.id].prevY);
  		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
class Node{
	Point nextX;
	Point prevX;
	Point nextY;
	Point prevY;
	
	public Node(){
		nextX = new Point(Integer.MAX_VALUE,-1);
		prevX = new Point(Integer.MAX_VALUE,-1);
		nextY = new Point(Integer.MAX_VALUE,-1);
		prevY = new Point(Integer.MAX_VALUE,-1);
	}
	
}

// Node and Road
class Point implements Comparable<Point>{
	int dis; // distance
	int id; // nodeID
	
	public Point(int x,int y){
		this.dis = x;
		this.id = y;
	}

	@Override
	public boolean equals(Object o){
		return dis == ((Point)o).dis &&
			   id == ((Point)o).id;
	}
	@Override
	public int compareTo(Point o) {
		return Integer.compare(this.dis,o.dis);
	}
	@Override
	public int hashCode(){
		return Integer.hashCode(dis*id);
	}
}