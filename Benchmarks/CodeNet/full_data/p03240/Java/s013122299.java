import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 101 * 101;
		long[][] H = new long[101][101];

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			long h = sc.nextLong();
			if (h == 0) continue;

			// h = max(H - |x - cx| - |y - cy|, 0)
			// H = h + |x - cx| + |y - cy|
			for (int j = 0; j < 101; j++) {
				for (int k = 0; k < 101; k++) {
					if (H[j][k] == -1) continue;
					long height = h + Math.abs(x - j) + Math.abs(y - k);
					if (height < 1) continue;

					if (H[j][k] == 0 || H[j][k] == height) {
						H[j][k] = height;
						continue;
					}
					H[j][k] = -1;
					count--;
				}
			}
			if (count == 1) break;
		}

		for (int i = 0; i < H.length; i++) {
			for (int j = 0; j < H.length; j++) {
				if (H[i][j] > 0) {
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print(" ");

					System.out.println(H[i][j]);
					return;
				}
			}
		}
	}
}
