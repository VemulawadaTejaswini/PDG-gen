import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long min = 0;
		for (int i = 0; i < N; i++) {
			long A = scn.nextLong();
			min = yuk(A, min);
		}
		System.out.println(min);
	}

	public static long yuk(long A, long min) {
		if (min == 0)
			return A;

		long ans;
		while (A % min != 0) {
			A %= min;
			long buf = A;
			A = min;
			min = buf;
		}
		return min;
	}
}
