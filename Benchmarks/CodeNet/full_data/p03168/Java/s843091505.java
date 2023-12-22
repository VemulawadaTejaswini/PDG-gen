import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem ThanhYeuThu = new Problem();
		ThanhYeuThu.solve();
	}
	static class Problem {
		public void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			double a[] = new double [n];
			for (int i = 0; i < n; i++) a[i] = sc.nextDouble();
			double DP[][] = new double [n][n + 1];
			double MaxValue = 1;
			DP[0][0] = MaxValue - a[0];
			DP[0][1] = a[0];
			for (int i = 1; i < n; i++) {
				for (int j = 0; j <= n; j++) {
					DP[i][j] = DP[i - 1][j] * (MaxValue - a[i]);
					if (j > 0) {
						DP[i][j] += DP[i - 1][j - 1] * a[i];
					}
				}
			}
			double Res = 0;
			for (int i = 0; i <= n; i++) {
				int j = n - i;
				if (i > j) Res += DP[n - 1][i];
			}
			System.out.printf("%.10f",Res);
		}
	}

}
