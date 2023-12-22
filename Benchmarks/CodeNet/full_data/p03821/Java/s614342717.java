import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		
		long ans = 0;
		for(int i = N - 1; i >= 0; i--) {
			long cnt = 0;
			if(A[i] % B[i] > 0) {
				cnt = B[i] - (A[i] % B[i]);
			} else if(A[i] % B[i] < 0) {
				cnt = A[i] % B[i];
			}
			ans += cnt;
			for(int j = i - 1; j >= 0; j--) {
				A[j] += cnt;
			}
		}
		System.out.println(ans);
	}
}
