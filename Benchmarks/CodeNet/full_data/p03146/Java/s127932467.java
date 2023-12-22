import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] a = new int[1000001];
		a[1] = s;
		Set<Integer> set = new TreeSet<>();
		set.add(s);
		for (int i = 2; i <= 1000000; i++) {
			if ((a[i - 1]) % 2 == 0) {
				a[i] = a[i - 1] / 2;
			} else {
				a[i] = 3 * a[i - 1] + 1;
			}
			if (set.contains(a[i])) {
				System.out.println(i);
				break;
			} else {
				set.add(a[i]);
			}
		}
	}
}