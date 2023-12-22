import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] xn = new int[n];
		int[] yn = new int[n];
		int[] hn = new int[n];

		for (int i=0; i<n; i++) {
			xn[i] = sc.nextInt();
			yn[i] = sc.nextInt();
			hn[i] = sc.nextInt();
		}

		for (int cx=0; cx<101; cx++) {
			for (int cy=0; cy<101; cy++) {
				boolean accept = true;
				int h = hn[0] + Math.abs(xn[0] - cx) + Math.abs(yn[0] - cy);
				if (h - Math.abs(xn[0] - cx) - Math.abs(yn[0] - cy) < 0) {
					h = 0;
				}
				for (int i=1; i<n; i++) {
					int tempH = hn[i] + Math.abs(xn[i] - cx) + Math.abs(yn[i] - cy);
					if (tempH - Math.abs(xn[i] - cx) - Math.abs(yn[i] - cy) < 0) {
						tempH = 0;
					}
					if (h != tempH) {
						accept = false;
						break;
					}
				}
				if (accept) {
					System.out.println(cx + " " + cy + " " + h);
					return;
				}
			}
		}
		sc.close();
	}

}
