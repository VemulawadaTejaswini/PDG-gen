import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		int ans = 0;

		List<String> list = new ArrayList<>();

		String addStr = "";
		for (int i = 0; i < S.length(); i++) {
			addStr += S.charAt(i);
			if (list.indexOf(addStr) == -1) {
				list.add(addStr);
				ans++;
				addStr = "";
			}
		}
		System.out.println(ans);
	}
}

