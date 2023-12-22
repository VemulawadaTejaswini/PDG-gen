import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n+1], b = new long[n];
		long c = 0;

		for(int i = 0; i < n+1; i++)
			a[i] = in.nextInt();
		for(int i = 0; i < n; i++)
			b[i] = in.nextInt();


		for(int i = 0; i < n; i++) {
			if(a[i] <= b[i]) {
				c += a[i];
				b[i] -= a[i];
			}else {
				c += b[i];
				b[i] = 0;
			}

			if(a[i+1] <= b[i]) {
				c += a[i+1];
			}else {
				c += b[i];
			}
		}

		System.out.println(c);
	}
}
