import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] block = new int[H][W];
		// 1は黒
		for (int h = 0; h < H; h++) {
			String[] strArray = sc.next().split("");
			int w = 0;
			for (String s : strArray) {
				if (s.equals("#")) {
					block[h][w] = 1;
				} else {
					block[h][w] = 0;
				}
				w++;
			}
		}

		int[][] cost = new int[H][W];

		for (int h = 0; h < H; h++) {
			for (int w = 0; w < W; w++) {
				int leftCost, upCost;

				if (h == 0) {
					upCost = H*W;
				} else {
					upCost = cost[h - 1][w];
				}
				if (w == 0) {
					leftCost = H*W;
				} else {
					leftCost = cost[h][w - 1];
				}

				if (h == 0 && w == 0) {
					cost[h][w] = block[h][w];
				}
				else if (leftCost > upCost) {
					cost[h][w] = block[h][w] + upCost;
				} else {
					cost[h][w] = block[h][w] + leftCost;
				}
				//System.out.println(h + ":"+  w + "->" + cost[h][w]);
			}
		}

		System.out.println(cost[H - 1][W - 1]);
	}
}
