import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);


		int n = scan.nextInt();
		int m = scan.nextInt();

		int a[][] = new int [n][m];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] =0;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (0 <= i-1 && n > i-1 && 0 <= j-1 && m > j-1)
				a[i-1][j-1] = task(a[i-1][j-1]);

				if (0 <= i-1 && n > i-1 && 0 <= j && m > j)
				a[i-1][j] = task(a[i-1][j]);

				if (0 <= i-1 && n > i-1 && 0 <= j+1 && m > j+1)
				a[i-1][j+1] = task(a[i-1][j+1]);

				if (0 <= i && n > i && 0 <= j-1 && m > j-1)
				a[i][j-1] = task(a[i][j-1]);

				if (0 <= i && n > i && 0 <= j && m > j)
				a[i][j] = task(a[i][j]);

				if (0 <= i && n > i && 0 <= j+1 && m > j+1)
				a[i][j+1] = task(a[i][j+1]);

				if (0 <= i+1 && n > i+1 && 0 <= j-1 && m > j-1)
				a[i+1][j-1] = task(a[i+1][j-1]);

				if (0 <= i+1 && n > i+1 && 0 <= j && m > j)
				a[i+1][j] = task(a[i+1][j]);

				if (0 <= i+1 && n > i+1 && 0 <= j+1 && m > j+1)
				a[i+1][j+1] = task(a[i+1][j+1]);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				cnt = cnt + a[i][j];
			}
		}
		System.out.println(cnt);
	}

	static int task(int a) {
		if (a == 1){
			return 0;
		} else {
			return 1;
		}
	}


}