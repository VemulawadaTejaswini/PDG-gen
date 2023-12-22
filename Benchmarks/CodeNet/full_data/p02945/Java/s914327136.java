import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int tasu = a + b;
		int hiku = a - b;
		int kakeru = a * b;

		System.out.println(Math.max(tasu, Math.max(hiku, kakeru)));
	}

}
