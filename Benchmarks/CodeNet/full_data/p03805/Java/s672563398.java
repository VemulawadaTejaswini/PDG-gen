import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		boolean[][] graph = new boolean[n][n];
		for(int i = 0; i < m; i++) {
			int a = scan.nextInt()-1;
			int b = scan.nextInt()-1;
			graph[a][b] = true;
			graph[b][a] = true;
		}
		scan.close();
		
		boolean[] used = new boolean[n];
		used[0] = true;
		dfs(graph,used,0);
		System.out.println(ans);
	}
	
	static int ans = 0;
	static void dfs(boolean[][] graph, boolean[] used, int n) {
		if(AllTrue(used)) {
			ans++;
			return;
		}
		
		for(int i = 0; i < graph.length; i++) {
			if(graph[n][i] && !used[i]) {
				used[i] = true;
				dfs(graph,used,i);
				used[i] = false;
			}
		}
	}
	
	static boolean AllTrue(boolean[] used) {
		for(boolean bool : used)
			if(!bool) return false;
		
		return true;
	}
}
