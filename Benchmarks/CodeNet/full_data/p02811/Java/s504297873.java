import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int k = sc.nextInt();
			int x = sc.nextInt();
			int total = 500 * k;
			System.out.println(total >= x ? "Yes" : "No");

		}
	}
}
