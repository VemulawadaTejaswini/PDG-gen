import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = 0;
		long a[] = new long[n + 1];
		long b[] = new long[n + 1];
		long c[] = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = a[i] - b[i];
			if (c[i] != 0) {
				y = 1;
			}
		}
		long nuku=haimax(c);
		long ans = 0;
		for (int i = 1; i <= n; i++) {
			if (i!=nuku) {
				ans += b[i];
			}
		}
		if (y == 0) {
			System.out.println(0);
		} else {
			System.out.println(ans);
		}
	}




	public static long haimax(long a[]) {
		long d;
		long no=0;
		d = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (d <= a[i]) {
				d = a[i];
			no=i;
			}

		}
		return no;
	}
}