
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = 0;
		int b = 0;

		if (x == 2) {
			a = 2;
		} else if (x == 4 || x == 6 || x== 9 || x == 11) {
			a = 1;
		}

		if (y == 2) {
			b = 2;
		} else if (x == 4 || x == 6 || x== 9 || x == 11) {
			b = 1;
		}


		if ( a == b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
