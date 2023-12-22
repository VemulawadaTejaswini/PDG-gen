import java.math.BigDecimal;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int l = stdIn.nextInt();
		
		BigDecimal a = BigDecimal.valueOf(l/3);
		
		System.out.println(a.multiply(a).multiply(a));


	}

}
