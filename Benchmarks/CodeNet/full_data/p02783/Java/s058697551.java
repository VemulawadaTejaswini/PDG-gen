
import java.util.Scanner;

class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		double H = sc.nextInt();
		double A = sc.nextInt();

		double Answer;

		Answer = Math.ceil(H/A);

		int D = (int) Answer;

		System.out.println(D);

	}

}
