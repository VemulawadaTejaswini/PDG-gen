import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cookie = scan.nextInt();
		int number = scan.nextInt();
		int rest = 0;

		if (number == 1) {
			rest = 0;
		} else if (cookie % number == 0) {
			rest = 0;
		} else {
			rest = 1;
		}
		System.out.println(rest);
	}
}