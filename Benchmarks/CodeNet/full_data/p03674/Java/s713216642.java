import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.valueOf(sc.nextLine());
		String str = sc.nextLine();
		String[] array = str.split(" ");
		sc.close();
		System.out.println(count);
		int n = array.length;
		for (long r = 2; r <= n; r++) {
			long beginIndexTop = 0;
			long endIndexBelow = 0;
			if (n - r > r) {
				beginIndexTop = n - r + 1;
				endIndexBelow = r;
			} else {
				beginIndexTop = r + 1;
				endIndexBelow = n - r;
			}
			
			BigDecimal multiTop = new BigDecimal(1);
			for (long i = beginIndexTop; i <= n; i++) {
				multiTop = multiTop.multiply(new BigDecimal(i));
			}
			
			BigDecimal multiBelow = new BigDecimal(1);
			for (long i = 1; i <= endIndexBelow; i++) {
				multiBelow = multiBelow.multiply(new BigDecimal(i));
			}
			
			BigDecimal div = multiTop.divide(multiBelow);
			System.out.println(div);
		}
	}

}