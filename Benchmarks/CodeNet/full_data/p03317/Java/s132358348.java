import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int idx1 = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 1) {
				idx1 = i;
			}
		}
		sc.close();

		int ans = 0;
		if (idx1 < k || n - k <= idx1) {
			ans = (int) Math.ceil((double)(n - 1) / (k - 1));
		} else {
			ans += (int) Math.ceil((double)(idx1) / (k - 1));
			ans += (int) Math.ceil((double)(n - 1 - idx1) / (k - 1));
		}
		System.out.println(ans);
	}
}
