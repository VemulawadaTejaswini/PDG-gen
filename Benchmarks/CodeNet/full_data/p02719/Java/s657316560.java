import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long k = scan.nextLong();

		n %= k;

		if(n <= Math.abs(n - k)) {
		}else {
			n = Math.abs(n - k);
		}

		System.out.println(n);
	}
}
