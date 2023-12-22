
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	void run() {
		int n = sc.nextInt();
		long y = sc.nextInt();

		long x[] = new long[n];


		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		long cost = 0;

		int[] yojoCount = new int[n];

		for (int i = n - 1; i >= 0; i--) {

			if (yojoCount[0] == 0) {
				cost += 5 * x[i] + y * 2;
				yojoCount[0]++;
				continue;
			}

			int yojo = 0;
			for (;yojoCount[yojo] == yojoCount[0]; yojo++) {}

			long comp = 5 * x[i] + y * 2;
			long now = x[i] * ( ((long)yojo+2)*((long)yojo+2)- ((long)yojo+1)*((long)yojo+1) ) + y;

			if (now < comp) {
				cost += now;
//				yojoCount[yojo - 1]--;
				yojoCount[yojo]++;
			} else {
				cost += comp;
				yojoCount[0]++;
			}

		}
		System.out.println(cost);
	}

}
