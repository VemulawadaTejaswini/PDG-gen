
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		int ans = 1;
		if (k >= s) {
			for (int i = k + 1; k - 3 < i; i--) {
				if (i == 0) {
					break;
				}
				ans *= i;
			}
		}
		
		System.out.println(ans);
	}
}