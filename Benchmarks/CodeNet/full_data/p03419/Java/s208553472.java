
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;

		if (n == 2 || m == 2) {
			ans = 0;
		} else if (n == 1) {
			if (m == 1)
				ans = 1;
			else
				ans = m - 2;
		} else if (m == 1) {
			ans = n - 2;
		} else {
			ans = n * m - 2 * n - (m - 2) * 2;
		}

		System.out.println(ans);
	}

}
