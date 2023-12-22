import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, p, x;
		int[] t = new int[100];
		n = sc.nextInt();
		int[] xdiff = new int[100];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			p = sc.nextInt();
			x = sc.nextInt();
			xdiff[i] = t[p-1] - x;
			//System.out.println(t[p-1] + "-" + x);
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += t[i];
		}
		for (int i = 0; i < m; i++) {
			int result = sum - xdiff[i];
			System.out.println(result);
		}
	}
}
