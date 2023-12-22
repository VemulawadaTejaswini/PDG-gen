import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double K = sc.nextDouble();

		double ans = 0;
		int c = (int)N;

		if (N>=K) {
			ans += (N-K+1);
			c = (int)K-1;
		}

		for (int i = 1; i <= c; i++) {
			long s = (int) (Math.log(K/(double)i)/Math.log(2.0)) +1;
			ans +=Math.pow((double)0.5, s);
		}
		BigDecimal Ans = BigDecimal.valueOf(ans/N);
		System.out.println(Ans);
	}
}
