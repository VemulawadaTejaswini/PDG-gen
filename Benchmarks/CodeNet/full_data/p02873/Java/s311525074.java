import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	Scanner in = new Scanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int len;
	char[] s;
	long[] cmp;

	Main() {
		s = in.next().toCharArray();
		cmp = new long[len = s.length];
		int at = 0;
		for (int i = 0; i < len; i++) {
			int j = i;
			while (j < len && s[i] == s[j])
				j++;
			cmp[at++] = j - i;
			i = j - 1;
		}

		long ans = 0;
		if (s[0] == '>') {
			for (int i = 1; i < at - 1; i += 2) {
				ans += tri(max(cmp[i], cmp[i + 1]));
				ans += tri(min(cmp[i], cmp[i + 1]) - 1);
			}
			if (at %2 == 0)
				ans += tri(cmp[at - 1]);
			ans += tri(cmp[0]);
		}
		else {
			for (int i = 0; i <= at - 2; i += 2) {
				ans += tri(max(cmp[i], cmp[i + 1]));
				ans += tri(min(cmp[i], cmp[i + 1]) - 1);
			}
			if (at %2 == 1)
				ans += tri(cmp[at - 1]);
		}

		out.println(ans);
		out.close();
	}

	long tri(long a) {
		return a*(a + 1L)/2L;
	}

	long min(long a, long b) {
		if (a < b)
			return a;
		return b;
	}
	long max(long a, long b) {
		if (a > b)
			return a;
		return b;
	}
}