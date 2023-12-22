import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		CountNumberOfCookies countNumberOfCookies = new CountNumberOfCookies();

		System.out.println(countNumberOfCookies.getCount(A, B, T));
	}
}

class CountNumberOfCookies {
	public int getCount(int A, int B, int T) {
		int cookieCount = 0;		
		BigDecimal repeatCount = new BigDecimal((T+0.5) / A);
		cookieCount = B * repeatCount.setScale(0, BigDecimal.ROUND_DOWN).intValue();
		return cookieCount;
	}
}