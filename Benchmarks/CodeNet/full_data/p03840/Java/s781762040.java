import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int i = Integer.parseInt(sa[0]);
		int o = Integer.parseInt(sa[1]);
		int j = Integer.parseInt(sa[3]);
		int l = Integer.parseInt(sa[4]);
		br.close();

		long ans = o;
		if ((j % 2 == 1 && l % 2 == 1 && i > 0)
				|| ((j % 2 == 1 || l % 2 == 1) && j > 0 && l > 0 && i % 2 == 1)) {
			ans += 3;
			i--;
			j--;
			l--;
		}
		ans += i / 2 * 2;
		ans += j / 2 * 2;
		ans += l / 2 * 2;
		System.out.println(ans);
	}
}
