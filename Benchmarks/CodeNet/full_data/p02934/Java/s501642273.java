import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			double a = scanner.nextDouble();
			a = 1 / a;
			sum += a;
		}
		System.out.println(1 / sum);
	}
}
