import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Ma = sc.nextInt();
		int Mb = sc.nextInt();
		int []a = new int[N];
		int []b = new int[N];
		int []c = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();
		int n = 401;
		int [][]dp = new int[n][n];
		for(int i = 0; i < N; i++) {
			dp[a[i]][b[i]] = c[i];
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(dp[i][j] > 0) {
					for(int k = 0; k < N; k++) {
						int A = i + a[k];
						int B = j + b[k];
						dp[A][B] = Math.min(dp[A][B], dp[i][j] + c[k]);
					}
				}
			}
		}
		int init = 100000000;
		int min = init;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(dp[i][j] > 0) {
					if(i * Mb == j * Ma) {
						min = Math.min(min, dp[i][j]);
					}
				}
			}
		}
		if(min == init) min = -1;
		System.out.println(min);
	}
}