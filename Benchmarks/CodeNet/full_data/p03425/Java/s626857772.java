import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[5];
		for (int i = 0; i < n; i++) {
			String[] s = sc.next().split("");
			if (s[0].equals("M"))
				a[0]++;
			if (s[0].equals("A"))
				a[1]++;
			if (s[0].equals("R"))
				a[2]++;
			if (s[0].equals("C"))
				a[3]++;
			if (s[0].equals("H"))
				a[4]++;
		}
		long ans = 0;
		ans += a[0] * a[1] * a[2];
		ans += a[1] * a[2] * a[3];
		ans += a[2] * a[3] * a[4];
		ans += a[0] * a[2] * a[3];
		ans += a[0] * a[2] * a[4];
		ans += a[0] * a[3] * a[4];
		ans += a[0] * a[1] * a[3];
		ans += a[0] * a[1] * a[4];
		ans += a[1] * a[2] * a[4];
		ans += a[1] * a[3] * a[4];
		System.out.println(ans);
	}
}