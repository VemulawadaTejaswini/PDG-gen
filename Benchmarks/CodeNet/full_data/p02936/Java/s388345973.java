
import java.util.*;

public class Main {
	
	static List<Integer> graph[];
	static int cnt[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		graph = new ArrayList[n+1];
		cnt = new int[n+1];
		
		for(int i=1;i<=n;i++)
			graph[i] = new ArrayList<>();
		
		for(int i=0;i<n-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		
		for(int i=0;i<q;i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			cnt[p] += x;
		}
		
		dfs(1, -1, 0);
		
		// 出力文字列の編集
		// printは遅いので、1回実行だけで済むように、StringBuilderで解答の文字列を作成
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=n;i++)
			sb.append(cnt[i] + " ");
				
		System.out.println(sb.toString());
	}
	
	// 深さ優先探索 (Depth-First Search)
	static void dfs(int v, int p, int x) {
		cnt[v] += x;
		x = cnt[v];
				
		for(int to:graph[v]) {
			if(to == p)continue;
			dfs(to, v, x);
		}
	}
	
	
}
