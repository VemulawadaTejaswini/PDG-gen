import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		scan.close();

		if (d == 0) {
			if (n == 100) {
				System.out.println("101");
			} else {
				System.out.println(n);
			}
		} else if (d == 1) {
			System.out.println(100 * n);
		} else if (d == 2) {
			System.out.println(10000 * n);
		}

	}
}
