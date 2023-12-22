import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		System.out.println(BigDecimal.valueOf(Math.sqrt(a)).add(BigDecimal.valueOf(Math.sqrt(b))).compareTo(BigDecimal
				.valueOf(Math.sqrt(c))) == -1 ? "Yes" : "No");
	}
}