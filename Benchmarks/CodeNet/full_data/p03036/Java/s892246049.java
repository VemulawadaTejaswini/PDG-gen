import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int ans = r * x - d;
		System.out.println(ans);

		for(int i = 1 ; i < 10; i++) {
			ans = r * ans - d;
			System.out.println(ans);
		}
	}
}
