import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = A * B;

		if (X % 2 == 0) {

			System.out.println("Even");

		} else {

			System.out.println("Odd");

		}
	}
}
