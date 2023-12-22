
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		color = new int[n];
		costFromRoot = new long[n];
		
		@SuppressWarnings("unchecked")
		ArrayList<Edge>[] edges = new ArrayList[n];
		
		for(int i = 0; i < n; i++) {
			edges[i] = new ArrayList<Edge>();
		}
		
		for(int i = 0; i < n - 1; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			int w = sc.nextInt();
			
			edges[u].add(new Edge(v, w));
			edges[v].add(new Edge(u, w));
		}
		
		ArrayList<Integer> queue = new ArrayList<Integer>();
		
		Arrays.fill(color, NONE);
		color[0] = BLACK;
		queue.add(0);
		
		while(!queue.isEmpty()) {
			int v = queue.remove(0);
			
			for(int i = 0; i < edges[v].size(); i++) {
				Edge e = edges[v].get(i);
//				System.out.println("from "+ v +" to "+e.to);
				
				if(color[e.to] == NONE) {
					costFromRoot[e.to] = e.cost + costFromRoot[v];

					if(costFromRoot[e.to] % 2 == 0) {
//						System.out.println("should be same color");
						color[e.to] = BLACK;
					}
//					else if(color[i] == BLACK){
////						System.out.println("shoud be white");
//						color[e.to] = WHITE;
//					}
					else {
//						System.out.println("should be black");
						color[e.to] = WHITE; 
					}
					
					queue.add(e.to);
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(color[i]);
		}
	}
	
	static int color[];
	static final int NONE = -1;
	static final int BLACK = 1;
	static final int WHITE = 0;
	static long costFromRoot[];

}

class Edge {
	int to;
	int cost;
	
	Edge(int to, int cost){
		this.to = to;
		this.cost = cost;
	}
}