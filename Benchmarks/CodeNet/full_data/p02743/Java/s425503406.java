import java.util.*;
import java.math.BigDecimal;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		int y = 0;
		int n = 0;
		if (a+b + 2*Math.sqrt(a*b) < c) {
			y++;
		} else {
			n++;
		}
		if (a < b+c -2*Math.sqrt(c*b)) {
			y++;
		} else {
			n++;
		}
		if (b < a +c - 2 * Math.sqrt(c*a)) {
			y++;
		} else {
			n++;
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
		if (y > n) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}