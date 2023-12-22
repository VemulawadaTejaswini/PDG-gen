
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Integer N;
	static int[][] dp;
	static Node[] v;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		N = Integer.parseInt(sc.next());
		Integer M = Integer.parseInt(sc.next());
		v = new Node[N];
		//Edge e[] = new Edge[M];
		for(int i=0;i<N;i++) {
			v[i] = new Node(i);
		}
		for(int i=0;i<M;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			//e[i] = new Edge(v[a-1],v[b-1],1);
			v[a].edges.add(new Edge(b,1));
			v[b].edges.add(new Edge(a,1));
		}
		dp = new int[1<<N][N];
		for(int i =0;i<(1<<N);i++) {
			for(int j=0;j<N;j++) {
				dp[i][j] = -1;
			}
		}
		int result = dp(1,v[0]);

		out.println(result);


		out.flush();
	}

	public static int dp(int i,Node j) {
		if(i==(1<<N)-1) {
			return dp[i][j.id] = 1;
		}
		if(dp[i][j.id] >= 0){
			return dp[i][j.id];
		}
		boolean b = false;
		dp[i][j.id]=0;
		for(Edge edge : j.edges) {
			Node j1 = v[edge.v];
			if((i & (1<<j1.id)) == 0) {
				dp[i][j.id]+= dp(i+(1<<j1.id),j1);
				b = true;
			}
		}
		if(!b) {
			return dp[i][j.id]; 
		}

		return dp[i][j.id];
	}
}

class Node{
	int id;
	ArrayList<Edge> edges = new ArrayList<>();

	public Node(int id) {
		this.id = id;
	}
}

class Edge{
	int v;
	int cost;
	public Edge(int id,int c) {
		this.v = id;
		this.cost = c;
		//non-directed graph
//		v1.Connect(this);
//		v2.Connect(this);
	}

//	public Node First_one() {
//		return this.v1;
//	}
//
//	public Node Second_one() {
//		return this.v2;
//	}
//
//	public Node Other_one(Node v) {
//		if(v.equals(this.v1)) {
//			return this.v2;
//		}
//		else {
//			return this.v1;
//		}
//	}
}
