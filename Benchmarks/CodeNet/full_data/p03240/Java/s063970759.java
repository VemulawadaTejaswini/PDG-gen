import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		int px = 0;
		int py = 0;
		int ph = 0;

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
			if (h[i] > 0 && ph == 0) {
				px = x[i];
				py = y[i];
				ph = h[i];
			}
		}

		for (int i = 0; i <= 100; i++) {
			loop: for (int j = 0; j <= 100; j++) {
				int cx = i;
				int cy = j;
				int ch = ph + Math.abs(cx - px) + Math.abs(cy - py);

//				System.out.println(cx + ", " + cy + ", " + ch);

				for (int k = 0; k < n; k++) {
//					System.out.print("ch=" + ch + ", k=" + k + ", ");
//					System.out.println(h[k] + Math.abs(cx - x[k]) + Math.abs(cy - y[k]));
					if (ch != h[k] + Math.abs(cx - x[k]) + Math.abs(cy - y[k])) {
						continue loop;
					}
				}
				System.out.println(cx + " " + cy + " " + ch);
				System.exit(0);
			}
		}

		sc.close();
	}

}