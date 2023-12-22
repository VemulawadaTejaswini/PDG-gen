import java.math.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextInt();
		long R = sc.nextInt();
		int min = Integer.MAX_VALUE;
		BigDecimal v2019 = new BigDecimal(2019);
		for (long i = L; i < R; i++) {
			BigDecimal ii = new BigDecimal(i);
			for (long j = i + 1; j <= R; j++) {
				BigDecimal jj = new BigDecimal(j);
				BigDecimal val = ii.multiply(jj);
				int rem = val.remainder(v2019).intValue();
				if (rem < min) {
					min = rem;
				}
			}
		}
		System.out.println(min);
	}
}
