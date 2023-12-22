import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray();
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			List<Character> chars = new ArrayList<>();
			for (int j = 0; j < r - l + 1; j++) {
				chars.add(s[l - 1 + j]);
			}
//			chars.forEach(System.out::print);
//			System.out.println();
			while (chars.size() != 0 && changeI(chars));
			if (chars.size() == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			} ;
		}
	}
	private static boolean changeI(List<Character> chars) {
		int point = sameI(chars);
		if (point == -1) {
			return false;
		} else if (chars.get(point) == 'z') {
			chars.remove(point);
			chars.remove(point);
		} else {
			int a = chars.get(point) + 1;
			chars.set(point, (char) a);
			chars.remove(point + 1);
		}
//		chars.forEach(System.out::print);
//		System.out.println();
		return true;
	}

	private static int sameI(List<Character> a) {
		char tmp = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			if (tmp == a.get(i)) {
				return i - 1;
			}
			tmp = a.get(i);
		}
		return -1;
	}
}
