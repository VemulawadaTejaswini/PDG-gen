import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	long INF=Long.MAX_VALUE/2;
	int n,q,k;
	int[]a;
	int[]b;
	long[]c;
	int[]x;
	int[]y;
	ArrayList<Edge>[] tree;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		c=new long[n];
		tree=new ArrayList[n];
		for(int i=0;i<n;i++){
			tree[i]=new ArrayList<Edge>();
		}
		for(int i=0;i<n-1;i++){
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			c[i]=sc.nextInt();
			tree[a[i]].add(new Edge(b[i],c[i]));
			tree[b[i]].add(new Edge(a[i],c[i]));
		}
		q=sc.nextInt();
		k=sc.nextInt();
		x=new int[q];
		y=new int[q];
		for(int i=0;i<q;i++){
			x[i]=sc.nextInt()-1;
			y[i]=sc.nextInt()-1;
		}
		d=new long[n];
		dijkstra(k-1);
		
		for(int i=0;i<q;i++){
			System.out.println(d[x[i]]+d[y[i]]);
		}
		
	}
	
	long[]d;
	
	void dijkstra(int s){
		Queue<Edge> pq=new PriorityQueue<Edge>();
		Arrays.fill(d, INF);
		d[s]=0;
		pq.add(new Edge(s,0));
		
		while(!pq.isEmpty()){
			Edge e=pq.poll();
			int v=e.to;
			if(d[v]<e.cost){
				continue;
			}
			for(int i=0;i<tree[v].size();i++){
				Edge ei=tree[v].get(i);
				if(d[ei.to]>d[v]+ei.cost){
					d[ei.to]=d[v]+ei.cost;
					pq.add(new Edge(ei.to,d[ei.to]));
				}
			}
		}
	}
	
	
	public class Edge implements Comparable<Edge>{
		int to;
		long cost;
		
		Edge(int to, long cost){
			this.to=to;
			this.cost=cost;
		}
		
		public int compareTo(Edge o){
			return (int)(this.cost-o.cost);
		}
	}
	
	
}
