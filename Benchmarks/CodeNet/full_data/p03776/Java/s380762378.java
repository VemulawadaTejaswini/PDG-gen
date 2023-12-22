import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = Integer.parseInt(scn.next());
		int A = Integer.parseInt(scn.next());
		int B = Integer.parseInt(scn.next());

		long[] vs = new long[N];
		for (int i = 0; i < N; i++) {
			vs[i] = Long.parseLong(scn.next());
		}
		scn.close();

		Arrays.sort(vs);

		int count0 = 0;
		int count1 = 0;
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			if (vs[N - 1] == vs[N - i - 1]) {
				count0++;
			}
			if (vs[N - A] == vs[N - i - 1]) {
				count1++;
				tmp = i + 1;
			}
		}

		if (count0 >= A) {
			System.out.printf("%d\n", vs[N - 1]);
			if (count0 > B) {
				count0 = B;
			}
			long sum = 0;
			for (int i = 0; i + A <= count0; i++) {
				sum += C(count0, i + A);
			}
			System.out.printf("%d\n", sum);

		} else {
			double ave = 0;
			for (int i = 0; i < A; i++) {
				ave += (double) vs[N - 1 - i] / A;
			}
			System.out.printf("%.6f\n", ave);
			System.out.printf("%d\n", C(count1, tmp - A));
		}
	}

	public static long C(int a, int b) {
		long[][] arr = new long[a + 1][b + 1];
		for (int i = 0; i < b + 1; i++) {
			arr[0][i] = 1;
		}
		for (int i = 0; i < a + 1; i++) {
			arr[i][0] = 1;
		}
		for (int i = 1; i < a + 1; i++) {
			for (int j = 1; j < b + 1; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}
		return arr[a - b][b];
	}
}