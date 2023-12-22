import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		
		long ans = 0;
		
		for(int i = 0; i < N; i++) {
			int L1 = 0;
			int R1 = A.length;
			while (L1 < R1) {
				int M = L1 / 2 + R1 / 2;
				if (A[M] >= B[i]) {R1 = M;}
				else if (A[M] < B[i]) {L1 = M + 1;}
			}

			int L2 = 0;
			int R2 = C.length;
			while (L2 < R2) {
				int M = L2 / 2 + R2 / 2;
				if (C[M] >= B[i] + 1) {R2 = M;}
				else if (C[M] < B[i] + 1) {L2 = M + 1;}
			}
			ans += L1 * (C.length - L2);
		}
		System.out.println(ans);
	}
}
