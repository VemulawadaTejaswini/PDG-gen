import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++)
			l[i] = scan.nextInt();

		int bound = 0;
		int flag = 0;
		for (int i = 0; i < n; i++) {
			bound += l[i];

			if (bound > x) {
				System.out.println(i + 1);
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println(n + 1);
		}

	}

}