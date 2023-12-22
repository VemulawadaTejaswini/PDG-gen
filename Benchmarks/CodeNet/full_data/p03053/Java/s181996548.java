import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int H = s.nextInt();
			final int W = s.nextInt();
			final int[][] A = new int[H + 2][W + 2];
			for (int h = 1; h <= H; h++) {
				char[] l = s.next().toCharArray();
				for (int w = 1; w <= W; w++) {
					if (l[w - 1] == '#') {
						A[h][w] = 1;
					}
				}
			}

			int ret = 0;
			boolean cont;
			do {
				cont = false;
				ret++;
				for (int h = 1; h <= H; h++) {
					for (int w = 1; w <= W; w++) {
						if (A[h][w] == 0) {
							cont = true;
							if (A[h - 1][w] == ret) {
								A[h][w] = ret + 1;
							} else if (A[h + 1][w] == ret) {
								A[h][w] = ret + 1;
							} else if (A[h][w - 1] == ret) {
								A[h][w] = ret + 1;
							} else if (A[h][w + 1] == ret) {
								A[h][w] = ret + 1;
							}
						}
					}
				}
			} while (cont);
			System.out.println(ret - 1);
		}
	}
}
