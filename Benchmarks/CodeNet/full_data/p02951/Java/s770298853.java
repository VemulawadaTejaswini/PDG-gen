
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			Main testA = new Main();
			System.out.println(testA.transfer(a, b, c));

			scanner.close();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("整数を入力してください");
		}
	}


	public int transfer(int a, int b, int c) {
//		if 容器2の水が全部入る、else 全部入らない
		if (a-b > c) {
			return 0;
		} else {
			return c-(a-b);
		}
	}

}

