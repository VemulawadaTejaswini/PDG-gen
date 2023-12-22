import java.util.Scanner;

public class AtCorder091 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (((a >= 1) && (a <= 500)) && ((b >= 1) && (b <= 500)) && ((c >= 1) && (b <= 1000))) {
			if ( c <= a + b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
