import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int cnt = 0;
		if (k % 2 == 0) {
			int k2 = k / 2;
			int b = n / k2;
			int a = b - n / k;
			cnt += a * a * a;

			a = n / k;
			cnt += a * a * a;

		} else {
			int a = n / k;
			cnt += a * a * a;
		}

		System.out.println(cnt);
	}
}
