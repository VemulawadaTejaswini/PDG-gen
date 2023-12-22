import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] keys = {
			"dream",
			"dreamer",
			"erase",
			"eraser" };
		while (s.length() != 0) {
			look: {
				for (int i = 0; i < keys.length; i++) {
					if (s.endsWith(keys[i])) {
						s = s.substring(0, s.length() - keys[i].length());
						break look;
					}
				}
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
