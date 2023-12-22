import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int[] b = new int[m];
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		int[][] a = new int[n][m];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Integer.parseInt(sc.next());
			}
		}
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j] * b[j];
			}
			if (sum + c > 0) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}