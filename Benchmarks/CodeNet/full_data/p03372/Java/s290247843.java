import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N;
	public static long C;
	public static long[] positions, values, prefixes, suffixes;
	public static boolean[][][] visited = new boolean[102][102][2];

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		N = Integer.parseInt(st.nextToken());
		C = Long.parseLong(st.nextToken());
		positions = new long[N + 1];
		values = new long[N + 1];
		prefixes = new long[N + 1];
		suffixes = new long[N + 1];
		positions[0] = 0;
		values[0] = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(f.readLine());
			long x = Long.parseLong(st.nextToken());
			long v = Long.parseLong(st.nextToken());
			positions[i + 1] = x;
			values[i + 1] = v;
		}
		for (int i = 1; i <= N; i++) {
			prefixes[i] = prefixes[i - 1] + values[i];
		}
		for (int i = N - 1; i >= 0; i--) {
			suffixes[i] = suffixes[i + 1] + values[i + 1];
		}
		long res = 0;
		for (int i = 0; i <= N; i++) {
			res = Math.max(res, prefixes[i] - positions[i]);
			res = Math.max(res, suffixes[i] - (C - positions[i]));
			for (int j = i + 1; j <= N; j++) {
				res = Math.max(res, prefixes[i] + suffixes[j - 1] - positions[i] - positions[i] - (C - positions[j]));
				res = Math.max(res, prefixes[i] + suffixes[j - 1] - 2 * (C - positions[j]) - positions[i]);
			}
		}
		System.out.println(res);
	}
}