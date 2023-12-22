import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N	 = scan.nextInt();
		String S = scan.next();
		String front	= S.substring(0, S.length()/2);
		String behind	= S.substring(S.length()/2, S.length() + 1);

		if (N % 2 == 1) {
			System.out.println("No");
		} else if (front.equals(behind)) {
			System.out.println("Yes");
		}
	}
}
