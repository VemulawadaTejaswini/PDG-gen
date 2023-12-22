import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		ArrayList<BigDecimal> arrayA = new ArrayList<>(10);
		ArrayList<BigDecimal> arrayB = new ArrayList<>(10);
		for(BigDecimal i = BigDecimal.ZERO; i.compareTo(BigDecimal.ONE) < 0; i = i.add(BigDecimal.valueOf(0.1))) {
			arrayA.add(BigDecimal.valueOf(A).add(i).divide(BigDecimal.valueOf(0.08), RoundingMode.CEILING));
			arrayB.add(BigDecimal.valueOf(B).add(i).divide(BigDecimal.valueOf(0.10), RoundingMode.CEILING));
		}

		int result = Integer.MAX_VALUE;
		for(BigDecimal a : arrayA) {
			for(BigDecimal b : arrayB) {
				if(a.compareTo(b) == 0 && a.intValue() < result) {
					result = a.intValue();
				}
			}
		}
		if(result == Integer.MAX_VALUE) {
			result = -1;
		}
		System.out.println(result);
	}
}
