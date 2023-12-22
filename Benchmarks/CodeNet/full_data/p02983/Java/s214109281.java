import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int mod = 2019;

		int l = in.nextInt();
		int r = in.nextInt();

		long IbyJ = 0;
		long min = Long.MAX_VALUE;

		for ( long i = l; i < r; i++ ) {
			for ( long j = i + 1; j <= r; j++ ) {
				IbyJ = i * j;
				min = (IbyJ % mod) < min ? (IbyJ % mod) : min;
			}
		}
		System.out.println(min);

		in.close();
	}
}