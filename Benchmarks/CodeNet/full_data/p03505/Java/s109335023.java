import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		if (k <= a) {
			System.out.println(1);
			return;
		}
		if (a <= b) {
			System.out.println(-1);
			return;
		}
		long goal = k - a;
		long m = a - b;
		long count = goal / m;
		if (goal % m != 0) {
			count++;
		}
		count = count * 2 + 1;
		System.out.println(count);
	}
}
