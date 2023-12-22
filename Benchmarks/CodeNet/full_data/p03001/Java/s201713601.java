import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		double height = scan.nextDouble();
		double width = scan.nextDouble();
		int x = scan.nextInt();
		int y = scan.nextInt();

		if(y + y == height && x + x == width) {
			System.out.println(height * width / 2.0 + " " + 1);
		} else {
			System.out.println(height * width / 2.0 + " " + 0);
		}

	}
}
