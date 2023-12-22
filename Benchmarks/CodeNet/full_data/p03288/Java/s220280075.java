
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();

		sc.close();

		if (r < 1200) {
			System.out.print("ABC");
		} else if (1200 <= r && r < 2800) {
			System.out.print("ARC");
		} else {
			System.out.print("AGC");
		}
	}
}