import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String str = S;
		String[] S1 = str.split("");
		int num1 = Integer.parseInt(S1[0]);
		int num2 = Integer.parseInt(S1[1]);
		int num3 = Integer.parseInt(S1[2]);
		int num4 = Integer.parseInt(S1[3]);
		int N1 = num1 * 10 + num2;
		int N2 = num3 * 10 + num4;
//		System.out.println(N1);
//		System.out.println(N2);
		
		if (1 <= N1 && N1 <= 12) {
			if (1 <= N2 && N2 <= 12) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("MMYY");
			}
		} else {
			if (1 <= N2 && N2 <= 12) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		}
	}
}