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
		ans += i / 2 * 2;
		ans += j / 2 * 2;
		ans += l / 2 * 2;
		if (i > 0 && j > 0 && l > 0) {
			long ans2 = o + 3;
			i--;
			j--;
			l--;
			ans2 += i / 2 * 2;
			ans2 += j / 2 * 2;
			ans2 += l / 2 * 2;
			ans = Math.max(ans, ans2);
		}
		System.out.println(ans);
	}
}
