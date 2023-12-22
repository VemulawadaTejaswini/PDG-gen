import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		BigDecimal x = new BigDecimal(Math.sqrt(a), MathContext.DECIMAL64);
		BigDecimal y = new BigDecimal(Math.sqrt(b), MathContext.DECIMAL64);
		BigDecimal z = new BigDecimal(Math.sqrt(c), MathContext.DECIMAL64);

		x = x.add(y);
		if(x.compareTo(z) < 0) {
			System.out.print("Yes");
		} else {
			System.out.println("No");
		}
	}

}