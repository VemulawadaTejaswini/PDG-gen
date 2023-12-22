import java.util.Arrays;
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

		// 文字列をソートして比較
		String[] sortS = new String[N];

		// 文字型の配列に変換してからソート
		// ソート済の文字型配列を文字列型に変換する
		char[] charS = new char[10];
		for(int i = 0; i < N; i++) {
			charS = s[i].toCharArray();
			Arrays.sort(charS);
			sortS[i] = String.valueOf(charS);
		}

		// ソート済の文字列を比較する
		long result = 0;
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(sortS[i].equals(sortS[j])) {
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
