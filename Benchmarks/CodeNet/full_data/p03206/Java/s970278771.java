import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		final String C = "Christmas";
		final String E = " Eve";

		switch (day) {
		case 25:
			System.out.println(C);
			break;
		case 24:
			System.out.println(C + E);
			break;
		case 23:
			System.out.println(C + E + E);
			break;
		case 22:
			System.out.println(C + E + E + E);
			break;
		}

	}

}
