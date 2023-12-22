import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			int h = sc.nextInt();
			int w = sc.nextInt();

			int count_w = 0;

			for (int i = 0; i < h; i++) {

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
					}
					else if (ch == '.') {
						flg = false;
					}
				}
			}

			if (count_w > w) {
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
