import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		int[] spots = new int[N + 2];
		spots[0] = spots[N + 1] = 0;
		long baseCost = 0;
		for (int i = 1; i <= N; i++) {
			spots[i] = sc.nextInt();
			baseCost += Math.abs(spots[i] - spots[i - 1]);
		}
		baseCost += Math.abs(spots[N]);

		for (int i = 1; i <= N; i++) {
			long delta = Math.abs(spots[i - 1] - spots[i + 1]) 
					- Math.abs(spots[i - 1] - spots[i])
					- Math.abs(spots[i] - spots[i + 1]);
			System.out.println(baseCost + delta);
		}
		sc.close();

	}

}