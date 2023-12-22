import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int ans = 0;
		for (int i = 4; i <= m; i++) {
			for (int j = 22; j <= d; j++) {
				if (j % 10 >= 2) {
					if ((j / 10) * (j % 10) == i) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
