import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int sum= a+b+c;
		
		if (sum>=22) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}

		scanner.close();
	}
}