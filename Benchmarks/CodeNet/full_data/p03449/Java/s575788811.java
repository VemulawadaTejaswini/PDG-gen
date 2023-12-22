import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int width = Integer.parseInt(scanner.nextLine());
			int height = 2;

			int[][] candyLines = new int[height][width];
			int[][] sum = new int[height][width];
			for (int x = 0; x < height; x++) {
				int sumTmp = 0;
				for (int y = 0; y < width; y++) {
					candyLines[x][y] = scanner.nextInt();
					sumTmp += candyLines[x][y];
					sum[x][y] = sumTmp;
				}
			}

			int maxCandy = 0;
			for (int i = 0; i < width; i++) {
				int candy = sum[0][i] + sum[1][width-1] - (i-1>=0?sum[1][i-1]:0);
				if (candy > maxCandy) {
					maxCandy = candy;
				}
			}
			System.out.print(maxCandy);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
