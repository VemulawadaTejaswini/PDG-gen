import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int c = N % 500;

		if (A >= c) {
			System.out.println("Yes");

		} else {

			System.out.println("No");

		}
	}

}
