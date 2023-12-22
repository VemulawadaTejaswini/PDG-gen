import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char a[] = new char[3];
		String str = "";
		int price = 700;

		str = scan.next();

		for (int i=0; i<3; i++) {
			if (str.charAt(i) == 'o') {
				price += 100;
			}
		}

		System.out.println(price);

		scan.close();

	}

}
