
import java.util.Scanner;

public class Main {

	static int n;
	static int[] stones;
	static int memo[];

	public static void main(String[] args) {

		String input1 = "";
		String input2 = "";
		Scanner scanner = new Scanner(System.in);
		input1 = scanner.nextLine();
		input2 = scanner.nextLine();

		n = Integer.parseInt(input1.trim());

		String[] arr = input2.split(" ");
		stones = new int[n];
		for (int i = 0; i < arr.length; i++) {
			stones[i] = Integer.parseInt(arr[i]);
		}

		memo = new int[n];
		for (int i = 0; i < memo.length; i++) {
			memo[i] = -1;
		}
		System.out.println(getMinCostStone(0));
		scanner.close();
	}

	/**
	 * This method allows to find the min hi
	 * 
	 * @param i from the current stone
	 * @param j the possible next stone
	 * @return the min distance
	 */
	public static int getMinCostStone(int i, int j) {
		if (j == stones.length && i == stones.length - 1) {
			return 0;
		}
		if (j == stones.length - 1 && i == stones.length - 2) {
			return memo[i] = Math.abs(stones[i] - stones[j]);
		}
		if (stones[i] == stones[j]) {
			return 0;
		}
		if (memo[i] != -1) {
			return memo[i];
		}
		int cost1 = Math.abs(stones[i] - stones[j]) + getMinCostStone(j, j + 1);
		memo[i] = cost1;
		int cost2 = Math.abs(stones[i] - stones[j + 1]) + getMinCostStone(j + 1, j + 2);

		memo[i] = cost2;
		return memo[i] = Integer.min(cost1, cost2);
	}

	public static int getMinCostStone(int i) {
		if (i >= stones.length) {
			return 0;
		}
		if (memo[i] != -1) {
			return memo[i];
		}
		if (i + 1 >= stones.length)
			return 0;
		int cost1 = Math.abs(stones[i] - stones[i + 1]) + getMinCostStone(i + 1);
		memo[i] = cost1;
		if (i + 2 >= stones.length)
			return 0;
		int cost2 = Math.abs(stones[i] - stones[i + 2]) + getMinCostStone(i + 2);
		memo[i] = cost2;
		return memo[i] = Integer.min(cost1, cost2);
	}

}
