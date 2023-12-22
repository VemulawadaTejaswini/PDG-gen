import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();

		int x[][] = new int[N][D];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int ans =0;
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {

				int dis =0;

				for (int k = 0; k < D; k++) {
					dis += (int) Math.pow(x[i][k]-x[j][k], 2);
				}
				for (int k = 0; k < 200; k++) {
					if (dis < Math.pow(k, 2)) {
						break;
					}
					if (dis == Math.pow(k, 2)) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
