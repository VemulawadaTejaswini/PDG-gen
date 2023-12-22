import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
      	Scanner scan = new Scanner(System.in);
      	BigDecimal pi = new BigDecimal("3.14");
		BigDecimal in = new BigDecimal(scan.nextLine());
    	System.out.println(pi.multiply(in).multiply(new BigDecimal("2")));
    }
}