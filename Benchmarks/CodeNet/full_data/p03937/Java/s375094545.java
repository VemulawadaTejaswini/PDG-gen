import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			int h = sc.nextInt();
			int w = sc.nextInt();

			int count_w = 0;
			int count_h = 0;

			for (int i = 0; i < h; i++) {

				boolean flg_h = false;
				String str = sc.next();

				boolean flg = false;
				for (int j = 0; j < w; j++) {

					char ch = str.charAt(j);
					if (ch == '#') {
						if (flg) {
							count_w++;
						}
						else {
							flg = true;
						}
						flg_h = true;
					}
					else if (ch == '.') {
						flg = false;
					}
				}

				if (flg_h) {
					count_h++;
				}
			}

			if (count_w > w - 1 || count_h < h) {
				System.out.println("Impossible");
			}
			else {
				System.out.println("Possible");
			}
		}
		finally {
			sc.close();
		}

	}
}
