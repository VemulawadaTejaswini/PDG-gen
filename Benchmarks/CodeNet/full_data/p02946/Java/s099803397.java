import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int K = scan.nextInt();
		final int X = scan.nextInt();
		scan.close();

		for(int i = X - (K - 1); i < X + K; i++) {
			System.out.print(i + " ");
		}
	}

}