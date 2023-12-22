
import java.util.*;
public class Main {
	static int N;
	static List<ArrayList<Edge>> g;
	static int ans[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		g = new ArrayList();
		for(int i=0;i<N;i++) g.add(new ArrayList<Edge>());
		
		//連結リスト作成
		for(int i=0;i<N-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;b--;
			g.get(a).add(new Edge(i,b));
			g.get(b).add(new Edge(i,a));
		}
		sc.close();
		
		ans = new int[N-1];//edgeの色
		
		dfs(0, -1, -1);//最初はcolorもparentもいないので-1を入れる
		
		//出力 
		int max = 0;
		for(int t :ans) {
			max = Math.max(max, t);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(max + "\n");
		for(int t :ans) {
			sb.append(t + "\n");
		}
		System.out.println(sb.toString());
		
	}
	static void dfs(int to, int color, int p) {
		int k = 1;
		for(Edge e:g.get(to)) {
			if(e.to == p)continue;
			if(k==color)k++;
			ans[e.id]=k;
			dfs(e.to, k, to);
			k++;
		}
	}
}

class Edge{
	
	Edge(int id, int to){
		this.id = id;
		this.to = to;
	}
	
	int id;
	int to;
	
}