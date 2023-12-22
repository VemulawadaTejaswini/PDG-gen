import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();


		int[][] map = new int[n+1][n+1]; 
		for (int i = 0; i < n-1; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			for (int j = 0; j < n; j++) {
				if(map[from][j] == 0){
					map[from][j] = to;
					break;
				}else{
					continue;
				}
			}
		}

		long[] result = new long[n+1];
		long[] tempSum = new long[n+1];

		for (int i = 0; i < q; i++) {
			int p = sc.nextInt();
			long x = sc.nextLong();
			tempSum[p] = tempSum[p] + x;
		}

		// こっから計算
		for (int i = 1; i <= n; i++) {
			// int to = map[i][0];
			long add = tempSum[i];
			// System.out.println("add " + add);

			bubble(i, result, map, add, n);
			// System.out.println();
		}


		for (int i = 1; i <= n; i++) {
			System.out.println(result[i]);
		}

	}
	

	private static void bubble(int to, long[] result, int[][] map, long x, int n){
		result[to] = result[to] + x;
		for(int i = 0; i < n; i++){
			int nextTo = map[to][i];
			if(nextTo == 0){
				break;
			}
			bubble(nextTo, result, map, x, n);
		}
	}
	

}
