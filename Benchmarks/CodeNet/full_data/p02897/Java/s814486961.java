import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int i = countNumOdd(n);
			
			BigDecimal bigDecimal = new BigDecimal(i);
			DecimalFormat decimalFormat = new DecimalFormat("0.0000000000");			
			System.out.println(decimalFormat.format(bigDecimal));
		
		}
	}
	
	private static int countNumOdd(int i) {
		
		int oddCount = i / 2;
		if(i % 2 != 0)
			++oddCount;
		
		int oddProbability = oddCount / i;
		return oddProbability;
	}
}
