import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		int scale = 50;

		BigDecimal aa = sqrt(BigDecimal.valueOf(a), scale);
		BigDecimal bb = sqrt(BigDecimal.valueOf(b), scale);
		BigDecimal cc = sqrt(BigDecimal.valueOf(c), scale);

		boolean isok = (aa.add(bb)).compareTo(cc) < 0;
		if (isok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

	public static BigDecimal sqrt(BigDecimal a, int scale) {

		BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
		if (scale < 17) {
			x = x.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
			return x;
		}

		BigDecimal b2 = new BigDecimal(2);
		for (int tempScale = 16; tempScale < scale; tempScale *= 2) {
			x = x.subtract(
					x.multiply(x).subtract(a).divide(
							x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
		}
		return x;
	}

}
