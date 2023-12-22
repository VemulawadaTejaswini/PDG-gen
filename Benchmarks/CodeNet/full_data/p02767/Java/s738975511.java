import java.util.Scanner;

public class Main {

	public static int N;
	public static int[] X;

	public static void main(String[] args) {
		init();
		int min = 100 * 100 * 100;
		for (int p = 1; p <= 100; p++) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += (X[i] - p) * (X[i] - p);
			}
			if (sum < min) {
				min = sum;
			}
		}
		System.out.println(min);
	}

	public static void init() {
		Scanner sc = new Scanner(System.in);
		try {
			N = sc.nextInt();
			X = new int[N];
			for (int i = 0; i < N; i++) {
				X[i] = sc.nextInt();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
