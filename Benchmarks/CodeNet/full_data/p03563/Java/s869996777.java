import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();

		int rating = 2 * g - r;

		System.out.println(rating);

		sc.close();

	}

}
