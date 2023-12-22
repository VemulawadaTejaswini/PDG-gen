import java.util.Arrays;
import java.util.Scanner;

class Main {
	int N, M;
	int[] X, Y;
	int[] pow2 = new int[30];

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long mi = A * (N - 1) + B;
		long ma = B * (N - 1) + A;
		if (ma - mi + 1 > 0) {
			System.out.println(ma - mi + 1);
		}else{
			System.out.println(0);
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}