import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

		double ans = 1;

		if (d == 0) {
			ans *= n;
		} else {
			ans *= 2 * (n - d);
		}

		while (m != 2) {
			ans = ans * (m - 1) / (m - 2);
			m--;
		}

		ans /= (long) Math.pow(n, 2);

		System.out.println(ans);
	}

}
