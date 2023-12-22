import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			BigDecimal p = new BigDecimal("0");
			for (int i = 1; i <= N; i++) {
				int point = i;
				BigDecimal p_sub = new BigDecimal("1");
				p_sub = p_sub.divide(BigDecimal.valueOf(N), 15, BigDecimal.ROUND_HALF_DOWN);
				while (point < K) {
					point = point * 2;
					p_sub = p_sub.divide(BigDecimal.valueOf(2));
				}
				p = p.add(p_sub);
			}
			System.out.println(p);
		}
	}
}