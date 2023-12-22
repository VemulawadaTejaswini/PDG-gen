
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		
		int matrix[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			Arrays.fill(matrix[i], INF);
		}

		for(int i = 0; i < n - 1; i++){
			int from = i;
			int to = i + 1;
			int cost = 1;

			matrix[from][to] = cost;
			matrix[to][from] = cost;
		}
		
		matrix[x][y] = 1;
		matrix[y][x] = 1;

		solve(matrix);
	}

//	static final int INF = 10_000_001;

	static void solve(int matrix[][]){
		long[][] dist = warshallFloyd(matrix);

		int n = matrix.length;
		
		int result[] = new int[n + 1];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(j != 0){
//					System.out.print(" ");
				}
//				System.out.print(dist[i][j]);
			}
//			System.out.println();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				result[(int)dist[i][j]]++;
			}
		}

		for(int i = 1; i <= n - 1; i++) {
			System.out.println(result[i]);
		}
	}

	static final int INF = Integer.MAX_VALUE;


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
//					System.out.println("test "+dist[i][j]);
				}
			}
		}

		return dist;
	}
}

