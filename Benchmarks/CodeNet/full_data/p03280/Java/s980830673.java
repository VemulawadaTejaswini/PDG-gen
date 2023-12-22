import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int W = scanner.nextInt();
		
		scanner.close();

		int Hatake = H * W;
		int Michi = H + W - 1;
		int A = Hatake - Michi;
		

		System.out.println(A);

	}
}