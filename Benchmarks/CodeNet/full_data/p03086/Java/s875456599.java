import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		char s[] = scan.next().toCharArray();
		int count = 0;
		int ans = 0;

		for (char c : s) {
			if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
				count++;
			} else {
				if (ans < count) {
					ans = count;
					count = 0;
				}
			}
		}
	}

}
