import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] v = new double[n];
		for (int i = 0; i < n; ++i) {
			v[i] = sc.nextDouble();
		}
		Arrays.sort(v);
		double cur = v[0];
		for (int i = 1; i < n; ++i) {
			cur = (v[i] + cur) / 2;
		}
		System.out.println(cur);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}