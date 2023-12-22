import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x = Double.parseDouble(sc.next());
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());

		if (Math.abs(x - a) < Math.abs(x - b)) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
