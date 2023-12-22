import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// 整数の入力
		// int a = sc.nextInt();
		// スペース区切りの整数の入力
		// int b = sc.nextInt();
		// int c = sc.nextInt();
		// 文字列の入力
		// String s = sc.next();
		// 出力
		// System.out11.println((a+b+c) + " " + s);
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();

		List list = new ArrayList();

		for (int i = 1; i < s.length() + 1; i++) {
			for (int j = 0; j < s.length() - i + 1; j++) {
				String sub = s.substring(j, j + i);
				if (!list.contains(sub)) list.add(sub);
			}
		}

		Collections.sort(list);

		System.out.println(list.get(k-1));

	}

}