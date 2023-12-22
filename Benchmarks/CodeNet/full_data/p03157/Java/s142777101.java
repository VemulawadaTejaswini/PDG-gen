import java.util.Scanner;

public class Main {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		solve(map);
		System.out.println(cnt);
	}

	private static void solve(char[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == '.') {
					boolean[][] memo = new boolean[map.length][map[0].length];
					memo[i][j] = true;
					connect(map, i, j, memo);
				}
			}
		}
	}

	private static void connect(char[][] map, int y, int x, boolean[][] memo) {
		int[] dx = { 1, -1, 0, 0 };
		int[] dy = { 0, 0, 1, -1 };
		for (int i = 0; i < 4; i++) {
			if (y + dy[i] >= 0 && y + dy[i] < map.length && x + dx[i] >= 0 && x + dx[i] < map[0].length) {
				if (map[y][x] != map[y + dy[i]][x + dx[i]] && !memo[y + dy[i]][x + dx[i]]) {
					memo[y + dy[i]][x + dx[i]] = true;
					if (map[y + dy[i]][x + dx[i]] == '#') {
						cnt++;
					}
					connect(map, y + dy[i], x + dx[i], memo);
				}
			}
		}
	}
}