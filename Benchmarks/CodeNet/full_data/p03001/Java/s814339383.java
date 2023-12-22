import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		System.out.print(h * w / 2.0);
		System.out.print(" ");
		if (x == w / 2.0 && y == h / 2.0) System.out.print(1);
		else System.out.print(0);
	}
}
