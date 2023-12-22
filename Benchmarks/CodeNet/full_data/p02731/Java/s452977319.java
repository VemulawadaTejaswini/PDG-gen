import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();

		double hen = L/3;

		BigDecimal bd = new BigDecimal(hen * hen * hen);
		System.out.println(bd.setScale(12, RoundingMode.HALF_UP));

	}

}
