import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		if (n == 1) {
			System.out.println(m - 2);
		} else if (m == 1) {
			System.out.println(n - 2);
		} else {
			System.out.println((n - 2) * (m - 2));
		}
	}
}