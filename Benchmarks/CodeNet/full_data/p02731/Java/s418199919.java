import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal L = new BigDecimal(sc.nextLine());
		BigDecimal div = new BigDecimal(3.0);
		BigDecimal cutNum = L.divide(div, RoundingMode.HALF_UP);

		System.out.println(cutNum.multiply(cutNum).multiply(cutNum));

	}
}