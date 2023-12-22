import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N * M + N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int x = N;
		
		for(int i = 0; i < M; i++) {
			int B = sc.nextInt();
			int C = sc.nextInt();
			for(int j = x; j < x + B; j++) {
				A[j] = C;
			}
			x += B;
		}
		
		Arrays.sort(A);
		
		long sum = 0;
		
		for(int i = A.length - 1; i > A.length - 1 - N; i--) {
			sum += A[i];
		}
		
		System.out.println(sum);
	}
}
