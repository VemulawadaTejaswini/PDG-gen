import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();

		int ans = 0;
		if (m >= 4 && d >= 22) {
			for (int i = 4; i <= m; i++) {
				for (int j = 22; j <= d; j++) {
					if (i == (j / 10) * (j % 10)) {
						ans++;
						System.out.println("i:" + i + ", j:" + j);
					}
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
