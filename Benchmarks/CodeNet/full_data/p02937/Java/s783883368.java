
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			String t = sc.next();
			char[] sArray = s.toCharArray();
			char[] tArray = t.toCharArray();

			int loop = 0;
			int tmp = 0;
			for (char c : tArray) {
				boolean look = false;
				for (int i = tmp; i < s.length(); i++) {
					if (c == sArray[i]) {
						tmp = i + 1;
						look = true;
						break;
					}
				}
				if (!look) {
					loop++;
					for (int i = 0; i < tmp; i++) {
						if (c == sArray[i]) {
							tmp = i + 1;
							look = true;
							break;
						}
					}
				}
				if (!look) {
					System.out.println(-1);
					return;
				}
			}
			System.out.println((loop * s.length()) + tmp);
		}
	}
}
