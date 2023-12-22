import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 奇数の時L
		// 偶数の時R
		// No出力
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("");
		int size = s.length;
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				if ("L".equals(s[i])) {
					System.out.println("No");
					return;
				}
			} else {
				if ("R".equals(s[i])) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
