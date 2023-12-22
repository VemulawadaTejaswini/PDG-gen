import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		double x = n / 3;

		System.out.println(BigDecimal.valueOf(x * x * x).toPlainString());
	}
}
