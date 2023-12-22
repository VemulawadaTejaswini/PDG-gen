import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		long[] A = new long[N+1];
		for(int i = 0; i <= N; i++)
			A[i] = sc.nextInt();
		long[] B = new long[N];
		for(int i = 0; i < N; i++)
			B[i] = sc.nextInt();
		ans += Math.min(A[0], B[0]);
		B[0] = Math.max(B[0] - A[0], 0);
		ans += Math.min(A[N], B[N-1]);
		B[N-1] = Math.max(B[N-1] - A[N], 0);
		for(int i = 1; i < N; i++) {
			ans += Math.min(A[i], B[i-1]);
			A[i] = Math.max(A[i] - B[i-1], 0);
			ans += Math.min(A[i], B[i]);
			B[i] = Math.max(B[i] - A[i], 0);
		}
		System.out.println(ans);

	}

}