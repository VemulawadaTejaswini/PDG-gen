import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigDecimal a = new BigDecimal(n);

		if(n % 2 == 0) {
			n = n / 2;
		}else {
			n = n / 2 + 1;
		}

		BigDecimal b = new BigDecimal(n);

		System.out.println(b.divide(a));
	}
}
