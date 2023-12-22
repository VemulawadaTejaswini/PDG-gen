import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		double[] A = new double[N];
		for(int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		int[] B = new int[N];
		for(int i = 0; i < N; i++)
			B[i] = sc.nextInt();
		Arrays.sort(B);
		double[] C = new double[N];
		for(int i = 0; i < N; i++)
			C[i] = sc.nextInt();
		Arrays.sort(C);
		for(int i = 0; i < N; i++) {
			long AB = 0, BC = 0;
			AB = - 1 - Arrays.binarySearch(A, B[i]-0.1);
			BC = N + 1 + Arrays.binarySearch(C, B[i]+0.1);
			ans += AB * BC;
		}
		System.out.println(ans);
	}

}