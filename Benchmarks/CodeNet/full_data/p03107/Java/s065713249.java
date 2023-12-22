import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		String s = sc.next();
		String str = s, pre = "";

		while (str.length() > 1) {
			for (int i = 0; i < str.length(); i++) {
				str.substring(i, i + 1);
				if (i == str.length() - 1) {
					pre += str.substring(i, i + 1);
				} else if (!str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {

					// System.out.println("取り除く");
					i++;
				} else {
					pre += str.substring(i, i + 1);
					// System.out.println("pre:" + pre);
				}
			}
			str = pre;
			pre = "";
			if (str.length() == 2 && str.substring(0, 1).equals(str.substring(1, 2))) {
				str = "";
				break;
			}
		}

		System.out.println(s.length() - str.length());

		sc.close();
	}
}
