import java.util.Scanner;

public class Main {

	private static final String CHRISTMAS_EVE_EVE_EVE = "Christmas Eve Eve Eve";

	private static final String CHRISTMAS_EVE_EVE = "Christmas Eve Eve";

	private static final String CHRISTMAS_EVE = "Christmas Eve";

	private static final String CHRISTMAS = "Christmas";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		String ans = "";

		switch (input) {
		case 22:
			ans = CHRISTMAS_EVE_EVE_EVE;
		case 23:
			ans = CHRISTMAS_EVE_EVE;
		case 24:
			ans = CHRISTMAS_EVE;
		case 25:
			ans = CHRISTMAS;

		default:
			break;
		}

		System.out.println(ans);
	}

}
