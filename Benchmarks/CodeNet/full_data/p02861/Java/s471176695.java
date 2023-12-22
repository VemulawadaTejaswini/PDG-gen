import java.util.*;

class Main {
	Scanner sc;
	long[] x, y;
	void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		x = new long[N];
		y = new long[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		double sum = 0d;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				long dx = x[i]-x[j];
				long dy = y[i]-y[j];
				sum += Math.sqrt(dx*dx+dy*dy);
			}
		}
		System.out.println(sum/N);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}