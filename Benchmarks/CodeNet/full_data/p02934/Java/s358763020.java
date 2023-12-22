
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		double sum = 0;
		for(int i = 0; i < N; i++) {
			double num = sc.nextDouble();
			sum += 1 / num;
		}

		System.out.println(1 / sum);
	}

}
