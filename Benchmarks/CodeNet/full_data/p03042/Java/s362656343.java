import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int pre = Integer.parseInt(str.substring(0, 2));
		int suf = Integer.parseInt(str.substring(2, 4));

		if (pre > 0 && pre < 13) {
			if (suf > 0 && suf < 13) {
				System.out.println("AMBIGUOUS");
				return;
			}
			System.out.println("MMYY)");
			return;
		} else {
			if (suf > 0 && suf < 13) {
				System.out.println("YYMM");
				return;
			}
			System.out.println("NA");
			return;
		}
	}
}