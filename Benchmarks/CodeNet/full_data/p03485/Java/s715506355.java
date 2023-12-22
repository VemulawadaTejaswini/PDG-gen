import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		int output;

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(Math.ceil((a+b)/2));

		scanner.close();

	}

}