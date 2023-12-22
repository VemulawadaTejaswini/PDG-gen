import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static private class Pat {
		List<Integer> of = new ArrayList<Integer>();;
	}

	static Pat[] pat = new Pat[26];

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		String t = in.next();
		for (int i = 0; i < pat.length; i++)
			pat[i] = new Pat();
		getPat(s);
		System.out.println(solve(t, s.length()));
	}

	private static long solve(String t, int slen) {
		long ans = 0;
		int d = 0;
		for (int i = 0; i < t.length(); i++) {
			int dn = searchPat(t.charAt(i), d);
			if (dn == 0)
				return -1;
			if (dn < 0) {
				ans += slen;
				d = 0;
				i--;
			} else
				d = dn;
		}
		return ans + d;
	}

	private static int searchPat(char c, int d) {
		int p = c - 'a';
		if (pat[p].of.isEmpty())
			return 0;
		int end = pat[p].of.size();
		if (pat[p].of.get(end - 1) <= d)
			return -1;
		return searchBin(p, d, 0, end);
	}

	private static int searchBin(int p, int d, int s, int e) {
		if (s == e)
			return pat[p].of.get(s);
		int m = (s + e) / 2;
		if (pat[p].of.get(m) > d)
			return searchBin(p, d, s, m);
		else
			return searchBin(p, d, m + 1, e);
	}

	private static void getPat(String s) {
		for (int i = 0; i < s.length(); i++)
			pat[s.charAt(i) - 'a'].of.add(i + 1);
	}
}