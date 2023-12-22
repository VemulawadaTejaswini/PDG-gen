

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();

		target = new int[r];

		for(int i = 0; i < r; i++){
			target[i] = sc.nextInt() - 1;
		}

		index = new int[r];
		used = new boolean[r];

		int matrix[][] = new int[n][n];

		for(int i = 0; i < n; i++){
			Arrays.fill(matrix[i], INF);
		}

		for(int i = 0; i < m; i++){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();

			matrix[a][b] = c;
			matrix[b][a] = c;
		}

		distAll = warshallFloyd(matrix);

//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n; j++){
//				System.out.print(distAll[i][j] + " ");
//			}
//			System.out.println();
//		}

		System.out.println(solve(0));
	}

	static int target[];
	static long distAll[][];
	static int index[];
	static boolean used[];

	static final int INF = Integer.MAX_VALUE;

	static long solve(int depth){
		if(depth == target.length){
			long result = 0;

			for(int i = 0; i < target.length - 1; i++){
				int from = target[index[i]];
				int to = target[index[i + 1]];
//				System.out.println("from "+from+" to "+to + " cost "+distAll[from][to]);
				result += distAll[from][to];
			}
//			System.out.println("result = "+result);
			return result;
		}

		long result = Long.MAX_VALUE;
		for(int i = 0; i < target.length; i++){
			if(used[i]){
				continue;
			}

			used[i] = true;
			index[depth] = i;
			result = Math.min(solve(depth + 1), result);
			used[i] = false;
		}

		return result;
	}


	static long[][] warshallFloyd(int[][] matrix){
		int n = matrix.length;

		long[][] dist = new long[n][n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j){
					dist[i][j] = 0;
				}
				else {
					dist[i][j] = matrix[i][j];
				}
			}
		}

		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(dist[i][k] == INF || dist[k][j] == INF){
						continue;
					}
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}

		return dist;
	}
}