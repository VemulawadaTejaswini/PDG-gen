import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (N*A<= B) {
			System.out.println(N*A);
		}else {
			System.out.println(B);
		}
	}
}
