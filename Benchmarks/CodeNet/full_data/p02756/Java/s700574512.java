import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int q = Integer.parseInt(br.readLine());
		boolean rev = false;
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			if ("1".equals(sa[0])) {
				rev = !rev;
			} else {
				StringBuilder sb2 = new StringBuilder(sa[2]);
				if ("1".equals(sa[1]) ^ rev) {
					sb = sb2.append(sb);
				} else {
					sb.append(sb2);
				}
			}
		}
		br.close();

		if (rev) {
			sb.reverse();
		}
		System.out.println(sb.toString());
	}
}
