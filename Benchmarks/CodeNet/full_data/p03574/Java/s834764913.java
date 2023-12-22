import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] list = new char[h][w];

		for(int i = 0; i < h; i++) {
			String s = sc.next();
			list[i] = s.toCharArray();
		}

		sc.close();


		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {

				if(list[i][j] == '#') {
					continue;
				}

				int c = 0;

				if(i > 0) {
					if(j > 0) {
						c += isBomb(list[i-1][j-1]);
					}
					c += isBomb(list[i-1][j]);
					if(j < w-1) {
						c += isBomb(list[i-1][j+1]);
					}
				}

				if(j > 0) {
					c += isBomb(list[i][j-1]);
				}
				c += isBomb(list[i][j]);
				if(j < w-1) {
					c += isBomb(list[i][j+1]);
				}

				if(i < h-1) {
					if(j > 0) {
						c += isBomb(list[i+1][j-1]);
					}
					c += isBomb(list[i+1][j]);
					if(j < w-1) {
						c += isBomb(list[i+1][j+1]);
					}
				}

				list[i][j] = Character.forDigit(c,  10);

			}
		}

		for(int i = 0; i < h; i++) {
			System.out.println(list[i]);
		}

	}

	private static int isBomb(char c) {
		if(c == '#') {
			return 1;
		} else {
			return 0;
		}
	}

}
