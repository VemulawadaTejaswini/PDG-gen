import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int k = s.nextInt();
			int[] b = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			for (int i = 0; i < k; i++) {
				b[s.nextInt()] = -1;
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 10; i++) {
				if (b[i] != -1) {
					sb.append(b[i]);
				}
			}
			String target = sb.toString();
			boolean found = false;
			while (!found) {
				String str = String.valueOf(n);
				int len = str.length();
				int i = 0;
				for (i = 0; i < len; i++) {
					if (!target.contains("" + str.charAt(i))) {
						break;
					}
				}
				if (i == len) {
					found = true;
				} else {
					n++;
				}
			}
			if (found) {
				System.out.println(n);
			}
		}
	}
}
