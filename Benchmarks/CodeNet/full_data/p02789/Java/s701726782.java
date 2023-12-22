import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		
		//入力表示
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		//N.Mが同じか
		 if (N == M)
			System.out.println("Yes");
		else
			System.out.println("No");
	
		scanner.close();
	}
}