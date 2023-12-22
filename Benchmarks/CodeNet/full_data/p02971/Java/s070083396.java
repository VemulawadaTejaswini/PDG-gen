import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] A = new long[N][2];
		for (int i = 0; i < N; ++i) {
			A[i] = new long[] { sc.nextLong(), i };
		}
		Arrays.sort(A, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return Long.compare(o1[0], o2[0]);
			}
		});

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < N; ++i) {
			if (A[N - 1][1] == i) {
				pw.println(A[N - 2][0]);
			} else {
				pw.println(A[N - 1][0]);
			}
		}
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}