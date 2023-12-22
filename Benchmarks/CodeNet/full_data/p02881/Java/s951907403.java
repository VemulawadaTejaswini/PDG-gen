import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		in.close();

		long div = (int) Math.sqrt(n);
		while ( 0 < div ) {
			if ( n % div == 0 ) {
				long ans = n / div + div - 2;
				System.out.println(ans);
				return;
			} else {
				div--;
			}
		}
	}
}