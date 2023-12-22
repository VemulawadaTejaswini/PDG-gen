import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Double d = 0.0;
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < a; i++) {
			d += 1 / scan.nextDouble();
		}
		System.out.println(1 / d);
		scan.close();
	}
}