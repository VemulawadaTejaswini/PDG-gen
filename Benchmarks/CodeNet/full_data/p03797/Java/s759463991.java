import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			m -= 2;
			if (m < 2) break;
			ans++;
		}

		while (m >= 4) {
			m -= 4;
			ans++;
		}

		System.out.println(ans);

		sc.close();

	}

}