import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int k = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int a = 26 - (c - 'a');
			if (a == 26) {
				sb.append('a');
			} else if (a <= k) {
				sb.append('a');
				k -= a;
			} else {
				sb.append(c);
			}
		}

		if (k > 0) {
			char c = sb.charAt(sb.length() - 1);
			int a = 26 - (c - 'a');
			k %= 26;
			if (k < a) {
				sb.setCharAt(sb.length() - 1, (char) (c + k));
			} else {
				sb.setCharAt(sb.length() - 1, (char) ('a' + (k - a)));
			}
		}
		System.out.println(sb.toString());
	}
}
