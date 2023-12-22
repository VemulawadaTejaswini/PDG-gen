import java.util.*;
import java.io.*;

import com.sun.imageio.plugins.common.InputStreamAdapter;

public class Main {
	
	static boolean goalReached;
	
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		String[] split = f.readLine().split("\\s+");
		int n = Integer.parseInt(split[0]), k = Integer.parseInt(split[1]);
		boolean[][] adjMatrix = new boolean[n][n];
		int[] edges = new int[n];
		for(int i = 0; i < n-1; i++) {
			split = f.readLine().split("\\s+");
			int a = Integer.parseInt(split[0])-1, b = Integer.parseInt(split[1])-1;
			adjMatrix[a][b] = adjMatrix[b][a] = true;
			edges[a]++; edges[b]++;
		}
		int minVertex = -1, minVal = 100_000_000_0;
		for(int i = 0; i < n; i++) {
			if(edges[i] < minVal) {
				minVertex = i;
				minVal = edges[i];
			}
		}
		edges = new int[n];
		Arrays.fill(edges, 1_000_000_000); edges[minVertex] = -1;
		for(int i = 0; i < n; i++) {
			if(i == minVertex) continue;
			boolean[] v = new boolean[n]; v[minVertex] = true;
			goalReached = false;
			edges[i] = distance(minVertex, i, adjMatrix, v, 0);
//			System.out.println();
		}
		int ans = 0;
		for(int i = 0; i < n; i++) 
			if(edges[i] > k) ans++;
//		System.out.println(minVertex);
//		System.out.println(Arrays.toString(edges));
		System.out.println(ans);
	}

	private static int distance(int minVertex, int goal, boolean[][] adjMatrix, boolean[] V, int res) {
//		System.out.println("At vertex " + minVertex);
		if(minVertex == goal) {
			goalReached = true;
			return res;
		}
		int n = V.length;
		for(int i = 0; i < n && !goalReached; i++) {
			if(i != minVertex && !V[i] && adjMatrix[minVertex][i]) {
				V[i] = true;
				int val = distance(i, goal, adjMatrix, V, res+1);
				if(val != -1) res = val;
			}
		}
		if(!goalReached) return -1;
		return res;
	}

}