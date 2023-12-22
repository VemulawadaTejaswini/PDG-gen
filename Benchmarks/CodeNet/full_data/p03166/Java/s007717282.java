import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main
{
	
	static int[] dp;
	static ArrayList<Integer>[] graph;
	public static int dfs(int u) {
		if(dp[u]!=-1) {
			return dp[u];
		}
		int ans = 0;
		for(int v: graph[u]) {
			ans = Math.max(ans, dfs(v)+1);
		}
		dp[u] = ans;
		return ans;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); int M = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1];
		for(int i=1; i<=N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			graph[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
		}
		
		dp = new int[N+1];
		Arrays.fill(dp, -1);
		
		int ans = 0;
		for(int i=1; i<=N; i++) {
			ans = Math.max(ans, dfs(i));
		}
		System.out.println(ans);
	}
}
