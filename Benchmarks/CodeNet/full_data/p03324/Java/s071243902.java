import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int d = Integer.parseInt(tokens[0]);
		int n = Integer.parseInt(tokens[1]);

		if (d == 0) {
			if (n <= 99) {
				System.out.println(n);
			} else {
				System.out.println(101);
			}
		} else if (d == 1) {
			if (n <= 99) {
				System.out.println(n * 100);
			} else {
				System.out.println(10100);
			}
		} else {
			if (n <= 99) {
				System.out.println(n * 10000);
			} else {
				System.out.println(1010000);
			}
		}

		in.close();

	}

}
