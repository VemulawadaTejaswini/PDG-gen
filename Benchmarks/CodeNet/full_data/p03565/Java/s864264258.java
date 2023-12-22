import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String sd = br.readLine();
			String t = br.readLine();

			System.out.println(ans(sd, t));
		}
	}

	private static String ans(String sd, String t) {
		int maxLength = sd.length();
		char qes = '?';

		for (int i = maxLength - t.length(); i >= 0; i--) {
			boolean flag = true;
			for (int j = 0; j < t.length(); j++) {
				char sdChar = sd.charAt(i + j);
				char tChar = t.charAt(j);

				if (sdChar != qes) {
					flag = flag && (tChar == sdChar);
				}
			}
			if (flag) {
				char[] tmp = sd.toCharArray();
				for (int j = 0; j < t.length(); j++) {
					tmp[i + j] = t.charAt(j);
				}
				return new String(tmp).replaceAll("\\?", "a");
			}
		}

		return "UNRESTORABLE";
	}
}
