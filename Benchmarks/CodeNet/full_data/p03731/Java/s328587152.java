import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextInt();
		int a[] = new int [n];
		long ans = 0;
		ans = n * t;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 1; i < n; i++) {
			if (a[i] - a[i - 1] < t) ans -= t - (a[i] - a[i - 1]);
		}

		System.out.println(ans);


		sc.close();

	}

}
