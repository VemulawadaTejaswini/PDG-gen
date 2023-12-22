import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int t = sc.nextInt();
		int def = t;
		int[] a = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
		}
		while (t > 1) {
			Arrays.sort(a);
			int i=def-1;
			if (a[i-1] == 0 && a[i] == 0) break;
			if (a[i - 1] > 0 && a[i] > 0) {
				int sub = Math.min(a[i - 1], a[i]);
				a[i - 1] -= sub;
				a[i] -= sub;
				k -= sub * 2;
				if (a[i - 1] == a[i])
					t -= 2;
				else
					t -= 1;
				// System.out.println(i+","+t+","+sub+","+a[i]+","+(a[i+1]));
			}

		}
		System.out.println(k - 1);
	}

}