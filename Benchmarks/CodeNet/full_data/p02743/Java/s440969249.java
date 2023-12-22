import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author wuyue
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		double k = sc.nextDouble();
		
		if (Math.sqrt(n) + Math.sqrt(m) < Math.sqrt(k)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
	}

}
