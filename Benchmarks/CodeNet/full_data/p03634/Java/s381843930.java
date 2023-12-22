
import java.util.*;
public class Main {
	
	
	static List<ArrayList<int[]>> to;
	static int x, y;
	static long ans[];
	
	public static void main(String[] args) {
		
		//入力値の受け取り
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//連結リスト
		to = new ArrayList();
		for(int i=0;i<N;i++) {
			to.add(new ArrayList<int[]>());
		}
		
		for(int i=0;i<N-1;i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			a--;b--;
			int t[] = {b,c};
			to.get(a).add(t);
			int u[] = {a,c};
			to.get(b).add(u);
		}
		int Q = sc.nextInt(), K = sc.nextInt();
		K--;
		
		//問題
		int q[][] = new int[Q][2];
		for(int i=0;i<Q;i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			x--;y--;
			q[i][0]=x; q[i][1]=y;
		}
		sc.close();
		
		ans = new long[Q];
		for(int i=0;i<Q;i++) {
			int x = q[i][0];  int y = q[i][1];
			
			dfs(x, -1, 0L, K, i);
			dfs(K, -1, 0L, y, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(long t:ans) sb.append(t+"\n");
		System.out.println(sb.toString());
	}
	
	static void dfs(int a, int p, long len, int g, int i) {
		if(a==g) ans[i] += len;
		for(int t[] : to.get(a)) {
			int na = t[0];
			int d = t[1];
			if(na == p)continue;
			dfs(na , a, d + len, g, i);
		}
	}
	
}