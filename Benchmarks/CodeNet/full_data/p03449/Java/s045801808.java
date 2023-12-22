import java.util.Scanner;

public class Main {

	static int n, a[][];

	public static int solve() {
		int ans = 0, max = 0;
		for(int i = 0; i < n; ++i) {
			ans = a[0][0];
			for(int j = 0; j < n; ++j) {
				if(j < i)ans += a[0][j + 1];
				else ans += a[1][j];
			}
			max = Math.max(max,  ans);
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[2][n];
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < n; ++j)
				a[i][j] = sc.nextInt();
		}
		sc.close();
		int ans = solve();
		System.out.println(ans);
	}

}
