import java.util.Scanner;

/**
 * お遊び
 *
 * @author s-sugimoto
 */
public class Main {

	/**
	 * 隠蔽
	 */
	private Main() {
	}

	/**
	 * メイン
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 100A
		double a = scanner.nextInt();
		// 100B
		double b = scanner.nextInt();
		// C
		double c = scanner.nextInt();
		// D
		double d = scanner.nextInt();
		// 砂糖は100GあたりEとけるらしい
		double e = scanner.nextInt();
		// 砂糖と水の質量の合計がF
		double f = scanner.nextInt();

		double satoumizu = 0.0;
		double satou = 0.0;
		double noudo = 0.0;
		for (int i = 0; i * a * 100 < f; i++) {
			for (int j = 0; (i * a + j * b) * 100 < f; j++) {
				// まず水の量だけ弾いた残りの容量
				double withoutWater = f - (i * a + j * b) * 100;
				// 溶かすことのできる砂糖の量
				double satouLimit = (i * a + j * b) * e;
				for (int k = 0; k * c <= satouLimit && satouLimit <= withoutWater; k++) {
					int dsSatouLimitCount = (int) ((satouLimit - k * c) / d);
					double newSatou = k * c + dsSatouLimitCount * d;
					double newSatoumizu = (i * a + j * b) * 100 + newSatou;
					if (i + j != 0 && k + dsSatouLimitCount != 0) {
						// double newnoudo = k * c + dsSatouLimitCount * d / ((i * a + j * b) * 100 + tmpSatou);
						double newnoudo = newSatou * 100 / newSatoumizu;
						System.out.println(String.format("砂糖水の量:%f,cの砂糖:%f,dの砂糖%f,総砂糖:%f,濃度:%f",
						        (i * a + j * b) * 100 + newSatou, c, d, newSatou, newnoudo));

						if (noudo < newnoudo) {
							satoumizu = (i * a + j * b) * 100 + newSatou;
							satou = newSatou;
							noudo = newnoudo;
						}
					}
				}
			}
		}

		System.out.println((int) satoumizu + " " + (int) satou);
	}
}