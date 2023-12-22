import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		scan.close();

		if (d == 0) {
			System.out.println(n);
		} else if (d == 1) {
			System.out.println(100 * n);
		} else {
			System.out.println(10000 * n);
		}

	}
}
