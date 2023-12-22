import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String msg = "No";

		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= 14; j++) {
				if (i * 4 + j * 7 > n) {
					break;
				}
				if (i * 4 + j * 7 == n) {
					msg = "Yes";
				}
			}
		}

		System.out.println(msg);

	}
}