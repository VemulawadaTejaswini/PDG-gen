import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();

		int ans = 0;
		for (int i = 1; i <= m; i++) {
			for (int j = 10; j <= d; j++) {
				if (i == (j / 10) * (j % 10)) {
					ans++;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
