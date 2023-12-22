import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int A1 = scanner.nextInt();
		int A2 = scanner.nextInt();
		int A3 = scanner.nextInt();
		
		
		if (A1+A2+A3 >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("Win");
		}
		

		scanner.close();
	}
}