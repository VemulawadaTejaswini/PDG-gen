import java.util.Arrays;
import java.util.Scanner;

class Key{
	int a, b;
	int[] c;

	public Key(int a, int b, int[] c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		Key[] keys = new Key[M];
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			int[] c = new int[b];
			for(int j = 0; j < b; j++) c[j] = sc.nextInt() - 1;
			keys[i] = new Key(a, b, c);
		}
		int[][] dp = new int[(1 << N)][M + 1];
		for(int i = 1; i < (1 << N); i++) Arrays.fill(dp[i], Integer.MAX_VALUE);
		Arrays.fill(dp[0], 0);


		for(int i = 0; i < (1 << N); i++) {
			for(int j = 0; j < M; j++) {
				if(dp[i][j] == Integer.MAX_VALUE) {
					if(j != 0) dp[i][j] = dp[i][j - 1];
				}
				else {
					// in i, use j
					int j_subset = 0;
					for(int elem : keys[j].c) j_subset += (1 << elem);
					dp[i | j_subset][j + 1] = Math.min(Math.min(dp[i | j_subset][j + 1], dp[i | j_subset][j]) , dp[i][j] + keys[j].a);
					dp[i][j + 1] = Math.min(dp[i][j], dp[i][j + 1]);
				}
			}
		}
		System.out.println(dp[(1 << N) - 1][M] == Integer.MAX_VALUE ? -1 : dp[(1 << N) - 1][M]);
	}
}