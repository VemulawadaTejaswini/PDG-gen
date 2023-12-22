import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N;
	public static long C;
	public static long[] positions, values;
	public static boolean[][][] visited = new boolean[102][102][2];

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		N = Integer.parseInt(st.nextToken());
		C = Long.parseLong(st.nextToken());
		positions = new long[N + 1];
		values = new long[N + 1];
		positions[0] = 0;
		values[0] = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(f.readLine());
			long x = Long.parseLong(st.nextToken());
			long v = Long.parseLong(st.nextToken());
			positions[i + 1] = x;
			values[i + 1] = v;
		}
		long res = Math.max(dfs(N, 0, 1, distance(N, 0), 0) - distance(N, 0),
				dfs(0, 1, 0, distance(0, 1), 0) - distance(0, 1));
		res = Math.max(res, 0);
		System.out.println(res);
	}

	public static long dfs(int left, int right, int isLeft, long lastDistance, int depth) {
		// System.out.println(left + " " + right + " " + isLeft + " " + depth);
		if (left == -1) {
			return dfs(N, right, isLeft, lastDistance, depth);
		}
		if (right == N + 1) {
			return dfs(left, 0, isLeft, lastDistance, depth);
		}
		if (left == right) {
			return lastDistance;
		}
		if (visited[left][right][isLeft]) {
			return 0;
		}
		visited[left][right][isLeft] = true;
		if (isLeft == 1) {
			return values[left] + Math.max(0,
					Math.max(dfs(left - 1, right, 1, distance(left - 1, left), depth + 1) - distance(left - 1, left),
							dfs(left, right + 1, 0, distance(right + 1, left), depth + 1) - distance(right + 1, left)));
		} else {
			return values[right] + Math.max(0,
					Math.max(
							dfs(left, right + 1, 0, distance(right + 1, right), depth + 1) - distance(right + 1, right),
							dfs(left - 1, right, 1, distance(left - 1, right), depth + 1) - distance(left - 1, right)));
		}
	}

	public static long distance(int i, int j) {
		if (i == -1) {
			i = N;
		}
		if (j == -1) {
			j = N;
		}
		if (i == N + 1) {
			i = 0;
		}
		if (j == N + 1) {
			j = 0;
		}
		long max = Math.max(positions[i], positions[j]);
		long min = Math.min(positions[i], positions[j]);
		return Math.min(max - min, C - max + min);
	}
}