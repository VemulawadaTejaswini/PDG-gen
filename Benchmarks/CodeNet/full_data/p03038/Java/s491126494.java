import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] A = new long[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}

		long[] B = new long[M];
		long[] C = new long[M];
		for(int i=0; i<M; i++) {
			B[i] = sc.nextLong();
			C[i] = sc.nextLong();
		}
		
		Arrays.sort(A);

		for(int i=0; i<M; i++) {
			for(int j=0; j<B[i]; j++) {
				if(A[j] < C[i]) {
					A[j] = C[i];
				}
			}
			Arrays.sort(A);
		}
		
		long sum = 0;
		for(int i=0; i<A.length; i++) {
			sum += A[i];
		}
		
		System.out.println(sum);

	}
}
