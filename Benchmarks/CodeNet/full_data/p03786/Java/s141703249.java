import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		int left = -1;// γ
		int right = N;
		while (right - left > 1) {
			int middle = (right + left) / 2;
			if (check(A, middle)) {
				right = middle;
			} else {
				left = middle;
			}
		}
		System.out.println(N - 1 - left);
	}

	boolean check(long[] A, int idx) {
		long curSize = A[idx];
		for (int i = 0; i < A.length; ++i) {
			if (i == idx)
				continue;
			if (curSize * 2 >= A[i]) {
				curSize += A[i];
			} else {
				return false;
			}
		}
		return true;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
