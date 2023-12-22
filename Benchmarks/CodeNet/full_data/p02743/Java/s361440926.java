import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;
import java.util.function.LongToDoubleFunction;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();

		double right = c - (a + b);
		right = right * right;
		double left = 4 * a * b;
		if (left < right) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
