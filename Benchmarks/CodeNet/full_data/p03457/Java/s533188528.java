import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] txy = new int[3][n+1];
		txy[0][0] = 0;
		txy[1][0] = 0;
		txy[2][0] = 0;
		for (int i = 1 ; i <= n ; i++) {
			txy[0][i] = sc.nextInt();
			txy[1][i] = sc.nextInt();
			txy[2][i] = sc.nextInt();
		}
		for (int i = 1 ; i <= n ; i++) {
			int a = Math.abs(txy[0][i] - txy[0][i-1]);
			int b = Math.abs(txy[1][i] - txy[1][i-1]);
			int c = Math.abs(txy[2][i] - txy[2][i-1]);
			if (a != b + c) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}
