import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = k; i < n; i += (k - 1)) {
			ans++;
		}

		System.out.println(ans + 1);

		sc.close();

	}

}
