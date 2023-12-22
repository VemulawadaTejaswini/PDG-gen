
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		boolean tag = false;
		for (int i = 1; i < str.length() - 1; i++) {
			if (c[i - 1] != c[i + 1]) {
				tag = true;
				break;
			}
		}
		if (tag == false) {
			System.out.println("Second");
		} else {
			int[] map = new int[256];
			for (char cc : c)
				map[cc]++;
			int length = str.length() / 2;
			for (int i : map) {
				if (i > length) {
					tag = false;
					break;
				}
			}
			if (tag == false) {
				System.out.println("First");
			} else {
				if (str.length() % 2 == 0)
					System.out.println("Second");
				System.out.println("First");
			}
		}

	}
}
