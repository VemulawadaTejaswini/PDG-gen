
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int people = scan.nextInt();
		int margin = scan.nextInt();

		int count = 0;
		for (int i = 1;; i++) {
			if (margin * (i + 1) + i * people > total) {
				break;
			}
			count++;
		}

		System.out.println(count);



	}

}
