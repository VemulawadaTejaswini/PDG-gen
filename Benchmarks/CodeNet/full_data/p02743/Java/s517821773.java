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
		if (left* 1000000000 < z* 1000000000) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}