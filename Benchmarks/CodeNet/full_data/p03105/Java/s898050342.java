import java.text.ParseException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int d = b / a;

		if (d < c) {
			System.out.println(d);
		} else {
			System.out.println(c);
		}

		sc.close();
	}

}
