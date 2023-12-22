import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		List<String> list = new ArrayList<String>();
		boolean result = false;
		for (int i = 0; i < n; i++) {
			final String str = sc.next();
			final String prevStr = i == 0 ? null : list.get(i - 1).substring(list.get(i - 1).length() - 1);

			if (list.contains(str)) {
				result = true;
				break;
			}
			if (i > 0 && !str.substring(0, 1).equals(prevStr)) {
				result = true;
				break;
			}
			list.add(str);
		}

		System.out.println(result ? "No" : "Yes");

	}

}
