import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N;
	int[]x;
	int[]y;
	int INF=Integer.MAX_VALUE/2;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		x=new int[N];
		y=new int[N];
		ArrayList<Edge>[] list=new ArrayList[N];
		for(int i=0;i<N;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			list[i]=new ArrayList<Edge>();
		}
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				list[i].add(new Edge(j,Math.min(
						Math.abs(x[i]-x[j]),Math.abs(y[i]-y[j]))));
				
				list[j].add(new Edge(i,Math.min(
						Math.abs(x[i]-x[j]),Math.abs(y[i]-y[j]))));
			}
		}
		
		boolean[] used=new boolean[N];
		Queue<Edge> pq=new PriorityQueue<Edge>();
		pq.add(new Edge(0,0));
		int total=0;
		
		while(!pq.isEmpty()){
			Edge e=pq.poll();
			if(used[e.to]){
				continue;
			}
			used[e.to]=true;
			total+=e.cost;
			
			for(Edge e2: list[e.to]){
				pq.add(e2);
			}
		}
		System.out.println(total);
		
	}
	
	class Edge implements Comparable<Edge>{
		int to;
		int cost;
		
		Edge(int to, int cost){
			this.to=to;
			this.cost=cost;
		}
		@Override
		public int compareTo(Edge e){
			return this.cost-e.cost;
		}
	}
}
