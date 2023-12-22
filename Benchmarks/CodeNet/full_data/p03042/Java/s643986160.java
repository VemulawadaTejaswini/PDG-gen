import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String S = in.next();

		int front = Integer.parseInt(S.substring(0, 2));
		int back = Integer.parseInt(S.substring(2));

		// frontがYYの時
		if ( front == 0 || 13 <= front ) {

			// backがMM
			if ( 1 <= back && back <= 12 ) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		// frontがMMの時	
		} else {
			// backがYYの時
			if ( back == 0 || 13 <= back ) {
				System.out.println("MMYY");
			// backがMMの時
			} else {
				System.out.println("AMBIGUOUS");
			}
		}
	}
}