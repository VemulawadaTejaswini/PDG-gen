import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			A[i] -= i+1;
			B[i] = A[i];
		}Arrays.sort(B);

		int[] ans = new int[B[N-1]-B[0]+1];
		for(int j=B[0]; j<B[N-1]; j++) {
			for(int k=0; k<N; k++) {
				ans[j] += Math.abs(A[k] - j);
			}
		}Arrays.sort(ans);

		System.out.println(ans[0]);

	}

}
