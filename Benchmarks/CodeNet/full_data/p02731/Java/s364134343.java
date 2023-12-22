import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		double tmp = (double)L / 3;

		System.out.println(BigDecimal.valueOf(Math.pow(tmp, 3)).toPlainString());
	}
}