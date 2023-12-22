import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long bis = 1;
		if (b - a < 2 || 1 + k - 1 < a) {
			bis += k;
		} else {
			bis = a;
			int turn = (int)a - 1;
			if ((k - turn) % 2 == 0) {
				bis += (k - turn) / 2 * (b - a);
			} else {
				bis += (k - turn) / 2 * (b - a) + 1;
			}
		}
		System.out.println(bis);
	}
}