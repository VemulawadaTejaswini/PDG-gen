import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示

		int ab = sc.nextInt();
		int bc = sc.nextInt();
		int ca = sc.nextInt();

		int area = ab * bc / 2;
		System.out.println(area);
	}
}