import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long A[] = new long[N];
		long B[] = new long[N];
		long C[] = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextLong();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		long sum =0;

		for (int i = 0; i < N; i++) {
			int aL=0;
			int aR=N;

			int cL=0;
			int cR=N;
			long target = B[i];

			while (aL < aR) {
				int M = (aL+aR)/2;
				if (A[M] >= target) {aR = M;}
				else if (A[M] < target) {aL = M+1;}
			}

			target++; 
			while (cL < cR) {
				int M = (cL+cR)/2;
				if (C[M] >= target) {cR = M;} 
				else if (C[M] < target) {cL = M+1;}
			}
			sum += aL*(N-cL);
		}
		System.out.println(sum);
	}
}
