import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String S1 = S.substring(0, 2);
		String S2 = S.substring(2, 4);

		if (01 <= Integer.parseInt(S1) && Integer.parseInt(S1) <= 12
				&& 01 <= Integer.parseInt(S2) && Integer.parseInt(S2) <= 12) {
			System.out.println("AMBIGUOUS");
		} else if (00 <= Integer.parseInt(S1) && Integer.parseInt(S1) <= 99
				&& 01 <= Integer.parseInt(S2) && Integer.parseInt(S2) <= 12) {
			System.out.println("YYMM");
		} else if (00 <= Integer.parseInt(S2) && Integer.parseInt(S2) <= 99
				&& 01 <= Integer.parseInt(S1) && Integer.parseInt(S1) <= 12) {
			System.out.println("MMYY");
		} else {
			System.out.println("NA");
		}
	}

}