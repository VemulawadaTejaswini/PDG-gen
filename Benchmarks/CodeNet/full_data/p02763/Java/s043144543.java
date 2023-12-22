import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		int q = Integer.parseInt(br.readLine());
		List<TreeSet<Integer>> list = new ArrayList<>(26);
		for (int i = 0; i < 26; i++) {
			list.add(new TreeSet<>());
		}
		for (int i = 0; i < n; i++) {
			int b2 = s[i] - 'a';
			list.get(b2).add(i);
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			if ("1".equals(sa[0])) {
				int a = Integer.parseInt(sa[1]) - 1;
				int b1 = s[a] - 'a';
				int b2 = sa[2].charAt(0) - 'a';
				s[a] = sa[2].charAt(0);
				list.get(b1).remove(a);
				list.get(b2).add(a);
			} else {
				int l = Integer.parseInt(sa[1]) - 1;
				int r = Integer.parseInt(sa[2]);
				int ans = 0;
				for (int j = 0; j < 26; j++) {
					TreeSet<Integer> set = list.get(j);
					Integer x = set.ceiling(l);
					Integer y = set.lower(r);
					if (x != null && y != null && x <= y) {
						ans++;
					}
				}
				pw.println(ans);
			}
		}
		br.close();
		pw.flush();
	}
}
