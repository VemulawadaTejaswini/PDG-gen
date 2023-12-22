import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		sc.close();
		int d[] = new int[n - 1];
		for (int i = 1; i < n; ++i) {
			for (int j = i + 1; j <= n; ++j) {
				int dij = Math.min(j - i, Math.abs(x - i) + 1 + Math.abs(j - y));
				dij = Math.min(dij, Math.abs(y - i) + 1 + Math.abs(j - x));
				d[dij - 1]++;
			}
		}
		for (int dij : d)
			System.out.println(dij);
	}
}
