import java.util.*;
import java.math.BigDecimal;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		double aa = (double)a / 10000000.0;
		double bb = (double)b / 10000000.0;
		double cc = (double)c / 10000000.0;
		//System.out.println(c-a-b);
		if (2*Math.sqrt(aa*bb) < (cc-aa-bb)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		/*
		if (Math.sqrt(a) + Math.sqrt(b) - Math.sqrt(c) < 0) {
			y++;
		} else {
			n++;
		}
		if (Math.sqrt(c) - Math.sqrt(a)-Math.sqrt(b) > 0) {
			y++;
		} else {
			n++;
		}
		/*
		if (Math.sqrt(a) - Math.sqrt(c) < -Math.sqrt(b)) {
			y++;
		} else {
			n++;
		}

		if (Math.sqrt(b) - Math.sqrt(c) < -Math.sqrt(a)) {
			y++;
		} else {
			n++;
		}
		if (-Math.sqrt(c) < Math.sqrt(c)  -Math.sqrt(a)) {
			y++;
		} else {
			n++;
		}
		*/

	}
}