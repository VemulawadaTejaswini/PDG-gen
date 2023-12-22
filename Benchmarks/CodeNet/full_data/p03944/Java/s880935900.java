import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int uhen = sc.nextInt();
		int jouhen = sc.nextInt();
		int sahen = 0;
		int teihen = 0;
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();

			switch (a) {
			case 1:
				sahen = Math.max(x, sahen);
				break;
			case 2:
				uhen = Math.min(x, uhen);
				break;
			case 3:
				teihen = Math.max(y, teihen);
				break;
			case 4:
				jouhen = Math.min(jouhen, y);
				break;
			}



		}
		int W = (uhen - sahen) > 0 ? uhen - sahen : 0;
		int H = (jouhen - teihen) > 0 ? jouhen - teihen : 0;

		System.out.println(H * W);

	}
}
