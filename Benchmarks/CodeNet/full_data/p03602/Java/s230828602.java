import java.util.*;

// ARC 83-C
// http://arc083.contest.atcoder.jp/tasks/arc083_a

public class Main {
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[][] givenMap = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				givenMap[i][j] = in.nextInt();
			}
		}
		
		long[][] map = new long[N][N];
		for (int i = 0; i < N; i++) {
			Arrays.fill(map[i], Long.MAX_VALUE / 2);
		}
		
		long sumPath = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				boolean altPathFound = false;
				for (int k = 0; k < N && !altPathFound; k++) {
					if (k != i && k != j && givenMap[i][k] + givenMap[k][j] == givenMap[i][j]) {
						altPathFound = true;
					}
				}
				
				if (altPathFound) {
					// Do nothing. i <-> j can be achieved by different path
				} else {
					map[i][j] = givenMap[i][j];
					map[j][i] = givenMap[i][j];
					sumPath += givenMap[i][j];
				}
			}
		}
		
//		print2DArray(map);
//		System.out.println();
		
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (i != j && j != k && k != i) {
						map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
					}
				}
			}
		}

//		print2DArray(map);
		
		boolean graphExists = true;
		for (int i = 0; i < N && graphExists; i++) {
			for (int j = i + 1; j < N && graphExists; j++) {
				if (i != j && map[i][j] != givenMap[i][j]) {
					graphExists  = false;
				}
			}
		}
		
		if (graphExists) {
			System.out.println(sumPath);
		} else {
			System.out.println(-1);
		}
	}
	
	public static void print2DArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void print2DArray(long[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
/**
5
0 1 2 3 2
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
2 3 2 1 0
*/