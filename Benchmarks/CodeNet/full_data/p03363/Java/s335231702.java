import java.util.Scanner;

public class Main {
	static long tmp;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		long[] numArr = new long[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			numArr[i] = Long.parseLong(s.next());
		}
		long start = System.currentTimeMillis();

		int ir = 0;
		for (int i = ir; i < N - 1; i++) {
			if (i == ir) {
				tmp = numArr[i];
			}
			if (tmp + numArr[i + 1] == 0) {
				count++;
			}

			tmp += numArr[i + 1];
			if (i == N - 2) {
				i = ir;
				ir++;
			}
		}

		System.out.println(count);
		long end = System.currentTimeMillis();

		System.out.println((end - start) + "ms");

	}
}
