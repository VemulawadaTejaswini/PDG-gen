import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();
		String[] s = new String[N];

		for(int i = 0; i < N; i++) {
			s[i] = scan.next();
		}
		scan.close();

		int[][] charCounts = new int[N][26];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 26; j++) {
				charCounts[i][j] = 0;
			}
		}

		char[][] charS = new char[N][10];
		// どの文字が何回出てくるかを数える。
		for(int i = 0; i < N; i++) {
			charS[i] = s[i].toCharArray();
			for(int j = 0; j < 10; j++) {
				charCounts[i][charS[i][j] - 'a']++;
			}
		}

		boolean flg = true;
		long result = 0;
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = 0; k < 10 ; k++) {
					if(charCounts[i][charS[i][k] - 'a'] != charCounts[j][charS[i][k] - 'a']) {
						flg = false;
						break;
					}
				}
				if(flg) {
					result++;
				}
				flg = true;
			}
		}
		System.out.println(result);
	}

}
