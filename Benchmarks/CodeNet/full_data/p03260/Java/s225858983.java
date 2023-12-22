import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();

		if ((a * b) % 2 == 0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}

		sc1.close();

	}

}
