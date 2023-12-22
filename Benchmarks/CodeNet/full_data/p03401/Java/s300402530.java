import java.util.*;

public class Main {
	int N;
	long[] A;
	long total = 0;
	long[] result;

	private Main() {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		result = new long[N];
		in.close();
	}

	private void calc() {
		calcTotal();
		long prev = 0;
		for (int i = 0; i + 1 < N; ++i) {
			if (prev < A[i] && A[i] < A[i + 1]) {
				// なにもしない
				result[i] = total;
			} else if (A[i + 1] < A[i] && A[i] < prev) {
				// なにもしない
				result[i] = total;
			} else {
				result[i] = total;
				result[i] -= (Math.abs(A[i] - prev) + Math.abs(A[i + 1] - A[i]));
				result[i] += Math.abs(A[i + 1] - prev);
			}
			prev = A[i];
		}
		if (A[N - 2] < A[N - 1] && A[N - 1] < 0) {
			result[N - 1] = total;
		} else if (0 < A[N - 1] && A[N - 1] < A[N - 2]) {
			result[N - 1] = total;
		} else {
			result[N - 1] = total;
			result[N - 1] -= (Math.abs(A[N - 1] - A[N - 2]) + Math.abs(A[N - 1]));
			result[N - 1] += Math.abs(A[N - 2]);
		}
	}

	private void show() {
		for (int i = 0; i < N; ++i) {
			System.out.println(result[i]);
		}
	}

	private void calcTotal() {
		long prevPoint = 0;
		for (int i = 0; i < N; ++i) {
			total += Math.abs(A[i] - prevPoint);
			prevPoint = A[i];
		}
		total += Math.abs(prevPoint);
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}

}
