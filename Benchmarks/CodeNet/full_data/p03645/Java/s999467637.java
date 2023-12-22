import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int M = s.nextInt();
			
			// 経路入力
			int[] a = new int[M];
			int[] b = new int[M];
			for (int i = 0; i < M; i++) {
				a[i] = s.nextInt();
				b[i] = s.nextInt();
			}
			
			// aが1のところを探す
			for (int i = 0; i < M; i++) {
				if (a[i] == 1) {
					// bがNのところを探す
					for (int j = 0; j < M; i++) {
						if (b[j] == N) {
							if (i == j) {
								System.out.println("POSSIBLE");
								System.exit(0);
							}
						}
					}
				}
			}
			System.out.println("IMPOSSIBLE");
		}
	}
}
