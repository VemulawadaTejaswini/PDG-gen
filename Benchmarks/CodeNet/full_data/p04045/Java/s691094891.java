package abc42;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] strs = s.split(" ");
		List<Character> d = new ArrayList<>();
		for (String str : strs) {
			char[] c = str.toCharArray();
			for (char c1 : c) {
				d.add(c1);
			}
		}

		String str;
		char[] c;
		boolean isGood = false;
		if (d.size() == 10) {
			return;
		}
		while (true) {
			str = String.valueOf(n);
			c = str.toCharArray();
			for (int i = 0; i < str.length(); i++) {
				if (d.contains(c[i])) {
					break;
				}
				if (i == str.length() - 1) {
					isGood = true;
				}
			}

			if (isGood) {
				System.out.println(n);
				return;
			}
			n++;
		}

	}
}
