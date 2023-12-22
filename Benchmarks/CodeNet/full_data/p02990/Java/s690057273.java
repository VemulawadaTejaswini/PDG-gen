import java.util.Scanner;

public class Main {

	private static final long MOD = (long)Math.pow(10, 9) + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		long[][] pascal = new long[N+2][N+2];
		for(int i = 0;i < pascal.length;i++) {
			pascal[i][0] = 1;
		}
		for(int i = 0;i <= N;i++) {
			for(int j = 0;j <= i ;j++) {
				pascal[i+1][j+1] = (pascal[i][j] + pascal[i][j+1])%MOD;
			}
		}


		for(int i = 1;i <= K;i++) {
			long combi1 = pascal[N-K+1][i];
			long combi2 = pascal[K-1][i-1];
			System.out.println(combi1*combi2%MOD);
		}
	}
}