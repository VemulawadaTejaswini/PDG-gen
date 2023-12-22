import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		int[] A = new int[N];
		for(int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		int[] B = new int[N];
		for(int i = 0; i < N; i++)
			B[i] = sc.nextInt();
		Arrays.sort(B);
		int[] C = new int[N];
		for(int i = 0; i < N; i++)
			C[i] = sc.nextInt();
		Arrays.sort(C);
		for(int j = 0; j < N; j++) {
			long AB = 0, BC = 0;
			for(int i = 0; i < N; i++) {
				if(B[j] > A[i])
					AB += 1;
				else
					break;
			}
			for(int k = N-1; k >= 0; k--) {
				if(C[k] > B[j])
					BC += 1;
				else 
					break;
			}
			ans += AB * BC;
		}
		System.out.println(ans);
	}

}