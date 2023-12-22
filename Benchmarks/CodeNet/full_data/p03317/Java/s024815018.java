import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int ans = 1;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		ans += n / k;
		
		System.out.println(ans);

		sc.close();
	}
}