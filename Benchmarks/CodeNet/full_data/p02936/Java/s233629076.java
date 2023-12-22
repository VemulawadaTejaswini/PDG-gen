import java.util.*;

public class Main {

	static List<Integer> graph[];
	static int cnt[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		graph = new ArrayList[n];
		for(int i=0;i<n;i++) graph[i] = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			int a = sc.nextInt()-1, b = sc.nextInt()-1;
			graph[a].add(b);
			graph[b].add(a);
		}
		
		cnt = new int[n];
		for(int i=0;i<q;i++) {
			int p = sc.nextInt()-1, x = sc.nextInt();
			cnt[p] += x;
		}
		
		dfs(0, -1, 0);
		//出力
		//printは遅いので、1回だけで済むように、StringBuilderで解答の文字列を作る。
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(cnt[i] + " ");
		}
		//出力
		System.out.println(sb.toString());
	}
	
	static void dfs(int v , int p, int x) {
		cnt[v] += x;
		x = cnt[v];
		
		for(int to:graph[v]) {
			if(to == p)continue;
			dfs(to, v, x);
		}
	}
	
}

