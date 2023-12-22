
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = Integer.parseInt(scan.next());
		int B = Integer.parseInt(scan.next());

		if (A % 2 == 0 || B % 2 == 0) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
