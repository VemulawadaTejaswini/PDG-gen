import java.util.Scanner;

public class Main {
	static int N;
	static int[][] cost;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.nextLine());
		int[] dp = new int[N];
		cost = new int[N][3];
		for (int i = 0; i < N; i++) {
			String[] line = sc.nextLine().split(" ");
			cost[i][0] = Integer.parseInt(line[0]);
			cost[i][1] = Integer.parseInt(line[1]);
			cost[i][2] = Integer.parseInt(line[2]);
		}

		System.out.println(Math.max(dfs(0, 0), Math.max(dfs(0, 1), dfs(0, 2))));
	}

	static int dfs(int i, int j) {
		if (i >= N)
			return 0;

		if (j == 0)
			return cost[i][j] + Math.max(dfs(i + 1, 1), dfs(i + 1, 2));
		else if (j == 1)
			return cost[i][j] + Math.max(dfs(i + 1, 0), dfs(i + 1, 2));
		else
			return cost[i][j] + Math.max(dfs(i + 1, 0), dfs(i + 1, 1));
	}
}