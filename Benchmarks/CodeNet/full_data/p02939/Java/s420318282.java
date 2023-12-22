import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		List<String> list = new ArrayList<>();

		int[] pointLength = new int[S.length()];
		// 現在の文字列の長さ

		splitWord(0, S, "", pointLength, 0, new ArrayList<String>());

		System.out.println(ans);
	}

	public static int ans = 0;

	public static boolean splitWord(int index, String str, String beforeStr, int[] pointLength, int count, List<String> list){
		if (index == str.length()) {
			if (ans < count) {
				ans = count;
			}
			return false;
		}

		for (int i = 1; i < str.length() - index + 1; i++) {
			String splitword = str.substring(index, index + i);
			if (! beforeStr.equals(splitword)) {
				list.add(splitword);
				splitWord(index + i, str, splitword, pointLength, count + 1, list);
				list.remove(list.size() - 1);
			}
		}

		return false;
	}
}