import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();

		if ( a + b == 15) {
			System.out.println("+");
		}

		else if ( a * b == 15) {
			System.out.println("*");
		}
		else {
			System.out.println("x");
		}

		sc1.close();
	}

}