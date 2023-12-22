import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigDecimal result = BigDecimal.ONE;
		BigDecimal divisor = new BigDecimal("1000000007");
		for(int i = 1; i <= N; i++) {
			result = result.multiply(BigDecimal.valueOf(i)).remainder(divisor);
		}
		System.out.println(result.toString());
		sc.close();
	}
}
