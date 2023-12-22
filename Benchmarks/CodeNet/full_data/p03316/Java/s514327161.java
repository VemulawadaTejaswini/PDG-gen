import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int one = number % 10;
		int two = number % 100 - one;
		int three = number % 1000 - two - one;
		int four = number % 10000 - three - two - one;
		int five = number % 100000 - four - three - two - one;
		int six = number % 1000000 - five - four - three - two - one;
		int seven = number % 10000000 - six - five - four - three - two - one;
		int eight = number % 100000000 - seven - six - five - four - three - two - one;
		int nine = number % 1000000000 - eight - seven - six - five - four - three - two - one;

		int all = one + two / 10 + three / 100 + four / 1000 + five / 10000 + six / 100000 + seven / 1000000
				+ eight / 10000000 + nine / 100000000;

		sc.close();

		if (number % all == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
