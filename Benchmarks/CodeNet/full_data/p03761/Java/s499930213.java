import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String[][] s = new String[n][];
		for (int i = 0; i < n; i++)
			s[i] = sc.next().split("");
		List<String> ans = new ArrayList<String>();
		for (int i = 0; i < s[0].length; i++) {
			boolean exist = true;;
			for (int j = 1; j < n; j++) {
				exist = false;
				for (int k = 0; k < s[j].length; k++) {
					if (s[0][i].equals(s[j][k])) {
						exist = true;
						s[j][k] = "";
						break;
					}
				}
				if (!exist)
					break;
			}
			if (exist)
				ans.add(s[0][i]);
		}
		Collections.sort(ans);
		for (int i = 0; i < ans.size(); i++)
			System.out.print(ans.get(i));
		System.out.println();
	}
}