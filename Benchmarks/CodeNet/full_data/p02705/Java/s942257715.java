import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double length = 2.0 * r * Math.PI;
		System.out.println(length);
	}
}