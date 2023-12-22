import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.valueOf(sc.next());
		long b = Long.valueOf(sc.next());
		long x = Long.valueOf(sc.next());
		if (a == b) {
			System.out.println(0);
			return;
		}
		long ret = (long) b / x - (long) a / x;
		if ((long) b % x == 0) {
			ret++;
		}
		System.out.println(ret);
	}
}