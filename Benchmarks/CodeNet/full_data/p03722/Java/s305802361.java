import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveD();
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		long[][] map = new long[N + 1][];
		boolean[][] bmap = new boolean[N + 1][];
		for (int j = 1; j <= N; j++) {
			map[j] = new long[N + 1];
			bmap[j] = new boolean[N + 1];
		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long c = sc.nextLong();
			map[a][b] = c;
			bmap[a][b] = true;
		}

		boolean[] reachableFromStart = new boolean[N + 1];
		boolean[] reachableFromGoal = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			if (bmap[1][i]) {
				searchFront(i, reachableFromStart, bmap, N, 0);
			}
			if (bmap[i][N]) {
				searchBack(i, reachableFromGoal, bmap, N, 0);
			}
		}

		for (int i = 1; i <= N; i++) {
			if (reachableFromStart[i] && reachableFromGoal[i]) {
				for (int j = 1; j <= N; j++) {
					if (bmap[i][j]) {
						Long result = search(j, i, bmap, map, N, 0);
						if (result != null && result > 0L) {
							System.out.println("inf");
							return;
						}
					}
				}
			}
		}

		System.out.println(search(1, N, bmap, map, N, 0));
	}

	void searchFront(int point, boolean[] bools, boolean[][] map, int N, int depth) {
		if (depth > 2000 || bools[point]) {
			return;
		}
		bools[point] = true;
		for (int i = 1; i <= N; i++) {
			if (map[point][i]) {
				searchFront(i, bools, map, N, depth + 1);
			}
		}
	}

	void searchBack(int point, boolean[] bools, boolean[][] map, int N, int depth) {
		if (depth > 2000 || bools[point]) {
			return;
		}
		bools[point] = true;
		for (int i = 1; i <= N; i++) {
			if (map[i][point]) {
				searchBack(i, bools, map, N, depth + 1);
			}
		}
	}

	Long search(int point, int target, boolean[][] bmap, long[][] map, int N, int depth) {
		if (depth > 2000) {
			return null;
		}
		if (point == target) {
			return 0L;
		}
		Long maxLong = null;
		for (int i = 1; i <= N; i++) {
			if (bmap[point][i]) {
				Long value = search(i, target, bmap, map, N, depth + 1);
				if (value != null) {
					value += map[point][i];
					if (maxLong == null) {
						maxLong = value;
					} else if(maxLong < value) {
						maxLong = value;
					}
				}
			}
		}
		return maxLong;
	}
}