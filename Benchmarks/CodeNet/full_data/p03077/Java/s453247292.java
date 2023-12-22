
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		long min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
		long time;
		if(n < min) {
			time = 5;
		} else if(n % min == 0) {
			time = n / min + 4;
		} else {
			time = n / min + 5;
		}
		System.out.println(time);
	}

}
