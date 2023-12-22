import java.math.BigDecimal;
import java.util.Scanner;

//AtCoder Grand Contest 036
//A	Triangle
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal S = new BigDecimal(sc.next());
		sc.close();

		if (S.precision() < 10) {
			System.out.println("0 0 0 1 " + S.toPlainString() + " 0");
		} else {
			// 作りかけ
			long x = 0;
			long y = 0;
			System.out.println("0 0 0 " + x + " " + y + " 0");
		}
	}
}
