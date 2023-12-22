import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double N = scanner.nextInt();
		double x = 0;
		x = Math.ceil(N / 2);
		double p = x / N;
//		System.out.println(x);
//		System.out.println(N);
		System.out.println(p);
	}
}