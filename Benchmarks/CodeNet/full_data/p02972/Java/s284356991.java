import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int a[] = new int[N];
		boolean tf[][] = new boolean[N][N];
		int ans[] = new int[N];
		int sum = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			for (int j = i; i < N; i++) {
				tf[i][j] = false;
				if (i == 0 || j % i == 0) {
					tf[i][j] = true;
				}
			}
		}

		for (int i = N; i <= 0; i--) {
			for (int j = N; j <= i; j--) {
				if (tf[i][j]) {
					if (a[i] == 1) {
						a[i] = 0;
					} else {
						a[i] = 1;
					}
				}
			}
			ans[i] = a[i];
			sum += ans[i];
		}

		System.out.println(sum);
		for (int i = 0; i < N; i++) {
			if (ans[i] == 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}
};