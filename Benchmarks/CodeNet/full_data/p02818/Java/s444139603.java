import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long k = sc.nextLong();
			if(a > k) {
				System.out.println(0 + " " + b);
			} else if(b < k - a) {
				System.out.println("0 0");
			} else {
				System.out.println(0 + " " + (b - (k - a)));
			}
		}

	}

}
