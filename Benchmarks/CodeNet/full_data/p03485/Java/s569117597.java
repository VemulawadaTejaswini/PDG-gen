import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = new BigDecimal(a + b).divide(new BigDecimal(2), BigDecimal.ROUND_UP).intValue();
		
		System.out.println(c);
	}

}