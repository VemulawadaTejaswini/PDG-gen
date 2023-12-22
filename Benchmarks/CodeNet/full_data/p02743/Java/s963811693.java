import java.util.*;
import java.math.BigDecimal;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		int y = 0;
		int n = 0;
		if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
			y++;
		} else {
			n++;
		}
		if (Math.sqrt(a) < Math.sqrt(c) -Math.sqrt(b)) {
			y++;
		} else {
			n++;
		}
		if (Math.sqrt(b) < Math.sqrt(c) -Math.sqrt(a)) {
			y++;
		} else {
			n++;
		}

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
		if (y >= n) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}