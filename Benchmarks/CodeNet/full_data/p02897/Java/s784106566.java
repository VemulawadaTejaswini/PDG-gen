import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double a = N / 2.0 + 0.5;
		int b = (int)a;
		double ans = (double)b/N;

		System.out.println(ans);
	}

}
