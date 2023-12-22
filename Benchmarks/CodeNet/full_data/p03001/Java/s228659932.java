import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double W = sc.nextDouble();
			double H = sc.nextDouble();
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			System.out.println(W * H / 2 + " " + (x * 2 == W && y * 2 == H ? "1" : "0"));
		}
	}
}