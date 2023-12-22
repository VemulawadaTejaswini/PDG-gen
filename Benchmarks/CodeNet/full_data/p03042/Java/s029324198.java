import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int n1 = Integer.parseInt(S.substring(0, 2));
		int n2 = Integer.parseInt(S.substring(3, 4));

		if (n1==0 && n2==0) {
			System.out.println("NA");
			return;
		} else if (n1==0 && n2<=12) {
			System.out.println("YYMM");
			return;
		} else if (n2==0 && n1<=12) {
			System.out.println("MMYY");
			return;
		} else if (n1<=12 && n2<=12) {
			System.out.println("AMBIGUOUS");
			return;
		} else if (n1!=0 && n1<=12 && n2>12) {
			System.out.println("MMYY");
			return;
		} else if (n2!=0 && n2<=12 && n1>12) {
			System.out.println("YYMM");
			return;
		} else {
			System.out.println("NA");
			return;
		}
	}
}
