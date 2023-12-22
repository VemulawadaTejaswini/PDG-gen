
import java.util.Scanner;


public class Main {

	static int k;
	static long n;
	static long[] stones;
	static long memo[];

	public static void main(String[] args) {

		String input1 = "";
		String input2 = "";
		Scanner scanner = new Scanner(System.in);
		input1 = scanner.nextLine();
		input2 = scanner.nextLine();
		String[] n2 = input1.split(" ");

		n = Long.parseLong(n2[0]);
		k = Integer.parseInt(n2[1]);
		String[] arr = input2.split(" ");
		stones = new long[(int) n];
		for (int i = 0; i < arr.length; i++) {
			stones[i] = Integer.parseInt(arr[i]);
		}

		memo = new long[(int) n];
		for (int i = 0; i < memo.length; i++) {
			memo[i] = -1;
		}
		System.out.println(getMinCostStone(0));
		scanner.close();
	}

	public static long getMinCostStone(int i) {
		if (i == stones.length - 1) {
			return 0;
		}
		long cost = memo[i];

		if (cost != -1) {
			return cost;
		}
		cost = (long) 1e18;
		memo[i] = cost;
		if (i != stones.length - k) {
			for (int j = 1; j <= k; j++) {
				if (i + j < stones.length) {
					cost = Long.min(cost, getMinCostStone(i + j) + Math.abs(stones[i] - stones[i + j]));
					memo[i] = cost;
				}
			}
		}
		return memo[i] = cost;
	}

}
