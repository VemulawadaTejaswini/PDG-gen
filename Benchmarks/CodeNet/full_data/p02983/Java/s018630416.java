import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int L = sc.nextInt();
		int R = sc.nextInt();

		System.out.println((L * L + 1) % 2019);

		sc.close();
	}
}
