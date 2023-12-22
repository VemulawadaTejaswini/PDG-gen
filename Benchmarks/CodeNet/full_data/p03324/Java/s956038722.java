import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int D = scanner.nextInt();
		int N = scanner.nextInt();

		N = (N==100)?101:N;
		System.out.println((int)Math.pow(100, D)*N);

	}

}
