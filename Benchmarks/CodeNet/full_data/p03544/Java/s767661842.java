import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		BigDecimal L0 = new BigDecimal(2);
		BigDecimal L1 = new BigDecimal(1);
		BigDecimal result = new BigDecimal(0);
		if (N == 1) {
			result = new BigDecimal(1);
		} else {
			for (int i = 2; i <= N; i++) {
				result = L0.add(L1);
				L0 = L1;
				L1 = result;
			}
		}
		System.out.println(result);
	}
}