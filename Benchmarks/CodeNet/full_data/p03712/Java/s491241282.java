import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h, w;
		int i = 0;
		int j = 0;
		h = sc.nextInt();
		w = sc.nextInt();
		String str[] = new String[h];

		for (i = 0; i < h; i++)
			str[i] = sc.next();

		for (i = 0; i < h + 2; i++) {
			for (j = 0; j < w + 2; j++) {
				if (i == 0 || i == h + 1)
					System.out.print("#");
				else {
					if (j == 0) {
						System.out.print("#");
						System.out.print(str[i - 1]);
					}
					if (j == w + 1)
						System.out.print("#");
				}
			}
			System.out.println();
		}

	}

}
