import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	// 82-B
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		int n = s.length();
		int m = t.length();

		StringBuilder sbT = new StringBuilder(t);
		List<String> listS = new ArrayList<String>();

		for (String tmp : s.split("")) {
			int index = sbT.indexOf(tmp);
			if (index != -1) {
				sbT.deleteCharAt(index);
			} else {
				listS.add(tmp);
			}
		}

		if (n < m && listS.size() == 0) {
			System.out.println("Yes");
		} else {
			if (listS.size() == 0) {
				System.out.println("No");
			} else {
				Collections.sort(listS);
				char a = listS.get(0).charAt(0);
				if (sbT.chars().filter(c -> c > a).count() > 0L) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}

		sc.close();
	}
}