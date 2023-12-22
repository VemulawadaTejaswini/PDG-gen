import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			sum += x[i];
		}
		int p = sum / n;
		int p2 = sum / n + 1;
		int ans = 0;
		int ans2 = 0;
		for (int i = 0; i < n; i++) {
			ans += (x[i] - p) * (x[i] - p);
			ans2 += (x[i] - p2) * (x[i] - p2);
		}
		if (ans < ans2) {
			System.out.println(ans);
		} else {
			System.out.println(ans2);
		}
		sc.close();
	}
}