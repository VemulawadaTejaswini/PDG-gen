import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no1();
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			long x = sc.nextLong();
			long y = sc.nextLong();

			if (x % y == 0) {
				System.out.println("-1");
				return;
			}

			long i = 1;
			long t = x;
			while (true) {
				if (t % y != 0) {
					System.out.println(t);
					return;
				}
				if(t > 1000000000000000000L - x) {
					System.out.println("-1");
					return;
				}
				t += x;
			}
		}
	}

}
