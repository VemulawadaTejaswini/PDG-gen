import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		int ansX = 0;
		int ansY = 0;
		int ansH = 0;
		boolean flag = true;
		for (int tmpX = 0; tmpX <= 100; tmpX++) {
			for (int tmpY = 0; tmpY <= 100; tmpY++) {
				flag = true;
				int tmpH = Math.abs(tmpX - x[0]) + Math.abs(tmpY - y[0]) + h[0];
				for (int j = 1; j < n; j++) {
					int hh = Math.max(tmpH - Math.abs(tmpX - x[j]) - Math.abs(tmpY - y[j]), 0);
					if (h[j] != hh) {
						flag = false;
						break;
					}
				}
				if (flag) {
					ansH = tmpH;
					ansY = tmpY;
					break;
				}
			}
			if (flag) {
				ansX = tmpX;
				break;
			}
		}
		System.out.println(ansX + " " + ansY + " " + ansH);
	}
}
