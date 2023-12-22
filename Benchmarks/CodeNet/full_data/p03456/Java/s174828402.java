
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = a + b;
		int d = Integer.parseInt(c);
		double e = Math.sqrt(d);

		int f = (int) e;
		if ((e - f) == 0) {
			System.out.println("Yes");

		} else {
			System.out.println("No");

		}

	}
}
