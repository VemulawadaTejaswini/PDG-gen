import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long numA = scan.nextLong();
		String strS = scan.next();

		String result = "red";

		if (numA >= 3200) {
			result = strS;
		}
		System.out.println(result);
	}
}
