import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] x = new String[h][w];
		int[] a = new int[h];
		int[] b = new int[w];

		for (int i = 0; i < h; i++) {
			String str = sc.next();
			for (int j = 0; j < h; j++) {
				x[i][j] = str.substring(j, j + 1);
				if (x[i][j].equals("#")) {
					a[i]++;
					b[j]++;
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < h; j++) {
				if (a[i] > 0 && b[j] > 0) {
					System.out.print(x[i][j]);
				}
			}
			if (a[i] > 0) {
				System.out.println();
			}
		}
		sc.close();
	}
}