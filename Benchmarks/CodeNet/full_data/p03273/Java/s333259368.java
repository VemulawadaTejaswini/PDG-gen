import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] table = new String[h][w];

		for (int i=0; i<h; i++) {
			String buf = sc.next();
			if (!buf.contains("#")) {
				buf = buf.replace(".", " ");
			}

			for (int j=0; j<w; j++) {
				table[i][j] = buf.substring(j, j+1);
			}
		}


		for (int j=0; j<w; j++) {
			boolean blackFlg = false;
			for (int i=0; i<h; i++) {
				if ("#".equals(table[i][j])) {
					blackFlg = true;
				}
			}
			if (!blackFlg) {
				for (int i=0; i<h; i++) {
					table[i][j] = " ";
				}
			}
		}

		for (int i=0; i<h; i++) {
			String buf = "";
			for (int j=0; j<w; j++) {
				if (!" ".equals(table[i][j])) {
					buf = buf + table[i][j];
				}
			}
			if (!buf.isEmpty()) {
				System.out.println(buf);
			}
		}

		sc.close();
	}

}
