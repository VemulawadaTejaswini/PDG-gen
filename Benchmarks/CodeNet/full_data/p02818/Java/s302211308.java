import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double tCookie = scan.nextDouble();
		double aCookie = scan.nextDouble();
		double count = scan.nextDouble();
		scan.close();

		if (count <= tCookie) {
			tCookie -= count;
			System.out.println(tCookie + " " + aCookie);
			return;
		}

		if (tCookie + aCookie <= count) {
			System.out.println("0 0");
			return;
		}

		System.out.println("0 " + (aCookie - count));
	}

}