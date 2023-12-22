
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

 class LongestPathDp {

	static List<List<Integer>> graph = new LinkedList<List<Integer>>();
 	static int dp[];
 	static int answer = 0;
 	
	public static void addEdge(int u , int v) {
		graph.get(u).add(v);
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int vertices = sc.nextInt();
	    int edge = sc.nextInt();
	    dp = new int[vertices + 1];
	    for(int i = 0 ; i <= vertices ; i++) {
	    	List<Integer> list = new LinkedList<Integer>();
	    	graph.add(list);
	    }
	    
	    for(int i = 1 ; i <= edge ; i++) {
	    	int u = sc.nextInt();
	    	int v = sc.nextInt();
	    	addEdge(u, v);
	    }
	    
	    boolean visited[] = new boolean[vertices + 1];
	    for(int i = 1 ; i <= vertices ; i++) {
	    	dfs(visited , i);
	    }
	    System.out.println(answer);
	}
	
	public static int dfs(boolean[] visited , int curr) {
		List<Integer> list = graph.get(curr);
		if(visited[curr]) {
			return dp[curr];
		}
		for(int i = 0 ; i < list.size() ; i++) {
			dp[curr] = Math.max(dp[curr] , 1 + dfs(visited , list.get(i)));
		}
		visited[curr] = true;
		answer = Math.max(answer, dp[curr]);
		return dp[curr];
	}
}
