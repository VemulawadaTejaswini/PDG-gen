import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] v = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = Integer.parseInt(sc.next());
		}
		int ans = 0;
		for (int i = 0; i < (1 << n - 1); i++) {
			int sum = 0;
			int tmp = v[0] - c[0];
			for (int j = 0; j < n - 1; j++) {
				if ((i & (1 << j)) != 0) {
					sum += tmp;
					tmp = v[j + 1] - c[j + 1];
				} else {
					tmp = v[j + 1] - c[j + 1];
				}
			}
			ans = Math.max(ans, sum + tmp);
		}
		System.out.println(ans);

		sc.close();
	}
}