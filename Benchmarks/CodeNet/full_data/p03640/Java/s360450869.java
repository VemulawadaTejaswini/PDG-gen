import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int idx = 0;
		int[][] ans = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				ans[i][j] = idx + 1;
				a[idx]--;
				if (a[idx] == 0) {
					idx++;
				}
			}
		}
		for (int i = 0; i < h; i++) {
			if (i % 2 == 1) {
				reverse(ans[i]);
			}
		}
		for (int i = 0; i < h; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < w; j++) {
				sb.append(ans[i][j]).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int tmp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = tmp;
		}
	}
}
