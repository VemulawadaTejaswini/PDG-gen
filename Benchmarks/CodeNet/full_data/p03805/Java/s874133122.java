import java.util.*;

// UVa 11504

public class Main {

	static int n;
	static int answer = 0;
	static int[] visited;
	static int[][] map;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		map = new int[n][n];
		visited = new int[n];
		int m = in.nextInt();
		while (m-- > 0) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			
			map[a][b] = 1;
			map[b][a] = 1;
		}
		
		dfs(0);
		
		System.out.println(answer);
	}
	
	public static void dfs(int curr) {
		visited[curr] = 1;
		
		int num = 0;
		boolean allVisited = true;
		
		for (int i = 0; i < n; i++) {
			if (visited[i] == 0) {
				allVisited = false;
			}
			if (map[curr][i] == 1 && visited[i] == 0) {
				num++;
				dfs(i);
				visited[i] = 0;
			}
		}
		
		if (num == 0 && allVisited) {
			answer++;
		}
	}
}