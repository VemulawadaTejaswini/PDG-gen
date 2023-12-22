import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		if ((A + B) > (C + D)) {

			System.out.println("Left");

		} else if ((A + B) < (C + D)) {

			System.out.println("Right");

		} else if ((A + B) == (C + D)) {

			System.out.println("Balanced");

		}

	}
}
