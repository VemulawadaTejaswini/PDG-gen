import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		boolean[][] square = new boolean[height][width];
		boolean[][] bksquare = new boolean[height][width];
		for (int h = 0; h < height; h++) {
			String line = sc.next();
			for (int w = 0; w < width; w++) {
				if (line.charAt(w) == '#') {
					square[h][w] = true;
				} else {
					square[h][w] = false;
				}
			}
		}
		sc.close();
		int maxCount = 0;
		while (true) {
			boolean bl = false;
			for (int h = 0; h < height; h++) {
				for (int w = 0; w < width; w++) {
					bl = bl || !square[h][w];
				}
			}
			if (!bl) {
				break;
			} else {
				maxCount++;
			}
			for (int h = 0; h < height; h++) {
				for (int w = 0; w < width; w++) {
					if (square[h][w] && !bksquare[h][w]) {
						if (h > 0 && !square[h - 1][w]) {
							square[h - 1][w] = true;
							bksquare[h - 1][w] = true;
						}
						if (w > 0 && !square[h][w - 1]) {
							square[h][w - 1] = true;
							bksquare[h][w - 1] = true;
						}
						if (h < height - 1 && !square[h + 1][w]) {
							square[h + 1][w] = true;
							bksquare[h + 1][w] = true;
						}
						if (w < width - 1 && !square[h][w + 1]) {
							square[h][w + 1] = true;
							bksquare[h][w + 1] = true;
						}

					}
				}
			}
			bksquare = new boolean[height][width];
		}
		System.out.println(maxCount);
	}
}
