import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if (n == 1) {
			System.out.println(0);
			return;
		}
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			b[i]=a[i];
		}
		Arrays.sort(b);
		long a1 = 0, a2 = Long.MAX_VALUE;
		for(int c = (int)b[n / 2 - 1] - 100; i < (int)b[n / 2] + 100; i++) {
			a1 = 0;
			for (int i = 0; i < n; i++) {
				a1 += Math.abs(a[i] - (c - n / 2 + i));
			}
			a2 = Math.min(a2, a1);
		}
		System.out.println(a2);
	}
}
