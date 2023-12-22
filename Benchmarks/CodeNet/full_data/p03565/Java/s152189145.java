import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int cnt;
	String SQ;
	String T;

	public void init() {
		N = 0;
		cnt = 0;
		SQ = "";
		T = "";
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		SQ = str;
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		T = str;
	}

	public void solve() {
		ArrayList<String> sl = new ArrayList<String>();
		for (int idx = 0; idx + T.length() <= SQ.length(); idx++) {
			String s = cnv(idx);
			if (!"".equals(s))
				sl.add(s);
		}
		if (sl.size() < 1) {
			System.out.println("UNRESTORABLE");
			return;
		}
		sl.sort(null);
		System.out.println(sl.get(0));
	}

	private String cnv(int idx) {
		for (int i = 0; i < T.length(); i++) {
			if (SQ.charAt(idx + i) != '?' && SQ.charAt(idx + i) != T.charAt(i))
				return "";
		}
		char[] ans = SQ.toCharArray();
		for (int i = 0; i < T.length(); i++) {
			ans[idx + i] = T.charAt(i);
		}
		String s = new String(ans);
		for (; s.charAt(s.length() - 1) == '?';) {
			s = s.substring(0, s.length() - 1);
		}
		ans = s.toCharArray();
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] == '?')
				ans[i] = 'a';
		}
		return new String(ans);
	}
}
