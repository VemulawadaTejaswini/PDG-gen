

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[n];

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(sc.next()) - X;
			min = Math.min(min, Math.abs(x[i]));
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(min);
		int m = min;
		boolean flg = true;

		while (true) {

			m = min;
			flg = true;

			for (int i = 2; i < m / 2; i++) {
				if (min % i == 0) {
					min = min / i;
					list.add(min);
					flg = false;
					break;
				}
			}
			if (flg)
				break;
		}

		list.add(1);
		int ans = 0;
		boolean f = true;

		for (int i : list) {
			for (int j = 0; j < n; j++) {
				if (x[j] % i != 0) {
					flg = false;
					break;
				}
			}
			if (flg) {
				ans = i;
				break;
			}
		}

		System.out.println(ans);
	}
}
