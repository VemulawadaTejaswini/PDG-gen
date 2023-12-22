import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double L = sc.nextDouble();
		double max = 0;
		double line = L / 3;

		BigDecimal bd = new BigDecimal(line * line * line);
		System.out.println(bd.toPlainString());
	}
}