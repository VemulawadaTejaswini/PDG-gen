import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] divide = { "dream", "dreamer", "erase", "eraser" };
			// jisyo mojiretu wo hanten suru
			for (int i = 0; i < divide.length; i++) {
				String tmp = divide[i];

				StringBuilder builder = new StringBuilder(tmp);
				divide[i] = builder.reverse().toString();
			}

			StringBuilder s = new StringBuilder(scanner.next().toString());
			// mojiretu wo hanten suru
			s.reverse();

			boolean flg = false;
			for (int i = 0; i < s.toString().length();) {
				for (String tmp : divide) {
					String str = i + tmp.length() >=
							s.length() ? s.toString().substring(i, s.length()) : s.toString().substring(i, i + tmp.length());
					if (str.equals(tmp)) {
						flg = true;
						i+= tmp.length();
					}
				}
				if (!flg) {
					break;
				}
			}
			System.out.println(flg == true ? "Yes" : "No");
		}
	}
}