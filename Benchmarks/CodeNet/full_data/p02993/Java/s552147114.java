import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		String S = sc.next();

		char[] c = S.toCharArray();
      
		if (c[0] == c[1]) {
			System.out.println("Bad");
		} else if (c[1] == c[2]) {
			System.out.println("Bad");
		} else if (c[2] == c[3]) {
			System.out.println("Bad");
		} else {
			System.out.println("Good");
		}
	}
}