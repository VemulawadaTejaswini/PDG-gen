import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N + 1];
		long B[] = new long[N + 1];
		for(int i = 0; i < N + 1; i++) {
			A[i] = sc.nextLong();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(A[i] - B[i] < 0) {
				ans += A[i];
				B[i] -= A[i];
				if(A[i + 1] < B[i]) {
					ans += A[i + 1];
					A[i + 1] = 0;
				} else {
					ans += B[i];
					A[i + 1] -= B[i];
				}
			} else {
				ans += B[i];
			}
		}
		System.out.println(ans);
	}
}
