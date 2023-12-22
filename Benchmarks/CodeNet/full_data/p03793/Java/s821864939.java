import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.nextLine();
			int Q = sc.nextInt();
			for (int i = 0; i < Q; i++) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				String t = S.substring(l - 1, r);
				List<Character> cArray = new ArrayList<Character>();
				for (char c : t.toCharArray()) {
					cArray.add(c);
				}
				remove(cArray);
				while (true) {
					int before = cArray.size();
					check(cArray);

					if (cArray.size() == 1 || cArray.size() == before) {
						System.out.println("No");
						break;
					} else if (cArray.size() == 0) {
						System.out.println("Yes");
						break;
					}
				}
			}
		}
	}

	private static void check(List<Character> cArray) {
		for (int i = 0; i < cArray.size() - 1; i++) {
			if (cArray.get(i) == cArray.get(i + 1)) {
				char tmp = cArray.get(i);
				cArray.remove(i + 1);
				cArray.remove(i);
				if (tmp != 'z') {
					cArray.add(i, Character.valueOf((char) (tmp + 1)));
				}
				break;
			}
		}

	}

	private static void remove(List<Character> cArray) {
		for (int i = 0; i < cArray.size() - 1; i++) {
			if (cArray.get(i) == cArray.get(i + 1)) {
				if (cArray.get(i) == 'z') {
					cArray.remove(i + 1);
					cArray.remove(i);
					if (i != 0) {
						i--;
					}
				}
			}
		}

	}
}
