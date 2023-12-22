import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long[] L = new long[100];
		L[0] = 2;
		L[1] = 1;
		for (int i = 2; i < L.length; ++i) {
			L[i] = L[i - 1] + L[i - 2];
		}
		int N=sc.nextInt();
		System.out.println(L[N]);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
