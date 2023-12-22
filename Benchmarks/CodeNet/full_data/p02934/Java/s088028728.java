
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numN = s.nextInt();
		int[] integers = new int[numN];
		String val0 = "0";
		BigDecimal sum = new BigDecimal(val0);
		String val1 = "1";
		for(int i = 0; i < numN ; i++) {
			integers[i] = s.nextInt();
			BigDecimal bd = new BigDecimal(val1);
			BigDecimal bd2 = new BigDecimal(integers[i]);
			bd = bd.divide(bd2,10,BigDecimal.ROUND_DOWN);
			sum = sum.add(bd);
		}
		System.out.println(sum);
	}
}