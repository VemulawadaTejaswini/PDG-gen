import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] p = new double[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextDouble();
		}

		double ret = 0;
		double max = 0;
		for (int i = 0; i < k; i++) {
			ret += (1.0 + p[i]) / 2.0;
		}
		max = ret;
		for (int i = k; i < n; i++) {
			ret -= (1.0 + p[i - k]) / 2.0;
			ret += (1.0 + p[i]) / 2.0;
			max = Math.max(max, ret);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
