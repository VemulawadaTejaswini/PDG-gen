import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int multiple = 2;
		if (n < 2) {
			System.out.println(1);
		} else {
			while (multiple <= n) {
				if (multiple * 2 > n) {
					System.out.println(multiple);
					break;
				} else {
					multiple *= 2;
				}
			}
		}

	}

}
