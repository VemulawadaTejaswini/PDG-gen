import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double a = sc.nextDouble();

		for (int i = 0; i < 4; i++) {
			a = Math.min(a, sc.nextDouble());
		}

		double ans = 4 + Math.ceil(n/a);
		System.out.println((long)ans);
		sc.close();
	}
}