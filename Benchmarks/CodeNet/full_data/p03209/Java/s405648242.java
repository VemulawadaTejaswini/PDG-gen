import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long X = scn.nextLong();
		long[] A = new long[N + 1];
		long[] P = new long[N + 1];
		A[0] = 1;
		P[0] = 1;
		for(int i = 1;i <= N;i++) {
			A[i] = 2 * A[i-1] + 3;
			P[i] = 2 * P[i-1] + 1;
		}

		long ans = 0;
		int k = N;
		int n = N;
		while(X >0) {
			for(;k >= 0;k--) {
				if(X >= A[k] + (n-k)) {
					ans += P[k];
					X -= A[k] + (n - k);
					n = k;
					if(X > 0) {
						ans++;
						X--;
					}
					break;
				}
			}
			if(k == -1) {
				break;
			}
		}

		System.out.println(ans);

	}
}
