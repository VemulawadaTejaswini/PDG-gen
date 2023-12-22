import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();

		if (s[0] == s[1]) {
			System.out.println("1 2");
			return;
		}
		for (int i = 2; i < s.length; i++) {
			if (s[i - 1] == s[i]) {
				System.out.println(i + " " + (i + 1));
				return;
			}
			if (s[i - 2] == s[i]) {
				System.out.println((i - 1) + " " + (i + 1));
				return;
			}
		}
		System.out.println("-1 -1");
	}
}
