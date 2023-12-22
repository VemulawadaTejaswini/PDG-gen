import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String Nb1 = scan.next();
		int Nb2 = Integer.valueOf(Nb1);
		String Nb3 = scan.next();
		int Nb4 = Integer.valueOf(Nb3);

		int ans1 = Nb2 + Nb4;
		int ans2 = Nb2 * Nb4;
		String result = "x";

		if (ans1 == 15) {
			result = "+";
		} else if (ans2 == 15) {
			result = "*";
		} else {

		}

		System.out.println(result);

	}
}