import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++)
			x[i] = sc.nextInt();
		int ans = 999999999;
		int[] dist = new int[n - k + 1];





		for (int i = 0; i < n - k + 1; i++) {
			dist[i] = Math.abs(x[i + k - 1] - x[i]);

			if (Math.abs(x[i + k - 1]) >= Math.abs(x[i])) {
				dist[i] += Math.abs(x[i]);
			} else {
				dist[i] += Math.abs(x[i + k - 1]);
			}
		}





		for (int i = 0; i < n - k + 1; i++) {

			if (ans >= dist[i]) {
				ans = dist[i];
			}
		}
		System.out.println(ans);
	}

}