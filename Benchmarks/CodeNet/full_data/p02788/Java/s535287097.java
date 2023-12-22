import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int A = sc.nextInt();
		int[][] X = new int[N][2];
		for(int i = 0; i < N; i++) {
			X[i][0] = sc.nextInt();
			X[i][1] = sc.nextInt();
		}
		Arrays.sort(X, (x, y) -> x[0] - y[0]);
		long ans = 0;
		long[] S = new long[N+1];
		int d = 1;
		for(int i = 0; i < N; i++) {
			long temp = X[i][0] + D * 2;
			while(d < N && X[d][0] <= temp)
				d++;
			long k = Math.max(0, (X[i][1] - S[i] + A - 1) / A);
			S[i+1] += S[i] + k * A;
			S[d] -= k * A;
			ans += k;
		}
		System.out.println(ans);
	}

}