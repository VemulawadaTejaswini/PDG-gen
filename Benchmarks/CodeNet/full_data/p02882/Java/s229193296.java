import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		sc.close();
		double res = 0.0;

		if(a*a*b/2.0 <= x) {
			BigDecimal atan = new BigDecimal(Math.atan(2*(a*a*b-x)/(a*a*a)));
			res = atan.doubleValue();
		}else {
			BigDecimal atan = new BigDecimal(Math.PI / 2.0 - Math.atan(2 * x / (a*b*b)));
			res = atan.doubleValue();
		}

		System.out.println(res * 180 / Math.PI);
	}
}