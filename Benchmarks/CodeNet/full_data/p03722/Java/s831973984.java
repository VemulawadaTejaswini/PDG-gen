import java.util.*;

// ABC 27-C
// http://abc027.contest.atcoder.jp/tasks/abc027_c
 
public class Main {
	
	static int n;
	static int[][] map;
	static int NO_EDGE = 1000000001;
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		int m = in.nextInt();
		map = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			Arrays.fill(map[i], NO_EDGE);
		}
		
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int c = in.nextInt();
			
			map[a][b] = c;
		}
		
		if (doesReachInfinity(0, new int[n], 0)) {
			System.out.println("inf");
		} else {
			System.out.println(calculateScore(0, 0));
		}
	}
	
	public static boolean doesReachInfinity(int curr, int[] visited, long score) {
		visited[curr] = 1;
		
		for (int i = 0; i < n; i++) {
			if (map[curr][i] != NO_EDGE) {
				if (visited[i] == 1 && score + map[curr][i] > 0) {
					return true;
				} else if (visited[i] == 0) {
					return doesReachInfinity(i, visited, score + map[curr][i]);
				}
			}
		}
		
		return false;
	}
	
	public static long calculateScore(int curr, long score) {
		if (curr == n - 1) {
			return score;
		}
		
		for (int i = 0; i < n; i++) {
			if (map[curr][i] != NO_EDGE) {
				return calculateScore(i, score + map[curr][i]);
			}
		}
		
		return 0;
	}
}