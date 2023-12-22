import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		boolean hante = true;
		String code = "";
		for (int i = 0; i < S.length(); i++) {
			if (code.equals(String.valueOf(S.charAt(i))) && i != 0) {
				hante = false;
				break;
			}
			code = String.valueOf(S.charAt(i));
		}
		if (hante) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}

	}
}
