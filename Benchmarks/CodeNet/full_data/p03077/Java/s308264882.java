import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long min = Long.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			long x = sc.nextLong();
			if (min > x) {
				min = x;
			}
		}
		long time = (n + min - 1) / min + 4;
		System.out.println(time);
	}
}
