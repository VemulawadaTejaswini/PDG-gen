import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 2];
		int[] places = new int[n + 2];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			places[arr[i]] = i;
		}
		TreeSet<Integer> set = new TreeSet<>();
		set.add(0);
		set.add(n + 1);
		set.add(places[n]);
		long total = 0;
		for (int i = n - 1; i >= 1; i--) {
			int x = places[i];
			int left1 = set.lower(x);
			int left2;
			if (left1 == 0) {
				left2 = 0;
			} else {
				left2 = set.lower(left1);
			}
			int right1 = set.higher(x);
			int right2;
			if (right1 == n + 1) {
				right2 = n + 1;
			} else {
				right2 = set.higher(right1);
			}
			total += ((long) i) * ((left1 - left2) * (right1 - x) + (right2 - right1) * (x - left1));
			set.add(x);
		}
		System.out.println(total);
	}
}
