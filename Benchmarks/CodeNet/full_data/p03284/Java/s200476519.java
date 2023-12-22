import java.util.Scanner;

public class ProblemA {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		while (!sc.hasNext()) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			if (N/K == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
	}

}
