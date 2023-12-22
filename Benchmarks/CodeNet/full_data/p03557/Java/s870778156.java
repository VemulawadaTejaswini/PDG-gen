import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double[] A = new double[N];
		double[] B = new double[N];
		double[] C = new double[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = in.nextLong();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = in.nextLong();
		}
		for (int i = 0; i < C.length; i++) {
			C[i] = in.nextLong();
		}
		Arrays.sort(A);
		Arrays.sort(C);
		long ans = 0;
		for (int i = 0; i < B.length; i++) {
			long underNum = Arrays.binarySearch(A, B[i] - 0.1);
			long overNum = Arrays.binarySearch(C, B[i] + 0.1);
			ans += (-1 - underNum) * (N + overNum + 1);
		}
		System.out.println(ans);
		in.close();
	}
}