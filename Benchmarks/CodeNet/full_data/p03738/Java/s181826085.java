
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {

			System.out.println("GREATER");

		} else if (a < b) {

			System.out.println("LESS");

		} else if (a == b) {

			System.out.println("EQUAL");

		}

	}
}
