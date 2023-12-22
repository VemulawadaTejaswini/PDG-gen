import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int pre = Integer.parseInt(S.substring(0, 2));
		int post = Integer.parseInt(S.substring(2));

		if (pre == 00 || post == 00) {
			System.out.println("NA");
		} else if(pre < 13 && post < 13) {
			System.out.println("AMBIGUOUS");
		} else if (pre < 13) {
			System.out.println("MMYY");
		} else if (post < 13) {
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}
	}
}