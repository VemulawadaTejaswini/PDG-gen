import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
		long c = scn.nextLong();

		double x = (double) Math.sqrt(a);
		double y = (double) Math.sqrt(b);
		double z = (double) Math.sqrt(c);
		double left = (double) x + y;
		if (left == z) {
			String ans = Val(a, b, c);
			System.out.println(ans);
		} else if (left < z) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static String Val(long a, long b, long c) {
		long p = c - a - b;
		if (p < 0) {
			return "NO";
		}
		double x1 = (double) p / 2;
		x1 = (double) Math.pow(x1, 2);
		double x2 = (double) a * b;
		if (x2 < x1) {
			return "Yes";
		}
		return "No";
	}
}