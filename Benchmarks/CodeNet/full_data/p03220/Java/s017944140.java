import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();

		double bestT = Double.MAX_VALUE;
		int bestId = 0;
		for (int i = 0; i < N; i++) {
			int H = sc.nextInt();
			double temp = T - H * 0.006;
			double def = Math.abs(A - temp);
			if (def < bestT) {
				bestT = def;
				bestId = i + 1;
			}
		}

		System.out.println(bestId);

		sc.close();
	}
}