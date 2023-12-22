import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int X = scan.nextInt();
		scan.close();

		int range = K - 1;
		int sum = X - range;
		for (int i = 0; i < (K - 1) * 2 + 1; i++) {

			System.out.println(sum);
			sum++;
		}
	}
}