import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int input = reader.nextInt();

		int basePrice = input * 800;
		int change = input / 15 * 200;
		int finalPrice = basePrice - change;

		System.out.println(finalPrice);

		reader.close();
	}
}