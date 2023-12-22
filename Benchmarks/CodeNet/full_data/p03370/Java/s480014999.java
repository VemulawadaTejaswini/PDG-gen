import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		int ans = n, min = 1000, sum = 0;
		
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			sum += m[i];
			if (m[i] < min) {
				min = m[i];
			}
		}

		ans += (x - sum)/min;

		System.out.println(ans);

		sc.close();
	}
}
