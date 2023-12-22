import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try (Scanner sc = new Scanner(br)) {
			int len = sc.nextInt();
			int numOfQuestion = sc.nextInt();
			String str = sc.next();
			question(str, numOfQuestion, sc);
		}
	}

	private static void question(String str, int numOfQuestion, Scanner sc) {
		int[] counts = countAC(str);
		for (int i = 1; i <= numOfQuestion; i++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			System.out.println(counts[r - 1]  - (l > 0 ? counts [l - 1] : 0));
		}
	}

	// 0〜i番目の部分文字列がACの場合の数
	private static int[] countAC(String str) {
		int[] counts = new int[str.length() - 1];
		char[] chars = str.toCharArray();
		int len = chars.length;
		int count = 0;
		for (int i = 0; i < len - 1; i++) {
			if (chars[i] == 'A' && chars[i + 1] == 'C') {
				count++;
			}
			counts[i] = count;
		}
		return counts;
	}
}
