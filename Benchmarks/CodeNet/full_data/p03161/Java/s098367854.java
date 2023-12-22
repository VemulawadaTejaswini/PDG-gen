
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static int minCost(int stones[], int k) {
		int cost[] = new int[stones.length];
		cost[0] = 0;
		cost[1] = Math.abs(stones[1] - stones[0]);
		for (int i = 2; i < stones.length; i++) {
			cost[i] = Integer.MAX_VALUE;
			for (int j = 1; j <= k; j++) {
				if (i - j >= 0) {
					cost[i] = Math.min(Math.abs(stones[i - j] - stones[i]) + cost[i - j], cost[i]);
				}
			}
		}
		return cost[stones.length - 1];
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, k;
		String array[] = br.readLine().split(" ");
		n = Integer.valueOf(array[0]);
		k = Integer.valueOf(array[1]);
		int stones[] = new int[n];
		array = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			stones[i] = Integer.valueOf(array[i]);
		}
		System.out.println("" + minCost(stones, k));

	}

}