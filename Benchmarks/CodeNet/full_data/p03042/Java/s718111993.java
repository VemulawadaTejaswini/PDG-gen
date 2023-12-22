import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int K;

	public static void main(String[] args) {
		String S = sc.next();

		int A = Integer.parseInt(S.substring(0, 2));
		int B = Integer.parseInt(S.substring(2, 4));

		boolean YYMM = (1 <= B && B <= 12);
		boolean MMYY = (1 <= A && A <= 12);

		if (YYMM) {
			if (MMYY) System.out.println("AMBIGUOUS");
			else System.out.println("YYMM");
		} else {
			if (MMYY) System.out.println("MMYY");
			else System.out.println("NA");
		}
	}

}