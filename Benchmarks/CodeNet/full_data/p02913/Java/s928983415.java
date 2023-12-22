import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		// char[] s = in.next().toCharArray();

		// あり得る長さの最大側から見ていく
		int ans = 0;
		for ( int len = n / 2; len > 0; len-- ) {

			for ( int st = 0; st + len - 1 < n; st++ ) {
				String temp = s.substring(st, st + len);

				if ( s.indexOf(temp, st + len) > st ) {
					System.out.println(len);
					return;
				}
			}
		}
		System.out.println(0);
		in.close();
	}
}