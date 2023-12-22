import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			int i = sc.nextInt();
			
			BigDecimal n = new BigDecimal(countNumOdd(i));
			
			System.out.println(n);
		
		}
	}
	
	private static String countNumOdd(int i) {
		
		int oddCount = i / 2;
		if(i % 2 != 0)
			++oddCount;
		
		BigDecimal bigDecimal = new BigDecimal(oddCount);

		BigDecimal oddProbability = bigDecimal.divide(new BigDecimal(i));
		
		DecimalFormat decimalFormat = new DecimalFormat("0.0000000000");
		
		return decimalFormat.format(oddProbability);
	}
}
