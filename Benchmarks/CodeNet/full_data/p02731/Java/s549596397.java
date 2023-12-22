import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int l = scan.nextInt();
		double a = l/3.0;
		double b = (l-a)/2.0;
		double c = l-a-b;

		System.out.println(a*b*c);

	}
}