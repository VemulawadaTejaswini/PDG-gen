
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), m = in.nextInt();

		int[] w = new int[n + 1];
		int[] a = new int[m], b = new int[m];

		for (int i = 0; i < m; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}

		Arrays.fill(w, 0);

		for (int i = 0; i < m; i++) {
			if(a[i] != 1) {
				++w[a[i]];
			}
			if (b[i] != 1) {
				++w[b[i]];
			}
		}
		boolean judge = true;
		for (int i = 0; i < w.length; i++) {
			if (w[i] % 2 == 1) {
				judge = false;
				break;
			}
		}
		if (judge) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
