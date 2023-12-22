import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A1 = input.nextInt();
		int A2 = input.nextInt();
		int A3 = input.nextInt();

		int cost = 0;
		if (A1 > A2) {
			// 3番目のコストを算出
			cost = A3 - A1;
			cost += A2 - A3;
		} else {
			cost = A1 - A2;
			cost += A2 - A3;
		}
		input.close();
	}
}
