import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = scanner.nextInt();
		scanner.close();
		int menseki = a * b;
		double xMenseki = x / a;
		double remaining = menseki - xMenseki;
		double height = 2 * remaining / a;
		double theta = Math.atan(height / a);
		System.out.println(theta * 180 / Math.PI);
	}
}