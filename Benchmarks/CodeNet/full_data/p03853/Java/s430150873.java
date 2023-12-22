import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		char[][] c = new char[h][w];
		for (int i = 0; i < h; i++) {
			String s = scan.next();
			for (int j = 0; j < w; j++) {
				c[i][j] = s.charAt(j);
			}
		}
		String[] sr = new String[h];
		for (int i = 0; i < h; i++) {
			sr[i] = "";
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				sr[i] = sr[i]+c[i][j];
			}
		}
		int a = 0;
		boolean f = false;
		while (a<h) {
			System.out.println(sr[a]);
			if (f == true) {
				a++;
				f = false;
			} else {
				f = true;
			}
		}
	}
}
