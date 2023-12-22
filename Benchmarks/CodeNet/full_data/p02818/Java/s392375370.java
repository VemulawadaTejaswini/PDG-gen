import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		double tCookie = scan.nextDouble();
		double aCookie = scan.nextDouble();
		double count = scan.nextDouble();
		scan.close();

		while (count > 0 || tCookie + aCookie > 0) {
			if (tCookie > 0) {
				tCookie--;
			} else if (aCookie > 0) {
				aCookie--;
			}
		}

		System.out.println(tCookie + " " + aCookie);
	}

}