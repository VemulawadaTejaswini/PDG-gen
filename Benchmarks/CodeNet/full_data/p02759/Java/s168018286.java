import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力
		int N = sc.nextInt();

		//ページ数
		int page = N / 2;

		//あまり
		int amari = N % 2;

		if (1 == amari) {
			System.out.println(page + 1);

		} else {
			System.out.println(page);
		}

	}

}
