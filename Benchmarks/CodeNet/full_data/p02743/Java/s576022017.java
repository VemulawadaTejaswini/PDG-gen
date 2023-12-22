import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
			if (Math.abs(Math.sqrt(a) + Math.sqrt(b) - Math.sqrt(c)) < 1e-16) {
				System.out.println("No");
			}
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
