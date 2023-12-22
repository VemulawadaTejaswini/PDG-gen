import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long total = 0;
		for (long idx = 1; ;idx++) {
			if (n % idx != 0) {
				continue;
			}
			long a = n / idx;
			if (n / (a - 1) == n % (a - 1)) {
				total += a - 1;
			} else {
				break;
			}
		}
		System.out.println(total);
	}
}
