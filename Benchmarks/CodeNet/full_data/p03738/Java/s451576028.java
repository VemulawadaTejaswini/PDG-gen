import java.math.*;
import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String a = sc.next();
		String b = sc.next();
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bb = new BigDecimal(b);
		int c = ba.compareTo(bb);
		if (c>0) {
			System.out.println("GREATER");
		} else if (c<0) {
			System.out.println("LESS");
		} else {
			System.out.println("EQUAL");
		}
	}
}
