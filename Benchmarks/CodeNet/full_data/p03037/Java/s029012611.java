import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int aa[][] = new int[m][n];
		int ans = 0, i, j, cnt = 0;
		int l[] = new int[m];
		int r[] = new int[m];

		for (i = 0; i < m; i++) {
			l[i] = sc.nextInt() - 1;
			r[i] = sc.nextInt() - 1;
		}

		for (i = 0; i < aa.length; i++) {
			for (j = 0; j < aa[0].length; j++) {
				if (j >= l[i] && j <= r[i]) {
					aa[i][j] = 1;
				}
			}
        }

		for (j = 0; j < aa[0].length; j++) {
			cnt = 0;
			for (i = 0; i < aa.length; i++) {
				if (aa[i][j] == 1)
					cnt++;
			}
			if (cnt == m)
				ans++;
		}
		System.out.println(ans);
	}

}
