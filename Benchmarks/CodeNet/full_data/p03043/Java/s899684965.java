import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		int a =0;
		int now =0;
		int beforeK=0;
		while (K>0) {
			count *=2;
			if (N>=K) {
				if (beforeK==0) {
					count +=N-K+1;
				} else {
					count +=beforeK-K;
				}
				beforeK=K;
			}
			if (K>1) {
				K=K/2+K%2;
			} else {
				K/=2;
			}
			a++;
		}
		a--;
		int total = (int) Math.pow(2, a);
		total *=N;
		BigDecimal result = new BigDecimal(count);

		result = result.divide(new BigDecimal(total), 12,RoundingMode.HALF_UP);
		System.out.println(result.toPlainString());
	}
}