import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println(scan.nextLine().substring(0, 1)
				+ scan.nextLine().substring(1, 2)
				+ scan.nextLine().substring(2, 3));

	}
}