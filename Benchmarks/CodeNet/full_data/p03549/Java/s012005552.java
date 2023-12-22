import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int a = 1;
		for (int i = 0; i < M; i++) {
			a *= 2;
		}
		System.out.println((1900 * M + 100 * (N - M)) * a);
	}
}