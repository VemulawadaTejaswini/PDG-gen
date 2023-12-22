import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double X = 0;

		X = N / 1.08;

		if (N == (int)(Math.ceil(X) * 1.08)) {
			System.out.println((int)Math.ceil(X));
		} else {
			System.out.println(":(");
		}
	}
}
