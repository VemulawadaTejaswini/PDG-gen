import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		int ans1 = set.last(), ans2 = 0, diff = Integer.MAX_VALUE;

		Integer h = set.higher(ans1 / 2);
		Integer l = set.lower(ans1 / 2);
		if(h==ans1) {
			h = l;
		}
		if (ans1 % 2 == 0) {
			int base = ans1 / 2;
			if (h != null) {
				int d = Math.abs(base - h);
				if (d < diff) {
					diff = d;
					ans2 = h;
				}
			}
			if (l != null) {
				int d = Math.abs(base - l);
				if (d < diff) {
					diff = d;
					ans2 = l;
				}
			}
		} else {
			int base = ans1/2;
			int base2 = ans1/2+1;
			if (h != null) {
				int d = Math.abs(base2 - h);
				if (d < diff) {
					diff = d;
					ans2 = h;
				}
			}
			if (l != null) {
				int d = Math.abs(base - l);
				if (d < diff) {
					diff = d;
					ans2 = l;
				}
			}
		}

		System.out.println(ans1+" "+ans2);
	}
}