
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		switch(S) {
		case "Sunny":
			System.out.println("Sunny");
			break;
		case "Coudy":
			System.out.println("Rainy");
			break;
		case "Rainy":
			System.out.println("Synny");
			break;
		}

	}
}