import java.util.Scanner;

public class Main {

	private static final int MOD = (int) 1E9 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int cnt = 0;
		for(int i = 0;i < N-1;i++) {
			for(int j = i+1;j < N;j++) {
				if(A[i] > A[j]) {
					cnt++;
				}
			}
		}
		int sum = 0;
		if(cnt > 0) {
			int sum1 = cnt*K*2%MOD;
			int sum2 = K*(K-1)%MOD;
			sum = (sum1+sum2)/2%MOD;
		}
		System.out.println(sum%MOD);
	}
}