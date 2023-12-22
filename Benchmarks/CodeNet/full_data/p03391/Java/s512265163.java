import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n];
		boolean[] able = new boolean[n];
		Arrays.fill(able, true);
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}
		long c = 0;
		while (true) {
			int indexA = 0;
			int indexB = 0;
			int am = 0;
			int bm = Integer.MAX_VALUE;
			boolean exist = false;
			boolean zero = true;
			for (int i = 0; i < n; i++) {
				if (a[i] != 0)
					zero = false;
				if (a[i] < b[i]) {
					exist = true;
					if (a[i] != 0 && am < b[i] - a[i]) {
						am = b[i] - a[i];
						indexA = i;
					}
					if (bm > b[i] - a[i]) {
						bm = b[i] - a[i];
						indexB = i;
					}
				}
			}
			if (!exist || zero) {
				break;
			}
			if (am == 0 && indexA == 0)
				c += 0;
			else {
				c += a[indexA];
				b[indexA]-= a[indexA];
				a[indexA] = 0;
			}
			c += bm;
			b[indexB] = a[indexB];
		}
		System.out.println(c);
	}
}