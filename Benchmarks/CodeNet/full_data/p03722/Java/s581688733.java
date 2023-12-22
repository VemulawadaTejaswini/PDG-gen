import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Main main=new Main();
		main.run();
	}

	void run() {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();

		int[][] adj=new int[M][3];

		for(int i=0;i<M;i++) {
			adj[i][0]=sc.nextInt()-1;
			adj[i][1]=sc.nextInt()-1;
			adj[i][2]=-sc.nextInt();
		}

		BellmanFord BF=new BellmanFord(N, M, adj);

		if(BF.shortest_path(0)) {
			int score=BF.d[N-1];

			System.out.println(-score);
		}


	}

}

class Edge implements Comparable<Edge>{
	int from;
	int to;
	int cost;

	public Edge(int from,int to,int cost) {
		this.from=from;
		this.to=to;
		this.cost=cost;
	}

	public int compareTo(Edge e) {
		return this.cost-e.cost;
	}

}

class BellmanFord{

	//頂点数
	int V;
	//辺の数
	int E;

	//隣接行列
	int[][] adj;

	//最短距離
	int[] d;

	//辺の集合
	Edge[] edge;

	static int INF=Integer.MAX_VALUE-1;

	BellmanFord(int V,int E,int[][] adj){
		this.V=V;
		this.E=E;
		this.adj=adj;
		d=new int[V];
		edge=new Edge[E];

		for(int i=0;i<E;i++) {
			edge[i]=new Edge(adj[i][0],adj[i][1],adj[i][2]);
		}
	}



	public boolean shortest_path(int s) {
		for(int i=0;i<V;i++) {
			d[i]=INF;
		}

		d[s]=0;

		int counter=0;
		while(true) {
			boolean update=false;

			//順方向
			for(int i=0;i<E;i++) {
				Edge e=edge[i];

				if(d[e.from] !=INF && d[e.to]>d[e.from]+e.cost) {
					d[e.to]=d[e.from]+e.cost;
					update=true;
				}
			}


//			//逆方向
//			for(int i=0;i<E;i++) {
//				Edge e=edge[i];
//
//				if(d[e.to] !=INF && d[e.from]>d[e.to]+e.cost) {
//					d[e.from]=d[e.to]+e.cost;
//					update=true;
//				}
//			}

			if(!update) {break;};

			if(counter++==2*V) {
				System.out.println("INF");
				return false;
			}

		}

		return true;
	}

}