import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		ArrayList<String> strs = new ArrayList<String>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < Math.min(k, s.length() - i); j++) {
				if (!strs.contains(s.substring(i, i + j + 1))) {
					strs.add(s.substring(i, i + j + 1));
				}
			}
		}

		Collections.sort(strs);

		System.out.println(strs.get(k - 1));
	}
}
