import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int N;
	static int K;

	static int[] a;

	static boolean[][] memo;
	static boolean[][] flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();

		a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();

		}

		memo = new boolean[K/a[0]][K + 1];
		flag = new boolean[K/a[0]][K + 1];
		for(int i = 0; i < flag.length; i++) {
			Arrays.fill(flag[i], false);
		}

		boolean first = dp(0, K);

		if(first)
			System.out.println("First");
		else
			System.out.println("Second");
		sc.close();
	}

	static boolean dp(int i, int n) {
		boolean turn_1 = (i % 2 == 0);
		if(n < 0)
			if(turn_1)	//player1s turn
				return true;
			else			//player2s turn
				return false;

		if(flag[i][n])		//return memo
			return memo[i][n];

		flag[i][n] = true;	//set memoflag

		boolean ans;

		if(turn_1) {
			ans = false;
			for(int j = 0; j < N; j++) {
				if(dp(i + 1, n - a[j])) {
					ans = true;
				}
			}
		}
		else {
			ans = true;
			for(int j = 0; j < N; j++) {
				if(!dp(i + 1, n - a[j])) {
					ans = false;
				}
			}
		}
		return memo[i][n] = ans;
	}
}