import java.text.ParseException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		switch (s) {
		case "A":
			System.out.println("T");
			break;
		case "T":
			System.out.println("A");
			break;
		case "G":
			System.out.println("C");
			break;
		case "C":
			System.out.println("G");
			break;
		}

	}

}
