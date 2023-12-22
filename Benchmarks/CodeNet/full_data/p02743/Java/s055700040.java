import java.math.BigDecimal;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		int c = stdIn.nextInt();
		
		long f = BigDecimal.valueOf(4*a*b).longValue();
		
		
		if(f < ((c*c)-(a*c)-(b*c)-(a*c)+(a*a)+(a*b)-(b*c)+(a*b)+(b*b)) ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}

}
