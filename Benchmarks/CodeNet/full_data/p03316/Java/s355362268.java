import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long number = sc.nextLong();

		long one = number % 10;
		long two = number % 100 - one;
		long three = number % 1000 - two - one;
		long four = number % 10000 - three - two - one;
		long five = number % 100000 - four - three - two - one;
		long six = number % 1000000 - five - four - three - two - one;
		long seven = number % 10000000 - six - five - four - three - two - one;
		long eight = number % 100000000 - seven - six - five - four - three - two - one;
		long nine = number % 1000000000 - eight - seven - six - five - four - three - two - one;
		long ten = number / 10 % 1000000000 - nine - eight - seven - six - five - four - three - two - one;

		long all = one + two / 10 + three / 100 + four / 1000 + five / 10000 + six / 100000 + seven / 1000000
				+ eight / 10000000 + nine / 100000000 + ten / 1000000000;


		sc.close();

		if (all == 0) {
			all += 1;
		}
		
		if (number % all == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
