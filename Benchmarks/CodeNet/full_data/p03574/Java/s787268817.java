import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numH = scan.nextInt();
		int numW = scan.nextInt();

		char[][] charBef = new char[numH + 2][numW + 2];
		char[][] charAft = new char[numH][numW];

		for (int j = 0; j <= numW+1; j++) {
			charBef[0][j] = '.';
			charBef[numH + 1][j] = '.';
		}

		for (int i = 1; i <= numH; i++) {
			StringBuilder strSB = new StringBuilder();
			strSB.append("\\.");
			strSB.append(scan.next());
			strSB.append("\\.");
			charBef[i] = strSB.toString().toCharArray();
		}

		for (int i = 0; i < numH; i++) {
			for (int j = 0; j < numW; j++) {

				int count = 0;

				if (charBef[i + 1][j + 1] == '.') {
					if (charBef[i][j] == '#') {
						count++;
					}
					if (charBef[i + 1][j] == '#') {
						count++;
					}
					if (charBef[i + 2][j] == '#') {
						count++;
					}
					if (charBef[i][j + 1] == '#') {
						count++;
					}
					if (charBef[i + 2][j + 1] == '#') {
						count++;
					}
					if (charBef[i][j + 2] == '#') {
						count++;
					}
					if (charBef[i + 1][j + 2] == '#') {
						count++;
					}
					if (charBef[i + 2][j + 2] == '#') {
						count++;
					}
					charAft[i][j] = (char) (count + '0');
				} else {
					charAft[i][j] = '#';
				}
			}
		}

		for (int i = 0; i < numH; i++) {
			for (int j = 0; j < numW; j++) {
				System.out.print(charAft[i][j]);
			}
			System.out.println();
		}
	}
}
