// code by Juan Torres
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		boolean[][] adj = new boolean[n+1][n+1];
		
		adj[x][y] = true;
		adj[y][x] = true;
		
		for(int i = 1; i <= n-1; i++) {
			adj[i][i+1] = true;
			adj[i+1][i] = true;
		}
		
		
		int[] k = new int[n+1];
		for(int i = 1; i <= n; i++) {
			Queue<Integer> q = new ArrayDeque<>();
			boolean[] visited = new boolean[n+1];
			int[] dist = new int[n+1];
			q.add(i);
			visited[i] = true;
			while(!q.isEmpty()) {
				int curr = q.remove(); 
				//System.out.print(curr + " ");
				for(int j = 1; j <= n; j++) {
					if(adj[curr][j] && !visited[j]) {
						visited[j] = true;
						q.add(j);
						dist[j] = dist[curr] + 1;
					}
				}
			}
			//System.out.println();
			//System.out.println(Arrays.toString(dist));
			for(int j = 1; j <= n; j++) {
				k[dist[j]]++;
			}
		}
		
		for(int i = 1; i < n; i++) {
			System.out.println(k[i]/2);
		}
	}
}
