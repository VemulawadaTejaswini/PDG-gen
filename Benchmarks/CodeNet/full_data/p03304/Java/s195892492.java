import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

		int sum = 0;

		if (d == 0) {
			sum = n;
		} else {
			for (int i = 1; i <= n; i++) {
				if (i - d >= 1) {
					sum++;
					System.out.println(i + "+");
				}
				if (i + d <= n) {
					sum++;
					System.out.println(i + "-");
				}
			}
		}

		System.out.println((double) (m - 1) * sum / n / n);

		sc.close();
	}

}
