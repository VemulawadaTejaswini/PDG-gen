import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] sw = new int[m][];
		for (int i = 0; i < m; i++) {
			sw[i] = new int[sc.nextInt()];
			for (int j = 0; j < sw[i].length; j++) {
				sw[i][j] = sc.nextInt();
			}
		}
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < Math.pow(2, n); i++) {
			boolean[] on = new boolean[n];
			int x = i;
			for (int j = 0; j < n; j++) {
				on[j] = (x % 2 == 1);
				x /= 2;
			}
			boolean flag = true;
			for (int j = 0; j < m; j++) {
				int ps = 0;
				for (int k = 0; k < sw[j].length; k++) {
					if (on[sw[j][k] - 1]) {
						ps++;
					}
				}
				if (ps % 2 != arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
			}
		}
		System.out.print(count);
	}
}
