import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] a = new char[h][w];

		for (int i = 0; i < h; i++) {
			String tmpa = "";
			tmpa = sc.next();
			for (int j = 0; j < w; j++) {
				a[i][j] = tmpa.charAt(j);
			}
		}

		final char dot = '.';
		final char sharp = '#';

		int globalMax = 0;
		int localMin = h+w-2;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {

				if (a[i][j] == dot) {

					localMin = h+w-2;
					for (int k = 0; k < h; k++) {
						for (int l = 0; l < w; l++) {
							if (a[k][l] == sharp) {
								localMin = Math.min(localMin, Math.abs(i - k) + Math.abs(j - l));
							}
						}
					}
					globalMax = Math.max(localMin, globalMax);
				}
			}
		}
		System.out.println(globalMax);

	}

}
