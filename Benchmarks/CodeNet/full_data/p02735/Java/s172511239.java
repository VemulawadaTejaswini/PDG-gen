import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int H = sc.nextInt();
			int W = sc.nextInt();
			String[][] masu;
			masu = new String[H][];

			// マス目作成
			for (int i = 0; i < H; i++) {
				String ichigyo = sc.next();
				masu[i] = ichigyo.split("");

			}

			// 最短距離調査

			//			int currentH = 0;
			//			int currentW = 0;
			int changedCount = 0;
			//			int remainingH = H - currentH;
			//			int remainingW = W - currentW;
			boolean tateMax = false;
			boolean yokoMax = false;
			int currentYoko = 0;
			for (int tate = 0; tate < H; tate++) {

				for (int yoko = currentYoko; yoko < W; yoko++) {
					if (tate != H - 1) {
						tateMax = true;
					}
					if (yoko != W - 1) {
						yokoMax = true;
					}

					if (yokoMax = false) {
						if (masu[tate + 1][yoko].equals(".")) {
							break;
						}
					}

					//	currentW++;
					if (tateMax = false) {
						if (masu[tate][yoko + 1].equals(".")) {
							break;
						}

						//	currentH++;

					} else {
						int tateNextWhite = 0;
						int yokoNextWhite = 0;
						for (int tatesagashi = tate; tatesagashi < H - 1; tatesagashi++) {
							if (masu[tatesagashi][yoko].equals(".")) {
								tateNextWhite++;
								break;
							} else {
								tateNextWhite++;
							}
						}
						for (int yokosagashi = tate; yokosagashi < H - 1; yokosagashi++) {
							if (masu[tate][yokosagashi].equals(".")) {
								yokoNextWhite++;
								break;
							} else {
								yokoNextWhite++;
							}
						}

						if (tateNextWhite >= yokoNextWhite) {
							if (yokoNextWhite != 0) {
								yoko += yokoNextWhite;
							}
						} else {
							if (tateNextWhite != 0) {
								tate += tateNextWhite;
							}
						}
						changedCount++;
						/*if (tate >= yoko) {
							currentW++;
						} else {
							currentH++;
						}*/

					}
					currentYoko = yoko - 1;
				}

			}

			System.out.println(changedCount);

		} finally

		{
			sc.close();
		}
	}
}
