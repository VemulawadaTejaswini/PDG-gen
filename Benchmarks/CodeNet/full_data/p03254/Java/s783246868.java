import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.toString(objects));
	}

	void run() throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		int ans = 0;
		for (int i = 0; i < N; ++i) {
			if (A[i] <= X) {
				X -= A[i];
				++ans;
				if (i == N - 1 && X != 0) {
					--ans;
				}
			}
		}
		System.out.println(ans);
	}
}
