import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] cost = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			cost[i] = Integer.parseInt(st.nextToken());
		int count = Integer.MAX_VALUE;
		for (int i = 1, j = i + K - 1; j <= N; i++, j++) {
			count = Math.min(count, cost[j] - cost[i] + Math.min(Math.abs(cost[i]), Math.abs(cost[j])));
		}
		System.out.println(count);
	}
}
