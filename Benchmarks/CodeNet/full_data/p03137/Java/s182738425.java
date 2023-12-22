import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[m];
		int[] r = new int[m - 1];
		int ans = 0;

		for (int i = 0; i < m; i++) {
			x[i] = sc.nextInt();
		}
		
		Arrays.sort(x);
		
		for (int i = 0; i < m - 1; i++) {
			r[i] = x[i + 1] - x[i];
		}
		
		Arrays.sort(r);
		
		for (int i = m - 2 - (n - 1); i >= 0; i--) {
			ans += r[i];
		}

		System.out.println(ans);

		sc.close();
	}
}
